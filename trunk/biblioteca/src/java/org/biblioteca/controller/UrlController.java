package org.biblioteca.controller;

import org.biblioteca.beans.Url;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.UrlPersistencia;
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
public class UrlController implements Serializable {
private static final long serialVersionUID = 1L;


private Url url;

private List<Url> urllist;

private Url selectedurl;

SelectItem[] urlItems;


public UrlController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   url =(Url) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"url");
   urllist = new ArrayList<Url>();
}

public Url getUrl() {
 return url;
}

 public void setUrl(Url url) {
 this.url = url;
}

public Url getSelectedUrl() {
 return selectedurl;
}

 public void setSelectedUrl(Url selectedurl) {
 this.selectedurl = selectedurl;
}


public SelectItem[]  getUrlItems() {
return urlItems;
}

public void setUrlItem(SelectItem[] urlItems) {
this.urlItems = urlItems;
}

public List<Url> getUrllist() {
return urllist;
}

 public void setUrllist(List<Url> urllist) {
this.urllist = urllist;
}
public void Crear () {
   if (!UrlPersistencia.Insertar(url)) {
      JSFUtil.addErrorMessage(UrlPersistencia.excepcion.toString());
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
public void findById_url(Integer id_url) {
}
public void findByNombre(String nombre) {
}
public void findByUrl(String url) {
}


public void Listar() {
  urllist.removeAll(urllist);
  Map<String, String> parametros = new HashMap<String, String>();
  urllist = UrlPersistencia.getLista(parametros);
  if (urllist== null) {
     JSFUtil.addErrorMessage(UrlPersistencia.excepcion.toString());
  }
 }


}
