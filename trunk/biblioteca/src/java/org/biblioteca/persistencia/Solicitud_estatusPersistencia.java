package org.biblioteca.persistencia;

import org.biblioteca.beans.Solicitud_estatus;
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
public class Solicitud_estatusPersistencia implements Serializable {
private static final long serialVersionUID = 1L;
public static Exception excepcion;
public static Connection con = null;

public Solicitud_estatusPersistencia(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
}
public static boolean Insertar (Solicitud_estatus solicitud_estatus ) {
	excepcion = null;
	try {
	if (!Conectar()) {
	return false;
	}
	String sql = "insert into solicitud_estatus(id_solest,nombre)  values('"+solicitud_estatus.getId_solest()+"','"+solicitud_estatus.getNombre()+"')";
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
public void findById_solest(Integer id_solest) {
}
public void findByNombre(String nombre) {
}
public static List<Solicitud_estatus> getLista(Map parametros) {
  excepcion = null;
  try {
      if (!Conectar()) {
         return null;
      }
  List<Solicitud_estatus> list = new ArrayList<Solicitud_estatus>();
  String sql = "select * from solicitud_estatus";
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
       list.add(new Solicitud_estatus(
         rs.getInt("id_solest"),rs.getString("nombre")));
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
