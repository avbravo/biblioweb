package org.biblioteca.controller;

import org.biblioteca.beans.Mensaje_usuario;
import java.sql.Date; 
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.Mensaje_usuarioPersistencia;
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
public class Mensaje_usuarioController implements Serializable {
private static final long serialVersionUID = 1L;


private Mensaje_usuario mensaje_usuario;

private List<Mensaje_usuario> mensaje_usuariolist;

private Mensaje_usuario selectedmensaje_usuario;

SelectItem[] mensaje_usuarioItems;


public Mensaje_usuarioController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   mensaje_usuario =(Mensaje_usuario) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"mensaje_usuario");
   mensaje_usuariolist = new ArrayList<Mensaje_usuario>();
}

public Mensaje_usuario getMensaje_usuario() {
 return mensaje_usuario;
}

 public void setMensaje_usuario(Mensaje_usuario mensaje_usuario) {
 this.mensaje_usuario = mensaje_usuario;
}

public Mensaje_usuario getSelectedMensaje_usuario() {
 return selectedmensaje_usuario;
}

 public void setSelectedMensaje_usuario(Mensaje_usuario selectedmensaje_usuario) {
 this.selectedmensaje_usuario = selectedmensaje_usuario;
}


public SelectItem[]  getMensaje_usuarioItems() {
return mensaje_usuarioItems;
}

public void setMensaje_usuarioItem(SelectItem[] mensaje_usuarioItems) {
this.mensaje_usuarioItems = mensaje_usuarioItems;
}

public List<Mensaje_usuario> getMensaje_usuariolist() {
return mensaje_usuariolist;
}

 public void setMensaje_usuariolist(List<Mensaje_usuario> mensaje_usuariolist) {
this.mensaje_usuariolist = mensaje_usuariolist;
}
public void Crear () {
   if (!Mensaje_usuarioPersistencia.Insertar(mensaje_usuario)) {
      JSFUtil.addErrorMessage(Mensaje_usuarioPersistencia.excepcion.toString());
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
public void findById_menusu(Integer id_menusu) {
}
public void findById_usuario_ori(Integer id_usuario_ori) {
}
public void findById_usuario_des(Integer id_usuario_des) {
}
public void findById_mensaje(Integer id_mensaje) {
}
public void findByFecha(Date fecha) {
}
public void findByVerificado(Boolean verificado) {
}


public void Listar() {
  mensaje_usuariolist.removeAll(mensaje_usuariolist);
  Map<String, String> parametros = new HashMap<String, String>();
  mensaje_usuariolist = Mensaje_usuarioPersistencia.getLista(parametros);
  if (mensaje_usuariolist== null) {
     JSFUtil.addErrorMessage(Mensaje_usuarioPersistencia.excepcion.toString());
  }
 }


}
