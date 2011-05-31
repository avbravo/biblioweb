package org.biblioteca.controller;

import org.biblioteca.beans.Servicio;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.ServicioPersistencia;
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
public class ServicioController implements Serializable {
private static final long serialVersionUID = 1L;


private Servicio servicio;

private List<Servicio> serviciolist;

private Servicio selectedservicio;

SelectItem[] servicioItems;


public ServicioController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   servicio =(Servicio) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"servicio");
   serviciolist = new ArrayList<Servicio>();
}

public Servicio getServicio() {
 return servicio;
}

 public void setServicio(Servicio servicio) {
 this.servicio = servicio;
}

public Servicio getSelectedServicio() {
 return selectedservicio;
}

 public void setSelectedServicio(Servicio selectedservicio) {
 this.selectedservicio = selectedservicio;
}


public SelectItem[]  getServicioItems() {
return servicioItems;
}

public void setServicioItem(SelectItem[] servicioItems) {
this.servicioItems = servicioItems;
}

public List<Servicio> getServiciolist() {
return serviciolist;
}

 public void setServiciolist(List<Servicio> serviciolist) {
this.serviciolist = serviciolist;
}
public void Crear () {
   if (!ServicioPersistencia.Insertar(servicio)) {
      JSFUtil.addErrorMessage(ServicioPersistencia.excepcion.toString());
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
public void findById_servicio(Integer id_servicio) {
}
public void findByNombre(String nombre) {
}


public void Listar() {
  serviciolist.removeAll(serviciolist);
  Map<String, String> parametros = new HashMap<String, String>();
  serviciolist = ServicioPersistencia.getLista(parametros);
  if (serviciolist== null) {
     JSFUtil.addErrorMessage(ServicioPersistencia.excepcion.toString());
  }
 }


}
