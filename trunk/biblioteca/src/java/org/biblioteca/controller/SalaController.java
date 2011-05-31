package org.biblioteca.controller;

import org.biblioteca.beans.Sala;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.SalaPersistencia;
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
public class SalaController implements Serializable {
private static final long serialVersionUID = 1L;


private Sala sala;

private List<Sala> salalist;

private Sala selectedsala;

SelectItem[] salaItems;


public SalaController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   sala =(Sala) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"sala");
   salalist = new ArrayList<Sala>();
}

public Sala getSala() {
 return sala;
}

 public void setSala(Sala sala) {
 this.sala = sala;
}

public Sala getSelectedSala() {
 return selectedsala;
}

 public void setSelectedSala(Sala selectedsala) {
 this.selectedsala = selectedsala;
}


public SelectItem[]  getSalaItems() {
return salaItems;
}

public void setSalaItem(SelectItem[] salaItems) {
this.salaItems = salaItems;
}

public List<Sala> getSalalist() {
return salalist;
}

 public void setSalalist(List<Sala> salalist) {
this.salalist = salalist;
}
public void Crear () {
   if (!SalaPersistencia.Insertar(sala)) {
      JSFUtil.addErrorMessage(SalaPersistencia.excepcion.toString());
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
public void findById_sala(Integer id_sala) {
}
public void findById_biblioteca(Integer id_biblioteca) {
}
public void findByNombre(String nombre) {
}
public void findByUbicacion(String ubicacion) {
}


public void Listar() {
  salalist.removeAll(salalist);
  Map<String, String> parametros = new HashMap<String, String>();
  salalist = SalaPersistencia.getLista(parametros);
  if (salalist== null) {
     JSFUtil.addErrorMessage(SalaPersistencia.excepcion.toString());
  }
 }


}
