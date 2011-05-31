package org.biblioteca.controller;

import org.biblioteca.beans.Control;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.ControlPersistencia;
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
public class ControlController implements Serializable {
private static final long serialVersionUID = 1L;


private Control control;

private List<Control> controllist;

private Control selectedcontrol;

SelectItem[] controlItems;


public ControlController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   control =(Control) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"control");
   controllist = new ArrayList<Control>();
}

public Control getControl() {
 return control;
}

 public void setControl(Control control) {
 this.control = control;
}

public Control getSelectedControl() {
 return selectedcontrol;
}

 public void setSelectedControl(Control selectedcontrol) {
 this.selectedcontrol = selectedcontrol;
}


public SelectItem[]  getControlItems() {
return controlItems;
}

public void setControlItem(SelectItem[] controlItems) {
this.controlItems = controlItems;
}

public List<Control> getControllist() {
return controllist;
}

 public void setControllist(List<Control> controllist) {
this.controllist = controllist;
}
public void Crear () {
   if (!ControlPersistencia.Insertar(control)) {
      JSFUtil.addErrorMessage(ControlPersistencia.excepcion.toString());
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
public void findById_control(Integer id_control) {
}
public void findByNombre(String nombre) {
}


public void Listar() {
  controllist.removeAll(controllist);
  Map<String, String> parametros = new HashMap<String, String>();
  controllist = ControlPersistencia.getLista(parametros);
  if (controllist== null) {
     JSFUtil.addErrorMessage(ControlPersistencia.excepcion.toString());
  }
 }


}
