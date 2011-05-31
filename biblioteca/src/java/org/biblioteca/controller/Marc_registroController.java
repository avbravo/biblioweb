package org.biblioteca.controller;

import org.biblioteca.beans.Marc_registro;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.Marc_registroPersistencia;
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
public class Marc_registroController implements Serializable {
private static final long serialVersionUID = 1L;


private Marc_registro marc_registro;

private List<Marc_registro> marc_registrolist;

private Marc_registro selectedmarc_registro;

SelectItem[] marc_registroItems;


public Marc_registroController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   marc_registro =(Marc_registro) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"marc_registro");
   marc_registrolist = new ArrayList<Marc_registro>();
}

public Marc_registro getMarc_registro() {
 return marc_registro;
}

 public void setMarc_registro(Marc_registro marc_registro) {
 this.marc_registro = marc_registro;
}

public Marc_registro getSelectedMarc_registro() {
 return selectedmarc_registro;
}

 public void setSelectedMarc_registro(Marc_registro selectedmarc_registro) {
 this.selectedmarc_registro = selectedmarc_registro;
}


public SelectItem[]  getMarc_registroItems() {
return marc_registroItems;
}

public void setMarc_registroItem(SelectItem[] marc_registroItems) {
this.marc_registroItems = marc_registroItems;
}

public List<Marc_registro> getMarc_registrolist() {
return marc_registrolist;
}

 public void setMarc_registrolist(List<Marc_registro> marc_registrolist) {
this.marc_registrolist = marc_registrolist;
}
public void Crear () {
   if (!Marc_registroPersistencia.Insertar(marc_registro)) {
      JSFUtil.addErrorMessage(Marc_registroPersistencia.excepcion.toString());
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
public void findById_registro(Integer id_registro) {
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


public void Listar() {
  marc_registrolist.removeAll(marc_registrolist);
  Map<String, String> parametros = new HashMap<String, String>();
  marc_registrolist = Marc_registroPersistencia.getLista(parametros);
  if (marc_registrolist== null) {
     JSFUtil.addErrorMessage(Marc_registroPersistencia.excepcion.toString());
  }
 }


}
