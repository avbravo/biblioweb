package org.biblioteca.controller;

import org.biblioteca.beans.Marc_dato;
import java.sql.Date; 
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.Marc_datoPersistencia;
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
public class Marc_datoController implements Serializable {
private static final long serialVersionUID = 1L;


private Marc_dato marc_dato;

private List<Marc_dato> marc_datolist;

private Marc_dato selectedmarc_dato;

SelectItem[] marc_datoItems;


public Marc_datoController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   marc_dato =(Marc_dato) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"marc_dato");
   marc_datolist = new ArrayList<Marc_dato>();
}

public Marc_dato getMarc_dato() {
 return marc_dato;
}

 public void setMarc_dato(Marc_dato marc_dato) {
 this.marc_dato = marc_dato;
}

public Marc_dato getSelectedMarc_dato() {
 return selectedmarc_dato;
}

 public void setSelectedMarc_dato(Marc_dato selectedmarc_dato) {
 this.selectedmarc_dato = selectedmarc_dato;
}


public SelectItem[]  getMarc_datoItems() {
return marc_datoItems;
}

public void setMarc_datoItem(SelectItem[] marc_datoItems) {
this.marc_datoItems = marc_datoItems;
}

public List<Marc_dato> getMarc_datolist() {
return marc_datolist;
}

 public void setMarc_datolist(List<Marc_dato> marc_datolist) {
this.marc_datolist = marc_datolist;
}
public void Crear () {
   if (!Marc_datoPersistencia.Insertar(marc_dato)) {
      JSFUtil.addErrorMessage(Marc_datoPersistencia.excepcion.toString());
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
public void findById_dato(Integer id_dato) {
}
public void findById_estatus(Integer id_estatus) {
}
public void findById_usuario(Integer id_usuario) {
}
public void findById_documento(Integer id_documento) {
}
public void findByFecha(Date fecha) {
}
public void findByImpreso(Boolean impreso) {
}


public void Listar() {
  marc_datolist.removeAll(marc_datolist);
  Map<String, String> parametros = new HashMap<String, String>();
  marc_datolist = Marc_datoPersistencia.getLista(parametros);
  if (marc_datolist== null) {
     JSFUtil.addErrorMessage(Marc_datoPersistencia.excepcion.toString());
  }
 }


}
