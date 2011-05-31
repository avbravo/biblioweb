package org.biblioteca.controller;

import org.biblioteca.beans.Mensaje;
import java.sql.Date; 
import java.sql.Time;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.MensajePersistencia;
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
public class MensajeController implements Serializable {
private static final long serialVersionUID = 1L;


private Mensaje mensaje;

private List<Mensaje> mensajelist;

private Mensaje selectedmensaje;

SelectItem[] mensajeItems;


public MensajeController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   mensaje =(Mensaje) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"mensaje");
   mensajelist = new ArrayList<Mensaje>();
}

public Mensaje getMensaje() {
 return mensaje;
}

 public void setMensaje(Mensaje mensaje) {
 this.mensaje = mensaje;
}

public Mensaje getSelectedMensaje() {
 return selectedmensaje;
}

 public void setSelectedMensaje(Mensaje selectedmensaje) {
 this.selectedmensaje = selectedmensaje;
}


public SelectItem[]  getMensajeItems() {
return mensajeItems;
}

public void setMensajeItem(SelectItem[] mensajeItems) {
this.mensajeItems = mensajeItems;
}

public List<Mensaje> getMensajelist() {
return mensajelist;
}

 public void setMensajelist(List<Mensaje> mensajelist) {
this.mensajelist = mensajelist;
}
public void Crear () {
   if (!MensajePersistencia.Insertar(mensaje)) {
      JSFUtil.addErrorMessage(MensajePersistencia.excepcion.toString());
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
public void findById_mensaje(Integer id_mensaje) {
}
public void findByTitulo(String titulo) {
}
public void findByContenido(String contenido) {
}
public void findByFecha(Date fecha) {
}
public void findByHora(Time hora) {
}


public void Listar() {
  mensajelist.removeAll(mensajelist);
  Map<String, String> parametros = new HashMap<String, String>();
  mensajelist = MensajePersistencia.getLista(parametros);
  if (mensajelist== null) {
     JSFUtil.addErrorMessage(MensajePersistencia.excepcion.toString());
  }
 }


}
