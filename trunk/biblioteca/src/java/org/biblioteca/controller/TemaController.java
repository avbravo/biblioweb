package org.biblioteca.controller;

import org.biblioteca.beans.Tema;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.TemaPersistencia;
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
public class TemaController implements Serializable {
private static final long serialVersionUID = 1L;


private Tema tema;

private List<Tema> temalist;

private Tema selectedtema;

SelectItem[] temaItems;


public TemaController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   tema =(Tema) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"tema");
   temalist = new ArrayList<Tema>();
}

public Tema getTema() {
 return tema;
}

 public void setTema(Tema tema) {
 this.tema = tema;
}

public Tema getSelectedTema() {
 return selectedtema;
}

 public void setSelectedTema(Tema selectedtema) {
 this.selectedtema = selectedtema;
}


public SelectItem[]  getTemaItems() {
return temaItems;
}

public void setTemaItem(SelectItem[] temaItems) {
this.temaItems = temaItems;
}

public List<Tema> getTemalist() {
return temalist;
}

 public void setTemalist(List<Tema> temalist) {
this.temalist = temalist;
}
public void Crear () {
   if (!TemaPersistencia.Insertar(tema)) {
      JSFUtil.addErrorMessage(TemaPersistencia.excepcion.toString());
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
public void findById_tema(String id_tema) {
}
public void findByNombre(String nombre) {
}


public void Listar() {
  temalist.removeAll(temalist);
  Map<String, String> parametros = new HashMap<String, String>();
  temalist = TemaPersistencia.getLista(parametros);
  if (temalist== null) {
     JSFUtil.addErrorMessage(TemaPersistencia.excepcion.toString());
  }
 }


}
