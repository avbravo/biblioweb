package org.biblioteca.controller;

import org.biblioteca.beans.Estatus;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.EstatusPersistencia;
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
public class EstatusController implements Serializable {
private static final long serialVersionUID = 1L;


private Estatus estatus;

private List<Estatus> estatuslist;

private Estatus selectedestatus;

SelectItem[] estatusItems;


public EstatusController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   estatus =(Estatus) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"estatus");
   estatuslist = new ArrayList<Estatus>();
}

public Estatus getEstatus() {
 return estatus;
}

 public void setEstatus(Estatus estatus) {
 this.estatus = estatus;
}

public Estatus getSelectedEstatus() {
 return selectedestatus;
}

 public void setSelectedEstatus(Estatus selectedestatus) {
 this.selectedestatus = selectedestatus;
}


public SelectItem[]  getEstatusItems() {
return estatusItems;
}

public void setEstatusItem(SelectItem[] estatusItems) {
this.estatusItems = estatusItems;
}

public List<Estatus> getEstatuslist() {
return estatuslist;
}

 public void setEstatuslist(List<Estatus> estatuslist) {
this.estatuslist = estatuslist;
}
public void Crear () {
   if (!EstatusPersistencia.Insertar(estatus)) {
      JSFUtil.addErrorMessage(EstatusPersistencia.excepcion.toString());
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
public void findById_estatus(Integer id_estatus) {
}
public void findById_modulo(Integer id_modulo) {
}
public void findByNombre(String nombre) {
}
public void findByHabilitado(Boolean habilitado) {
}


public void Listar() {
  estatuslist.removeAll(estatuslist);
  Map<String, String> parametros = new HashMap<String, String>();
  estatuslist = EstatusPersistencia.getLista(parametros);
  if (estatuslist== null) {
     JSFUtil.addErrorMessage(EstatusPersistencia.excepcion.toString());
  }
 }


}
