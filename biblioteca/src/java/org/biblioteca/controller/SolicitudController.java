package org.biblioteca.controller;

import org.biblioteca.beans.Solicitud;
import java.sql.Date; 
import java.sql.Time;
 import java.math.BigDecimal;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.SolicitudPersistencia;
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
public class SolicitudController implements Serializable {
private static final long serialVersionUID = 1L;


private Solicitud solicitud;

private List<Solicitud> solicitudlist;

private Solicitud selectedsolicitud;

SelectItem[] solicitudItems;


public SolicitudController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   solicitud =(Solicitud) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"solicitud");
   solicitudlist = new ArrayList<Solicitud>();
}

public Solicitud getSolicitud() {
 return solicitud;
}

 public void setSolicitud(Solicitud solicitud) {
 this.solicitud = solicitud;
}

public Solicitud getSelectedSolicitud() {
 return selectedsolicitud;
}

 public void setSelectedSolicitud(Solicitud selectedsolicitud) {
 this.selectedsolicitud = selectedsolicitud;
}


public SelectItem[]  getSolicitudItems() {
return solicitudItems;
}

public void setSolicitudItem(SelectItem[] solicitudItems) {
this.solicitudItems = solicitudItems;
}

public List<Solicitud> getSolicitudlist() {
return solicitudlist;
}

 public void setSolicitudlist(List<Solicitud> solicitudlist) {
this.solicitudlist = solicitudlist;
}
public void Crear () {
   if (!SolicitudPersistencia.Insertar(solicitud)) {
      JSFUtil.addErrorMessage(SolicitudPersistencia.excepcion.toString());
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
public void findById_solicitud(Integer id_solicitud) {
}
public void findById_lector(Integer id_lector) {
}
public void findById_servicio(Integer id_servicio) {
}
public void findById_solest(Integer id_solest) {
}
public void findById_ejemplar(Integer id_ejemplar) {
}
public void findById_usuario_sol(Integer id_usuario_sol) {
}
public void findById_usuario_dev(Integer id_usuario_dev) {
}
public void findByFecha_solicitud(Date fecha_solicitud) {
}
public void findByHora_solicitud(Time hora_solicitud) {
}
public void findByFecha_asignada(Date fecha_asignada) {
}
public void findByFecha_devolucion(Date fecha_devolucion) {
}
public void findByHora_devolucion(Time hora_devolucion) {
}
public void findByObservacion(String observacion) {
}
public void findByMoroso(Boolean moroso) {
}
public void findByMonto(BigDecimal monto) {
}
public void findByImpreso(Boolean impreso) {
}


public void Listar() {
  solicitudlist.removeAll(solicitudlist);
  Map<String, String> parametros = new HashMap<String, String>();
  solicitudlist = SolicitudPersistencia.getLista(parametros);
  if (solicitudlist== null) {
     JSFUtil.addErrorMessage(SolicitudPersistencia.excepcion.toString());
  }
 }


}
