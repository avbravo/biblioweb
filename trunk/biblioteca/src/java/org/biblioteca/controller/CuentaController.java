package org.biblioteca.controller;

import org.biblioteca.beans.Cuenta;
import java.sql.Date; 
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.CuentaPersistencia;
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
public class CuentaController implements Serializable {
private static final long serialVersionUID = 1L;


private Cuenta cuenta;

private List<Cuenta> cuentalist;

private Cuenta selectedcuenta;

SelectItem[] cuentaItems;


public CuentaController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   cuenta =(Cuenta) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"cuenta");
   cuentalist = new ArrayList<Cuenta>();
}

public Cuenta getCuenta() {
 return cuenta;
}

 public void setCuenta(Cuenta cuenta) {
 this.cuenta = cuenta;
}

public Cuenta getSelectedCuenta() {
 return selectedcuenta;
}

 public void setSelectedCuenta(Cuenta selectedcuenta) {
 this.selectedcuenta = selectedcuenta;
}


public SelectItem[]  getCuentaItems() {
return cuentaItems;
}

public void setCuentaItem(SelectItem[] cuentaItems) {
this.cuentaItems = cuentaItems;
}

public List<Cuenta> getCuentalist() {
return cuentalist;
}

 public void setCuentalist(List<Cuenta> cuentalist) {
this.cuentalist = cuentalist;
}
public void Crear () {
   if (!CuentaPersistencia.Insertar(cuenta)) {
      JSFUtil.addErrorMessage(CuentaPersistencia.excepcion.toString());
   } else {
        JSFUtil.addSuccessMessage("Guardado exitosamente...");
         }
}
public void Editar() {
}
public void Eliminar() {
}
public void Actualizar() {
}
public void findAll() {
}
public void findById_cuenta(Integer id_cuenta) {
}
public void findById_cuetip(Integer id_cuetip) {
}
public void findById_proveedor(Integer id_proveedor) {
}
public void findById_frecuencia(Integer id_frecuencia) {
}
public void findByObservacion(String observacion) {
}
public void findByFecha(Date fecha) {
}
public void findByNombre(String nombre) {
}


public void Listar() {
  cuentalist.removeAll(cuentalist);
  Map<String, String> parametros = new HashMap<String, String>();
  cuentalist = CuentaPersistencia.getLista(parametros);
  if (cuentalist== null) {
     JSFUtil.addErrorMessage(CuentaPersistencia.excepcion.toString());
  }
 }


}
