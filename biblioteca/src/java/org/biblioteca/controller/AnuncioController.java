package org.biblioteca.controller;

import org.biblioteca.beans.Anuncio;
import java.sql.Date; 
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.AnuncioPersistencia;
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
public class AnuncioController implements Serializable {
private static final long serialVersionUID = 1L;


private Anuncio anuncio;

private List<Anuncio> anunciolist;

private Anuncio selectedanuncio;

SelectItem[] anuncioItems;


public AnuncioController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   anuncio =(Anuncio) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"anuncio");
   anunciolist = new ArrayList<Anuncio>();
}

public Anuncio getAnuncio() {
 return anuncio;
}

 public void setAnuncio(Anuncio anuncio) {
 this.anuncio = anuncio;
}

public Anuncio getSelectedAnuncio() {
 return selectedanuncio;
}

 public void setSelectedAnuncio(Anuncio selectedanuncio) {
 this.selectedanuncio = selectedanuncio;
}


public SelectItem[]  getAnuncioItems() {
return anuncioItems;
}

public void setAnuncioItem(SelectItem[] anuncioItems) {
this.anuncioItems = anuncioItems;
}

public List<Anuncio> getAnunciolist() {
return anunciolist;
}

 public void setAnunciolist(List<Anuncio> anunciolist) {
this.anunciolist = anunciolist;
}
public void Crear () {
   if (!AnuncioPersistencia.Insertar(anuncio)) {
      JSFUtil.addErrorMessage(AnuncioPersistencia.excepcion.toString());
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
public void findById_anuncio(Integer id_anuncio) {
}
public void findById_usuario(Integer id_usuario) {
}
public void findByTitulo(String titulo) {
}
public void findByContenido(String contenido) {
}
public void findByFecha(Date fecha) {
}
public void findByFecha_ini(Date fecha_ini) {
}
public void findByFecha_fin(Date fecha_fin) {
}


public void Listar() {
  anunciolist.removeAll(anunciolist);
  Map<String, String> parametros = new HashMap<String, String>();
  anunciolist = AnuncioPersistencia.getLista(parametros);
  if (anunciolist== null) {
     JSFUtil.addErrorMessage(AnuncioPersistencia.excepcion.toString());
  }
 }


}
