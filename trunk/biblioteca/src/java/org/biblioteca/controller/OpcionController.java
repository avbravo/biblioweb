package org.biblioteca.controller;

import org.biblioteca.beans.Opcion;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.OpcionPersistencia;
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
public class OpcionController implements Serializable {
private static final long serialVersionUID = 1L;


private Opcion opcion;

private List<Opcion> opcionlist;

private Opcion selectedopcion;

SelectItem[] opcionItems;


public OpcionController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   opcion =(Opcion) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"opcion");
   opcionlist = new ArrayList<Opcion>();
}

public Opcion getOpcion() {
 return opcion;
}

 public void setOpcion(Opcion opcion) {
 this.opcion = opcion;
}

public Opcion getSelectedOpcion() {
 return selectedopcion;
}

 public void setSelectedOpcion(Opcion selectedopcion) {
 this.selectedopcion = selectedopcion;
}


public SelectItem[]  getOpcionItems() {
return opcionItems;
}

public void setOpcionItem(SelectItem[] opcionItems) {
this.opcionItems = opcionItems;
}

public List<Opcion> getOpcionlist() {
return opcionlist;
}

 public void setOpcionlist(List<Opcion> opcionlist) {
this.opcionlist = opcionlist;
}
public void Crear () {
   if (!OpcionPersistencia.Insertar(opcion)) {
      JSFUtil.addErrorMessage(OpcionPersistencia.excepcion.toString());
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
public void findById_opcion(Integer id_opcion) {
}
public void findByNombre(String nombre) {
}


public void Listar() {
  opcionlist.removeAll(opcionlist);
  Map<String, String> parametros = new HashMap<String, String>();
  opcionlist = OpcionPersistencia.getLista(parametros);
  if (opcionlist== null) {
     JSFUtil.addErrorMessage(OpcionPersistencia.excepcion.toString());
  }
 }


}
