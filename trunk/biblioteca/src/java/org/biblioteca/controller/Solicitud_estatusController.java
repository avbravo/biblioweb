package org.biblioteca.controller;

import org.biblioteca.beans.Solicitud_estatus;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.Solicitud_estatusPersistencia;
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
public class Solicitud_estatusController implements Serializable {
private static final long serialVersionUID = 1L;


private Solicitud_estatus solicitud_estatus;

private List<Solicitud_estatus> solicitud_estatuslist;

private Solicitud_estatus selectedsolicitud_estatus;

SelectItem[] solicitud_estatusItems;


public Solicitud_estatusController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   solicitud_estatus =(Solicitud_estatus) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"solicitud_estatus");
   solicitud_estatuslist = new ArrayList<Solicitud_estatus>();
}

public Solicitud_estatus getSolicitud_estatus() {
 return solicitud_estatus;
}

 public void setSolicitud_estatus(Solicitud_estatus solicitud_estatus) {
 this.solicitud_estatus = solicitud_estatus;
}

public Solicitud_estatus getSelectedSolicitud_estatus() {
 return selectedsolicitud_estatus;
}

 public void setSelectedSolicitud_estatus(Solicitud_estatus selectedsolicitud_estatus) {
 this.selectedsolicitud_estatus = selectedsolicitud_estatus;
}


public SelectItem[]  getSolicitud_estatusItems() {
return solicitud_estatusItems;
}

public void setSolicitud_estatusItem(SelectItem[] solicitud_estatusItems) {
this.solicitud_estatusItems = solicitud_estatusItems;
}

public List<Solicitud_estatus> getSolicitud_estatuslist() {
return solicitud_estatuslist;
}

 public void setSolicitud_estatuslist(List<Solicitud_estatus> solicitud_estatuslist) {
this.solicitud_estatuslist = solicitud_estatuslist;
}
public void Crear () {
   if (!Solicitud_estatusPersistencia.Insertar(solicitud_estatus)) {
      JSFUtil.addErrorMessage(Solicitud_estatusPersistencia.excepcion.toString());
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
public void findById_solest(Integer id_solest) {
}
public void findByNombre(String nombre) {
}


public void Listar() {
  solicitud_estatuslist.removeAll(solicitud_estatuslist);
  Map<String, String> parametros = new HashMap<String, String>();
  solicitud_estatuslist = Solicitud_estatusPersistencia.getLista(parametros);
  if (solicitud_estatuslist== null) {
     JSFUtil.addErrorMessage(Solicitud_estatusPersistencia.excepcion.toString());
  }
 }


}
