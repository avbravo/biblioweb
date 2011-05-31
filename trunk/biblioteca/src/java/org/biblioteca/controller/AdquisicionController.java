package org.biblioteca.controller;

import org.biblioteca.beans.Adquisicion;
import java.sql.Date; 
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.AdquisicionPersistencia;
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
public class AdquisicionController implements Serializable {
private static final long serialVersionUID = 1L;


private Adquisicion adquisicion;

private List<Adquisicion> adquisicionlist;

private Adquisicion selectedadquisicion;

SelectItem[] adquisicionItems;


public AdquisicionController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   adquisicion =(Adquisicion) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"adquisicion");
   adquisicionlist = new ArrayList<Adquisicion>();
}

public Adquisicion getAdquisicion() {
 return adquisicion;
}

 public void setAdquisicion(Adquisicion adquisicion) {
 this.adquisicion = adquisicion;
}

public Adquisicion getSelectedAdquisicion() {
 return selectedadquisicion;
}

 public void setSelectedAdquisicion(Adquisicion selectedadquisicion) {
 this.selectedadquisicion = selectedadquisicion;
}


public SelectItem[]  getAdquisicionItems() {
return adquisicionItems;
}

public void setAdquisicionItem(SelectItem[] adquisicionItems) {
this.adquisicionItems = adquisicionItems;
}

public List<Adquisicion> getAdquisicionlist() {
return adquisicionlist;
}

 public void setAdquisicionlist(List<Adquisicion> adquisicionlist) {
this.adquisicionlist = adquisicionlist;
}
public void Crear () {
   if (!AdquisicionPersistencia.Insertar(adquisicion)) {
      JSFUtil.addErrorMessage(AdquisicionPersistencia.excepcion.toString());
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
public void findById_adquisicion(Integer id_adquisicion) {
}
public void findById_cuenta(Integer id_cuenta) {
}
public void findById_institucion(Integer id_institucion) {
}
public void findByCantidad(Integer cantidad) {
}
public void findByDetalle(String detalle) {
}
public void findByFecha(Date fecha) {
}


public void Listar() {
  adquisicionlist.removeAll(adquisicionlist);
  Map<String, String> parametros = new HashMap<String, String>();
  adquisicionlist = AdquisicionPersistencia.getLista(parametros);
  if (adquisicionlist== null) {
     JSFUtil.addErrorMessage(AdquisicionPersistencia.excepcion.toString());
  }
 }


}
