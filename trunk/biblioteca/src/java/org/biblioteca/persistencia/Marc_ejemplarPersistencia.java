package org.biblioteca.persistencia;

import org.biblioteca.beans.Marc_ejemplar;
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
public class Marc_ejemplarPersistencia implements Serializable {
private static final long serialVersionUID = 1L;
public static Exception excepcion;
public static Connection con = null;

public Marc_ejemplarPersistencia(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
}
public static boolean Insertar (Marc_ejemplar marc_ejemplar ) {
	excepcion = null;
	try {
	if (!Conectar()) {
	return false;
	}
	String sql = "insert into marc_ejemplar(id_ejemplar,id_sala,id_adquisicion,id_estatus,codigo_barra,observacion,fecha,hora,numero,monto,id_usuario,id_serie,verificado)  values('"+marc_ejemplar.getId_ejemplar()+"','"+marc_ejemplar.getId_sala()+"','"+marc_ejemplar.getId_adquisicion()+"','"+marc_ejemplar.getId_estatus()+"','"+marc_ejemplar.getCodigo_barra()+"','"+marc_ejemplar.getObservacion()+"','"+marc_ejemplar.getFecha()+"','"+marc_ejemplar.getHora()+"','"+marc_ejemplar.getNumero()+"','"+marc_ejemplar.getMonto()+"','"+marc_ejemplar.getId_usuario()+"','"+marc_ejemplar.getId_serie()+"','"+marc_ejemplar.getVerificado()+"')";
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
public void findById_ejemplar(Integer id_ejemplar) {
}
public void findById_sala(Integer id_sala) {
}
public void findById_adquisicion(Integer id_adquisicion) {
}
public void findById_estatus(Integer id_estatus) {
}
public void findByCodigo_barra(String codigo_barra) {
}
public void findByObservacion(String observacion) {
}
public void findByFecha(Date fecha) {
}
public void findByHora(Time hora) {
}
public void findByNumero(String numero) {
}
public void findByMonto(BigDecimal monto) {
}
public void findById_usuario(Integer id_usuario) {
}
public void findById_serie(Integer id_serie) {
}
public void findByVerificado(Boolean verificado) {
}
public static List<Marc_ejemplar> getLista(Map parametros) {
  excepcion = null;
  try {
      if (!Conectar()) {
         return null;
      }
  List<Marc_ejemplar> list = new ArrayList<Marc_ejemplar>();
  String sql = "select * from marc_ejemplar";
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
       list.add(new Marc_ejemplar(
         rs.getInt("id_ejemplar"),rs.getInt("id_sala"),rs.getInt("id_adquisicion"),rs.getInt("id_estatus"),rs.getString("codigo_barra"),rs.getString("observacion"),rs.getDate("fecha"),rs.getTime("hora"),rs.getString("numero"),rs.getBigDecimal("monto"),rs.getInt("id_usuario"),rs.getInt("id_serie"),rs.getBoolean("verificado")));
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
