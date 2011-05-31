package org.biblioteca.controller;

import org.biblioteca.beans.Traslado;
import java.sql.Date; 
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.TrasladoPersistencia;
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
public class TrasladoController implements Serializable {
private static final long serialVersionUID = 1L;


private Traslado traslado;

private List<Traslado> trasladolist;

private Traslado selectedtraslado;

SelectItem[] trasladoItems;


public TrasladoController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   traslado =(Traslado) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"traslado");
   trasladolist = new ArrayList<Traslado>();
}

public Traslado getTraslado() {
 return traslado;
}

 public void setTraslado(Traslado traslado) {
 this.traslado = traslado;
}

public Traslado getSelectedTraslado() {
 return selectedtraslado;
}

 public void setSelectedTraslado(Traslado selectedtraslado) {
 this.selectedtraslado = selectedtraslado;
}


public SelectItem[]  getTrasladoItems() {
return trasladoItems;
}

public void setTrasladoItem(SelectItem[] trasladoItems) {
this.trasladoItems = trasladoItems;
}

public List<Traslado> getTrasladolist() {
return trasladolist;
}

 public void setTrasladolist(List<Traslado> trasladolist) {
this.trasladolist = trasladolist;
}
public void Crear () {
   if (!TrasladoPersistencia.Insertar(traslado)) {
      JSFUtil.addErrorMessage(TrasladoPersistencia.excepcion.toString());
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
public void findById_traslado(Integer id_traslado) {
}
public void findById_usuario_ori(Integer id_usuario_ori) {
}
public void findById_usuario_des(Integer id_usuario_des) {
}
public void findById_sala_ori(Integer id_sala_ori) {
}
public void findById_sala_des(Integer id_sala_des) {
}
public void findById_ejemplar(Integer id_ejemplar) {
}
public void findByFecha_ori(Date fecha_ori) {
}
public void findByFecha_des(Date fecha_des) {
}
public void findByTemporal(Boolean temporal) {
}


public void Listar() {
  trasladolist.removeAll(trasladolist);
  Map<String, String> parametros = new HashMap<String, String>();
  trasladolist = TrasladoPersistencia.getLista(parametros);
  if (trasladolist== null) {
     JSFUtil.addErrorMessage(TrasladoPersistencia.excepcion.toString());
  }
 }


}
