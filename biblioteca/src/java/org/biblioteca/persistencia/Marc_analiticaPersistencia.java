package org.biblioteca.persistencia;

import org.biblioteca.beans.Marc_analitica;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
 import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.faces.context.FacesContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.el.ELContext;
import javax.faces.model.SelectItem;
import org.biblioteca.generales.JSFUtil;


/**
*
* @author avbravo
*/

@ManagedBean
@SessionScoped
public class Marc_analiticaPersistencia implements Serializable {
private static final long serialVersionUID = 1L;
public static Exception excepcion;
public static Connection con = null;

public Marc_analiticaPersistencia(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
}
public static boolean Insertar (Marc_analitica marc_analitica ) {
	excepcion = null;
	try {
	if (!Conectar()) {
	return false;
	}
	String sql = "insert into marc_analitica(id_analitica,numero,id_dato,id_nivel,id_etiqueta,eti_padre,descripcion,id_repetido,id_usuario)  values('"+marc_analitica.getId_analitica()+"','"+marc_analitica.getNumero()+"','"+marc_analitica.getId_dato()+"','"+marc_analitica.getId_nivel()+"','"+marc_analitica.getId_etiqueta()+"','"+marc_analitica.getEti_padre()+"','"+marc_analitica.getDescripcion()+"','"+marc_analitica.getId_repetido()+"','"+marc_analitica.getId_usuario()+"')";
	Statement sta = con.createStatement();
	sta.executeUpdate(sql);
	sta.close();
	con.close();
	return true;
	} catch (Exception e) {
	excepcion = e;
	} finally {
	}
	return false;
}
public void Editar() {
}
public void Eliminar() {
}
public void Actualizar() {
}
public void findAll() {
}
public void findById_analitica(Integer id_analitica) {
}
public void findByNumero(Integer numero) {
}
public void findById_dato(Integer id_dato) {
}
public void findById_nivel(Integer id_nivel) {
}
public void findById_etiqueta(String id_etiqueta) {
}
public void findByEti_padre(String eti_padre) {
}
public void findByDescripcion(String descripcion) {
}
public void findById_repetido(Integer id_repetido) {
}
public void findById_usuario(Integer id_usuario) {
}
public static List<Marc_analitica> getLista(Map parametros) {
  excepcion = null;
  try {
      if (!Conectar()) {
         return null;
      }
  List<Marc_analitica> list = new ArrayList<Marc_analitica>();
  String sql = "select * from marc_analitica";
  if (parametros != null) {
      Iterator it = parametros.entrySet().iterator();
      StringBuilder sb = new StringBuilder("");
      while (it.hasNext()) {
        Map.Entry e = (Map.Entry) it.next();
        sb.append(e.getKey() +"="+  e.getValue());
      }
      if (!sb.toString().equals("")){
         sql = sql + " where " + sb.toString();
      }
   }
  PreparedStatement psquery = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,
                                      ResultSet.CONCUR_UPDATABLE);
   ResultSet rs = psquery.executeQuery();
   rs.next();
   int x = rs.getRow();
   if (x == 0) {
      excepcion = new Exception("No existen registros ");
      rs.close();
      psquery.close();
      con.close();
      return null;
   }
   rs.beforeFirst();
   while (rs.next()) {
       list.add(new Marc_analitica(
         rs.getInt("id_analitica"),rs.getInt("numero"),rs.getInt("id_dato"),rs.getInt("id_nivel"),rs.getString("id_etiqueta"),rs.getString("eti_padre"),rs.getString("descripcion"),rs.getInt("id_repetido"),rs.getInt("id_usuario")));
    }
    rs.close();
    psquery.close();
    con.close();
    return list;
} catch (Exception ex) {
      excepcion = ex;
}
  return null;
 }


public static boolean Conectar() {
try {
  Context ctx = new InitialContext();
  if (ctx == null) {
     JSFUtil.addSuccessMessage("No initial context");
     return false;
  }
   DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/gbi");
   if (ds == null) {
      JSFUtil.addSuccessMessage("No data source");
      return false;
   }
   con = ds.getConnection();
   if (con == null) {
      JSFUtil.addSuccessMessage("No se pudo establecer la conexión");
      return false;
   }
   return true;
  } catch (Exception ex) {
     JSFUtil.addErrorMessage(ex, "Error");
 }
    return false;
 }


}
