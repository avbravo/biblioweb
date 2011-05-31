package org.biblioteca.controller;

import org.biblioteca.beans.Servicio_biblioteca;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.Servicio_bibliotecaPersistencia;
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
public class Servicio_bibliotecaController implements Serializable {
private static final long serialVersionUID = 1L;


private Servicio_biblioteca servicio_biblioteca;

private List<Servicio_biblioteca> servicio_bibliotecalist;

private Servicio_biblioteca selectedservicio_biblioteca;

SelectItem[] servicio_bibliotecaItems;


public Servicio_bibliotecaController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   servicio_biblioteca =(Servicio_biblioteca) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"servicio_biblioteca");
   servicio_bibliotecalist = new ArrayList<Servicio_biblioteca>();
}

public Servicio_biblioteca getServicio_biblioteca() {
 return servicio_biblioteca;
}

 public void setServicio_biblioteca(Servicio_biblioteca servicio_biblioteca) {
 this.servicio_biblioteca = servicio_biblioteca;
}

public Servicio_biblioteca getSelectedServicio_biblioteca() {
 return selectedservicio_biblioteca;
}

 public void setSelectedServicio_biblioteca(Servicio_biblioteca selectedservicio_biblioteca) {
 this.selectedservicio_biblioteca = selectedservicio_biblioteca;
}


public SelectItem[]  getServicio_bibliotecaItems() {
return servicio_bibliotecaItems;
}

public void setServicio_bibliotecaItem(SelectItem[] servicio_bibliotecaItems) {
this.servicio_bibliotecaItems = servicio_bibliotecaItems;
}

public List<Servicio_biblioteca> getServicio_bibliotecalist() {
return servicio_bibliotecalist;
}

 public void setServicio_bibliotecalist(List<Servicio_biblioteca> servicio_bibliotecalist) {
this.servicio_bibliotecalist = servicio_bibliotecalist;
}
public void Crear () {
   if (!Servicio_bibliotecaPersistencia.Insertar(servicio_biblioteca)) {
      JSFUtil.addErrorMessage(Servicio_bibliotecaPersistencia.excepcion.toString());
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
public void findById_serbib(Integer id_serbib) {
}
public void findById_biblioteca(Integer id_biblioteca) {
}
public void findById_perfil(Integer id_perfil) {
}
public void findById_servicio(Integer id_servicio) {
}
public void findById_documento(Integer id_documento) {
}
public void findById_estatus(Integer id_estatus) {
}
public void findByDias(Integer dias) {
}


public void Listar() {
  servicio_bibliotecalist.removeAll(servicio_bibliotecalist);
  Map<String, String> parametros = new HashMap<String, String>();
  servicio_bibliotecalist = Servicio_bibliotecaPersistencia.getLista(parametros);
  if (servicio_bibliotecalist== null) {
     JSFUtil.addErrorMessage(Servicio_bibliotecaPersistencia.excepcion.toString());
  }
 }


}
