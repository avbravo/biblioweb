package org.biblioteca.controller;

import org.biblioteca.beans.Marc_analitica;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.Marc_analiticaPersistencia;
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
public class Marc_analiticaController implements Serializable {
private static final long serialVersionUID = 1L;


private Marc_analitica marc_analitica;

private List<Marc_analitica> marc_analiticalist;

private Marc_analitica selectedmarc_analitica;

SelectItem[] marc_analiticaItems;


public Marc_analiticaController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   marc_analitica =(Marc_analitica) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"marc_analitica");
   marc_analiticalist = new ArrayList<Marc_analitica>();
}

public Marc_analitica getMarc_analitica() {
 return marc_analitica;
}

 public void setMarc_analitica(Marc_analitica marc_analitica) {
 this.marc_analitica = marc_analitica;
}

public Marc_analitica getSelectedMarc_analitica() {
 return selectedmarc_analitica;
}

 public void setSelectedMarc_analitica(Marc_analitica selectedmarc_analitica) {
 this.selectedmarc_analitica = selectedmarc_analitica;
}


public SelectItem[]  getMarc_analiticaItems() {
return marc_analiticaItems;
}

public void setMarc_analiticaItem(SelectItem[] marc_analiticaItems) {
this.marc_analiticaItems = marc_analiticaItems;
}

public List<Marc_analitica> getMarc_analiticalist() {
return marc_analiticalist;
}

 public void setMarc_analiticalist(List<Marc_analitica> marc_analiticalist) {
this.marc_analiticalist = marc_analiticalist;
}
public void Crear () {
   if (!Marc_analiticaPersistencia.Insertar(marc_analitica)) {
      JSFUtil.addErrorMessage(Marc_analiticaPersistencia.excepcion.toString());
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
public void findById_analitica(Integer id_analitica) {
}
public void findByNumero(Integer numero) {
}
public void findById_dato(Integer id_dato) {
}
public void findById_nivel(Integer id_nivel) {
}
public void findById_etiqueta(String id_etiqueta) {
}
public void findByEti_padre(String eti_padre) {
}
public void findByDescripcion(String descripcion) {
}
public void findById_repetido(Integer id_repetido) {
}
public void findById_usuario(Integer id_usuario) {
}


public void Listar() {
  marc_analiticalist.removeAll(marc_analiticalist);
  Map<String, String> parametros = new HashMap<String, String>();
  marc_analiticalist = Marc_analiticaPersistencia.getLista(parametros);
  if (marc_analiticalist== null) {
     JSFUtil.addErrorMessage(Marc_analiticaPersistencia.excepcion.toString());
  }
 }


}
