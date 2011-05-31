package org.biblioteca.controller;

import org.biblioteca.beans.Frecuencia;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.FrecuenciaPersistencia;
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
public class FrecuenciaController implements Serializable {
private static final long serialVersionUID = 1L;


private Frecuencia frecuencia;

private List<Frecuencia> frecuencialist;

private Frecuencia selectedfrecuencia;

SelectItem[] frecuenciaItems;


public FrecuenciaController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   frecuencia =(Frecuencia) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"frecuencia");
   frecuencialist = new ArrayList<Frecuencia>();
}

public Frecuencia getFrecuencia() {
 return frecuencia;
}

 public void setFrecuencia(Frecuencia frecuencia) {
 this.frecuencia = frecuencia;
}

public Frecuencia getSelectedFrecuencia() {
 return selectedfrecuencia;
}

 public void setSelectedFrecuencia(Frecuencia selectedfrecuencia) {
 this.selectedfrecuencia = selectedfrecuencia;
}


public SelectItem[]  getFrecuenciaItems() {
return frecuenciaItems;
}

public void setFrecuenciaItem(SelectItem[] frecuenciaItems) {
this.frecuenciaItems = frecuenciaItems;
}

public List<Frecuencia> getFrecuencialist() {
return frecuencialist;
}

 public void setFrecuencialist(List<Frecuencia> frecuencialist) {
this.frecuencialist = frecuencialist;
}
public void Crear () {
   if (!FrecuenciaPersistencia.Insertar(frecuencia)) {
      JSFUtil.addErrorMessage(FrecuenciaPersistencia.excepcion.toString());
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
public void findById_frecuencia(Integer id_frecuencia) {
}
public void findByNombre(String nombre) {
}


public void Listar() {
  frecuencialist.removeAll(frecuencialist);
  Map<String, String> parametros = new HashMap<String, String>();
  frecuencialist = FrecuenciaPersistencia.getLista(parametros);
  if (frecuencialist== null) {
     JSFUtil.addErrorMessage(FrecuenciaPersistencia.excepcion.toString());
  }
 }


}
