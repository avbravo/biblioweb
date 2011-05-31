package org.biblioteca.controller;

import org.biblioteca.beans.Dependencia;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.DependenciaPersistencia;
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
public class DependenciaController implements Serializable {
private static final long serialVersionUID = 1L;


private Dependencia dependencia;

private List<Dependencia> dependencialist;

private Dependencia selecteddependencia;

SelectItem[] dependenciaItems;


public DependenciaController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   dependencia =(Dependencia) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"dependencia");
   dependencialist = new ArrayList<Dependencia>();
}

public Dependencia getDependencia() {
 return dependencia;
}

 public void setDependencia(Dependencia dependencia) {
 this.dependencia = dependencia;
}

public Dependencia getSelectedDependencia() {
 return selecteddependencia;
}

 public void setSelectedDependencia(Dependencia selecteddependencia) {
 this.selecteddependencia = selecteddependencia;
}


public SelectItem[]  getDependenciaItems() {
return dependenciaItems;
}

public void setDependenciaItem(SelectItem[] dependenciaItems) {
this.dependenciaItems = dependenciaItems;
}

public List<Dependencia> getDependencialist() {
return dependencialist;
}

 public void setDependencialist(List<Dependencia> dependencialist) {
this.dependencialist = dependencialist;
}
public void Crear () {
   if (!DependenciaPersistencia.Insertar(dependencia)) {
      JSFUtil.addErrorMessage(DependenciaPersistencia.excepcion.toString());
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
public void findById_dependencia(Integer id_dependencia) {
}
public void findById_institucion(Integer id_institucion) {
}
public void findByNombre(String nombre) {
}


public void Listar() {
  dependencialist.removeAll(dependencialist);
  Map<String, String> parametros = new HashMap<String, String>();
  dependencialist = DependenciaPersistencia.getLista(parametros);
  if (dependencialist== null) {
     JSFUtil.addErrorMessage(DependenciaPersistencia.excepcion.toString());
  }
 }


}
