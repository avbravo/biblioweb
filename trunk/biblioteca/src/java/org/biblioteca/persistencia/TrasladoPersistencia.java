package org.biblioteca.persistencia;

import org.biblioteca.beans.Traslado;
import java.sql.Date; 
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
public class TrasladoPersistencia implements Serializable {
private static final long serialVersionUID = 1L;
public static Exception excepcion;
public static Connection con = null;

public TrasladoPersistencia(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
}
public static boolean Insertar (Traslado traslado ) {
	excepcion = null;
	try {
	if (!Conectar()) {
	return false;
	}
	String sql = "insert into traslado(id_traslado,id_usuario_ori,id_usuario_des,id_sala_ori,id_sala_des,id_ejemplar,fecha_ori,fecha_des,temporal)  values('"+traslado.getId_traslado()+"','"+traslado.getId_usuario_ori()+"','"+traslado.getId_usuario_des()+"','"+traslado.getId_sala_ori()+"','"+traslado.getId_sala_des()+"','"+traslado.getId_ejemplar()+"','"+traslado.getFecha_ori()+"','"+traslado.getFecha_des()+"','"+traslado.getTemporal()+"')";
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
public void findById_traslado(Integer id_traslado) {
}
public void findById_usuario_ori(Integer id_usuario_ori) {
}
public void findById_usuario_des(Integer id_usuario_des) {
}
public void findById_sala_ori(Integer id_sala_ori) {
}
public void findById_sala_des(Integer id_sala_des) {
}
public void findById_ejemplar(Integer id_ejemplar) {
}
public void findByFecha_ori(Date fecha_ori) {
}
public void findByFecha_des(Date fecha_des) {
}
public void findByTemporal(Boolean temporal) {
}
public static List<Traslado> getLista(Map parametros) {
  excepcion = null;
  try {
      if (!Conectar()) {
         return null;
      }
  List<Traslado> list = new ArrayList<Traslado>();
  String sql = "select * from traslado";
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
       list.add(new Traslado(
         rs.getInt("id_traslado"),rs.getInt("id_usuario_ori"),rs.getInt("id_usuario_des"),rs.getInt("id_sala_ori"),rs.getInt("id_sala_des"),rs.getInt("id_ejemplar"),rs.getDate("fecha_ori"),rs.getDate("fecha_des"),rs.getBoolean("temporal")));
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
