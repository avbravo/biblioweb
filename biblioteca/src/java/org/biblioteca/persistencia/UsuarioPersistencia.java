package org.biblioteca.persistencia;

import org.biblioteca.beans.Usuario;
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
public class UsuarioPersistencia implements Serializable {
private static final long serialVersionUID = 1L;
public static Exception excepcion;
public static Connection con = null;

public UsuarioPersistencia(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
}
public static boolean Insertar (Usuario usuario ) {
	excepcion = null;
	try {
	if (!Conectar()) {
	return false;
	}
	String sql = "insert into usuario(id_usuario,id_sala,id_control,id_estatus,dni,clave,nombre,apellido,sexo,telefono,celular,email,apostal,direccion)  values('"+usuario.getId_usuario()+"','"+usuario.getId_sala()+"','"+usuario.getId_control()+"','"+usuario.getId_estatus()+"','"+usuario.getDni()+"','"+usuario.getClave()+"','"+usuario.getNombre()+"','"+usuario.getApellido()+"','"+usuario.getSexo()+"','"+usuario.getTelefono()+"','"+usuario.getCelular()+"','"+usuario.getEmail()+"','"+usuario.getApostal()+"','"+usuario.getDireccion()+"')";
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
public void findById_usuario(Integer id_usuario) {
}
public void findById_sala(Integer id_sala) {
}
public void findById_control(Integer id_control) {
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
public static List<Usuario> getLista(Map parametros) {
  excepcion = null;
  try {
      if (!Conectar()) {
         return null;
      }
  List<Usuario> list = new ArrayList<Usuario>();
  String sql = "select * from usuario";
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
       list.add(new Usuario(
         rs.getInt("id_usuario"),rs.getInt("id_sala"),rs.getInt("id_control"),rs.getInt("id_estatus"),rs.getString("dni"),rs.getString("clave"),rs.getString("nombre"),rs.getString("apellido"),rs.getString("sexo"),rs.getString("telefono"),rs.getString("celular"),rs.getString("email"),rs.getString("apostal"),rs.getString("direccion")));
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
