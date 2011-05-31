package org.biblioteca.persistencia;

import org.biblioteca.beans.Lector;
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
public class LectorPersistencia implements Serializable {
private static final long serialVersionUID = 1L;
public static Exception excepcion;
public static Connection con = null;

public LectorPersistencia(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
}
public static boolean Insertar (Lector lector ) {
	excepcion = null;
	try {
	if (!Conectar()) {
	return false;
	}
	String sql = "insert into lector(id_lector,id_perfil,id_region,id_dependencia,id_estatus,dni,clave,nombre,apellido,sexo,telefono,celular,email,apostal,direccion,observacion,expira_carnet,expira_prestamo,nacio)  values('"+lector.getId_lector()+"','"+lector.getId_perfil()+"','"+lector.getId_region()+"','"+lector.getId_dependencia()+"','"+lector.getId_estatus()+"','"+lector.getDni()+"','"+lector.getClave()+"','"+lector.getNombre()+"','"+lector.getApellido()+"','"+lector.getSexo()+"','"+lector.getTelefono()+"','"+lector.getCelular()+"','"+lector.getEmail()+"','"+lector.getApostal()+"','"+lector.getDireccion()+"','"+lector.getObservacion()+"','"+lector.getExpira_carnet()+"','"+lector.getExpira_prestamo()+"','"+lector.getNacio()+"')";
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
public void findById_lector(Integer id_lector) {
}
public void findById_perfil(Integer id_perfil) {
}
public void findById_region(Integer id_region) {
}
public void findById_dependencia(Integer id_dependencia) {
}
public void findById_estatus(Integer id_estatus) {
}
public void findByDni(String dni) {
}
public void findByClave(String clave) {
}
public void findByNombre(String nombre) {
}
public void findByApellido(String apellido) {
}
public void findBySexo(String sexo) {
}
public void findByTelefono(String telefono) {
}
public void findByCelular(String celular) {
}
public void findByEmail(String email) {
}
public void findByApostal(String apostal) {
}
public void findByDireccion(String direccion) {
}
public void findByObservacion(String observacion) {
}
public void findByExpira_carnet(Date expira_carnet) {
}
public void findByExpira_prestamo(Date expira_prestamo) {
}
public void findByNacio(Date nacio) {
}
public static List<Lector> getLista(Map parametros) {
  excepcion = null;
  try {
      if (!Conectar()) {
         return null;
      }
  List<Lector> list = new ArrayList<Lector>();
  String sql = "select * from lector";
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
       list.add(new Lector(
         rs.getInt("id_lector"),rs.getInt("id_perfil"),rs.getInt("id_region"),rs.getInt("id_dependencia"),rs.getInt("id_estatus"),rs.getString("dni"),rs.getString("clave"),rs.getString("nombre"),rs.getString("apellido"),rs.getString("sexo"),rs.getString("telefono"),rs.getString("celular"),rs.getString("email"),rs.getString("apostal"),rs.getString("direccion"),rs.getString("observacion"),rs.getDate("expira_carnet"),rs.getDate("expira_prestamo"),rs.getDate("nacio")));
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
