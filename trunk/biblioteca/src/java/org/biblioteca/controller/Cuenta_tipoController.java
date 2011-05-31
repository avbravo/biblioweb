package org.biblioteca.controller;

import org.biblioteca.beans.Cuenta_tipo;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.Cuenta_tipoPersistencia;
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
public class Cuenta_tipoController implements Serializable {
private static final long serialVersionUID = 1L;


private Cuenta_tipo cuenta_tipo;

private List<Cuenta_tipo> cuenta_tipolist;

private Cuenta_tipo selectedcuenta_tipo;

SelectItem[] cuenta_tipoItems;


public Cuenta_tipoController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   cuenta_tipo =(Cuenta_tipo) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"cuenta_tipo");
   cuenta_tipolist = new ArrayList<Cuenta_tipo>();
}

public Cuenta_tipo getCuenta_tipo() {
 return cuenta_tipo;
}

 public void setCuenta_tipo(Cuenta_tipo cuenta_tipo) {
 this.cuenta_tipo = cuenta_tipo;
}

public Cuenta_tipo getSelectedCuenta_tipo() {
 return selectedcuenta_tipo;
}

 public void setSelectedCuenta_tipo(Cuenta_tipo selectedcuenta_tipo) {
 this.selectedcuenta_tipo = selectedcuenta_tipo;
}


public SelectItem[]  getCuenta_tipoItems() {
return cuenta_tipoItems;
}

public void setCuenta_tipoItem(SelectItem[] cuenta_tipoItems) {
this.cuenta_tipoItems = cuenta_tipoItems;
}

public List<Cuenta_tipo> getCuenta_tipolist() {
return cuenta_tipolist;
}

 public void setCuenta_tipolist(List<Cuenta_tipo> cuenta_tipolist) {
this.cuenta_tipolist = cuenta_tipolist;
}
public void Crear () {
   if (!Cuenta_tipoPersistencia.Insertar(cuenta_tipo)) {
      JSFUtil.addErrorMessage(Cuenta_tipoPersistencia.excepcion.toString());
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
public void findById_cuetip(Integer id_cuetip) {
}
public void findByNombre(String nombre) {
}


public void Listar() {
  cuenta_tipolist.removeAll(cuenta_tipolist);
  Map<String, String> parametros = new HashMap<String, String>();
  cuenta_tipolist = Cuenta_tipoPersistencia.getLista(parametros);
  if (cuenta_tipolist== null) {
     JSFUtil.addErrorMessage(Cuenta_tipoPersistencia.excepcion.toString());
  }
 }


}
