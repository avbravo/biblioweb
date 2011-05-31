package org.biblioteca.controller;

import org.biblioteca.beans.Marc_serie;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.Marc_seriePersistencia;
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
public class Marc_serieController implements Serializable {
private static final long serialVersionUID = 1L;


private Marc_serie marc_serie;

private List<Marc_serie> marc_serielist;

private Marc_serie selectedmarc_serie;

SelectItem[] marc_serieItems;


public Marc_serieController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   marc_serie =(Marc_serie) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"marc_serie");
   marc_serielist = new ArrayList<Marc_serie>();
}

public Marc_serie getMarc_serie() {
 return marc_serie;
}

 public void setMarc_serie(Marc_serie marc_serie) {
 this.marc_serie = marc_serie;
}

public Marc_serie getSelectedMarc_serie() {
 return selectedmarc_serie;
}

 public void setSelectedMarc_serie(Marc_serie selectedmarc_serie) {
 this.selectedmarc_serie = selectedmarc_serie;
}


public SelectItem[]  getMarc_serieItems() {
return marc_serieItems;
}

public void setMarc_serieItem(SelectItem[] marc_serieItems) {
this.marc_serieItems = marc_serieItems;
}

public List<Marc_serie> getMarc_serielist() {
return marc_serielist;
}

 public void setMarc_serielist(List<Marc_serie> marc_serielist) {
this.marc_serielist = marc_serielist;
}
public void Crear () {
   if (!Marc_seriePersistencia.Insertar(marc_serie)) {
      JSFUtil.addErrorMessage(Marc_seriePersistencia.excepcion.toString());
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
public void findById_serie(Integer id_serie) {
}
public void findById_dato(Integer id_dato) {
}
public void findByNombre(String nombre) {
}


public void Listar() {
  marc_serielist.removeAll(marc_serielist);
  Map<String, String> parametros = new HashMap<String, String>();
  marc_serielist = Marc_seriePersistencia.getLista(parametros);
  if (marc_serielist== null) {
     JSFUtil.addErrorMessage(Marc_seriePersistencia.excepcion.toString());
  }
 }


}
