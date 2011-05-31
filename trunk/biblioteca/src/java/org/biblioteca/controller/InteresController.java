package org.biblioteca.controller;

import org.biblioteca.beans.Interes;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.InteresPersistencia;
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
public class InteresController implements Serializable {
private static final long serialVersionUID = 1L;


private Interes interes;

private List<Interes> intereslist;

private Interes selectedinteres;

SelectItem[] interesItems;


public InteresController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   interes =(Interes) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"interes");
   intereslist = new ArrayList<Interes>();
}

public Interes getInteres() {
 return interes;
}

 public void setInteres(Interes interes) {
 this.interes = interes;
}

public Interes getSelectedInteres() {
 return selectedinteres;
}

 public void setSelectedInteres(Interes selectedinteres) {
 this.selectedinteres = selectedinteres;
}


public SelectItem[]  getInteresItems() {
return interesItems;
}

public void setInteresItem(SelectItem[] interesItems) {
this.interesItems = interesItems;
}

public List<Interes> getIntereslist() {
return intereslist;
}

 public void setIntereslist(List<Interes> intereslist) {
this.intereslist = intereslist;
}
public void Crear () {
   if (!InteresPersistencia.Insertar(interes)) {
      JSFUtil.addErrorMessage(InteresPersistencia.excepcion.toString());
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
public void findById_interes(Integer id_interes) {
}
public void findByNombre(String nombre) {
}
public void findByDescripcion(String descripcion) {
}
public void findByUrl(String url) {
}


public void Listar() {
  intereslist.removeAll(intereslist);
  Map<String, String> parametros = new HashMap<String, String>();
  intereslist = InteresPersistencia.getLista(parametros);
  if (intereslist== null) {
     JSFUtil.addErrorMessage(InteresPersistencia.excepcion.toString());
  }
 }


}
