package org.biblioteca.persistencia;

import org.biblioteca.beans.Solicitud;
import java.sql.Date; 
import java.sql.Time;
 import java.math.BigDecimal;
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
public class SolicitudPersistencia implements Serializable {
private static final long serialVersionUID = 1L;
public static Exception excepcion;
public static Connection con = null;

public SolicitudPersistencia(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
}
public static boolean Insertar (Solicitud solicitud ) {
	excepcion = null;
	try {
	if (!Conectar()) {
	return false;
	}
	String sql = "insert into solicitud(id_solicitud,id_lector,id_servicio,id_solest,id_ejemplar,id_usuario_sol,id_usuario_dev,fecha_solicitud,hora_solicitud,fecha_asignada,fecha_devolucion,hora_devolucion,observacion,moroso,monto,impreso)  values('"+solicitud.getId_solicitud()+"','"+solicitud.getId_lector()+"','"+solicitud.getId_servicio()+"','"+solicitud.getId_solest()+"','"+solicitud.getId_ejemplar()+"','"+solicitud.getId_usuario_sol()+"','"+solicitud.getId_usuario_dev()+"','"+solicitud.getFecha_solicitud()+"','"+solicitud.getHora_solicitud()+"','"+solicitud.getFecha_asignada()+"','"+solicitud.getFecha_devolucion()+"','"+solicitud.getHora_devolucion()+"','"+solicitud.getObservacion()+"','"+solicitud.getMoroso()+"','"+solicitud.getMonto()+"','"+solicitud.getImpreso()+"')";
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
public void findById_solicitud(Integer id_solicitud) {
}
public void findById_lector(Integer id_lector) {
}
public void findById_servicio(Integer id_servicio) {
}
public void findById_solest(Integer id_solest) {
}
public void findById_ejemplar(Integer id_ejemplar) {
}
public void findById_usuario_sol(Integer id_usuario_sol) {
}
public void findById_usuario_dev(Integer id_usuario_dev) {
}
public void findByFecha_solicitud(Date fecha_solicitud) {
}
public void findByHora_solicitud(Time hora_solicitud) {
}
public void findByFecha_asignada(Date fecha_asignada) {
}
public void findByFecha_devolucion(Date fecha_devolucion) {
}
public void findByHora_devolucion(Time hora_devolucion) {
}
public void findByObservacion(String observacion) {
}
public void findByMoroso(Boolean moroso) {
}
public void findByMonto(BigDecimal monto) {
}
public void findByImpreso(Boolean impreso) {
}
public static List<Solicitud> getLista(Map parametros) {
  excepcion = null;
  try {
      if (!Conectar()) {
         return null;
      }
  List<Solicitud> list = new ArrayList<Solicitud>();
  String sql = "select * from solicitud";
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
       list.add(new Solicitud(
         rs.getInt("id_solicitud"),rs.getInt("id_lector"),rs.getInt("id_servicio"),rs.getInt("id_solest"),rs.getInt("id_ejemplar"),rs.getInt("id_usuario_sol"),rs.getInt("id_usuario_dev"),rs.getDate("fecha_solicitud"),rs.getTime("hora_solicitud"),rs.getDate("fecha_asignada"),rs.getDate("fecha_devolucion"),rs.getTime("hora_devolucion"),rs.getString("observacion"),rs.getBoolean("moroso"),rs.getBigDecimal("monto"),rs.getBoolean("impreso")));
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
