package org.biblioteca.persistencia;

import org.biblioteca.beans.Servicio_biblioteca;
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
public class Servicio_bibliotecaPersistencia implements Serializable {
private static final long serialVersionUID = 1L;
public static Exception excepcion;
public static Connection con = null;

public Servicio_bibliotecaPersistencia(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
}
public static boolean Insertar (Servicio_biblioteca servicio_biblioteca ) {
	excepcion = null;
	try {
	if (!Conectar()) {
	return false;
	}
	String sql = "insert into servicio_biblioteca(id_serbib,id_biblioteca,id_perfil,id_servicio,id_documento,id_estatus,dias)  values('"+servicio_biblioteca.getId_serbib()+"','"+servicio_biblioteca.getId_biblioteca()+"','"+servicio_biblioteca.getId_perfil()+"','"+servicio_biblioteca.getId_servicio()+"','"+servicio_biblioteca.getId_documento()+"','"+servicio_biblioteca.getId_estatus()+"','"+servicio_biblioteca.getDias()+"')";
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
public void findById_serbib(Integer id_serbib) {
}
public void findById_biblioteca(Integer id_biblioteca) {
}
public void findById_perfil(Integer id_perfil) {
}
public void findById_servicio(Integer id_servicio) {
}
public void findById_documento(Integer id_documento) {
}
public void findById_estatus(Integer id_estatus) {
}
public void findByDias(Integer dias) {
}
public static List<Servicio_biblioteca> getLista(Map parametros) {
  excepcion = null;
  try {
      if (!Conectar()) {
         return null;
      }
  List<Servicio_biblioteca> list = new ArrayList<Servicio_biblioteca>();
  String sql = "select * from servicio_biblioteca";
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
       list.add(new Servicio_biblioteca(
         rs.getInt("id_serbib"),rs.getInt("id_biblioteca"),rs.getInt("id_perfil"),rs.getInt("id_servicio"),rs.getInt("id_documento"),rs.getInt("id_estatus"),rs.getInt("dias")));
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
