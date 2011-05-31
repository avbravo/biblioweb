package org.biblioteca.controller;

import org.biblioteca.beans.Recomendacion;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.RecomendacionPersistencia;
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
public class RecomendacionController implements Serializable {
private static final long serialVersionUID = 1L;


private Recomendacion recomendacion;

private List<Recomendacion> recomendacionlist;

private Recomendacion selectedrecomendacion;

SelectItem[] recomendacionItems;


public RecomendacionController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   recomendacion =(Recomendacion) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"recomendacion");
   recomendacionlist = new ArrayList<Recomendacion>();
}

public Recomendacion getRecomendacion() {
 return recomendacion;
}

 public void setRecomendacion(Recomendacion recomendacion) {
 this.recomendacion = recomendacion;
}

public Recomendacion getSelectedRecomendacion() {
 return selectedrecomendacion;
}

 public void setSelectedRecomendacion(Recomendacion selectedrecomendacion) {
 this.selectedrecomendacion = selectedrecomendacion;
}


public SelectItem[]  getRecomendacionItems() {
return recomendacionItems;
}

public void setRecomendacionItem(SelectItem[] recomendacionItems) {
this.recomendacionItems = recomendacionItems;
}

public List<Recomendacion> getRecomendacionlist() {
return recomendacionlist;
}

 public void setRecomendacionlist(List<Recomendacion> recomendacionlist) {
this.recomendacionlist = recomendacionlist;
}
public void Crear () {
   if (!RecomendacionPersistencia.Insertar(recomendacion)) {
      JSFUtil.addErrorMessage(RecomendacionPersistencia.excepcion.toString());
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
public void findById_recomendacion(Integer id_recomendacion) {
}
public void findByNombre(String nombre) {
}
public void findByEmail(String email) {
}
public void findByObservacion(String observacion) {
}
public void findByLeido(Boolean leido) {
}


public void Listar() {
  recomendacionlist.removeAll(recomendacionlist);
  Map<String, String> parametros = new HashMap<String, String>();
  recomendacionlist = RecomendacionPersistencia.getLista(parametros);
  if (recomendacionlist== null) {
     JSFUtil.addErrorMessage(RecomendacionPersistencia.excepcion.toString());
  }
 }


}
