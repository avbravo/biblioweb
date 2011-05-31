package org.biblioteca.controller;

import org.biblioteca.beans.Marc_ejemplar;
import java.sql.Date; 
import java.sql.Time;
 import java.math.BigDecimal;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.Marc_ejemplarPersistencia;
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
public class Marc_ejemplarController implements Serializable {
private static final long serialVersionUID = 1L;


private Marc_ejemplar marc_ejemplar;

private List<Marc_ejemplar> marc_ejemplarlist;

private Marc_ejemplar selectedmarc_ejemplar;

SelectItem[] marc_ejemplarItems;


public Marc_ejemplarController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   marc_ejemplar =(Marc_ejemplar) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"marc_ejemplar");
   marc_ejemplarlist = new ArrayList<Marc_ejemplar>();
}

public Marc_ejemplar getMarc_ejemplar() {
 return marc_ejemplar;
}

 public void setMarc_ejemplar(Marc_ejemplar marc_ejemplar) {
 this.marc_ejemplar = marc_ejemplar;
}

public Marc_ejemplar getSelectedMarc_ejemplar() {
 return selectedmarc_ejemplar;
}

 public void setSelectedMarc_ejemplar(Marc_ejemplar selectedmarc_ejemplar) {
 this.selectedmarc_ejemplar = selectedmarc_ejemplar;
}


public SelectItem[]  getMarc_ejemplarItems() {
return marc_ejemplarItems;
}

public void setMarc_ejemplarItem(SelectItem[] marc_ejemplarItems) {
this.marc_ejemplarItems = marc_ejemplarItems;
}

public List<Marc_ejemplar> getMarc_ejemplarlist() {
return marc_ejemplarlist;
}

 public void setMarc_ejemplarlist(List<Marc_ejemplar> marc_ejemplarlist) {
this.marc_ejemplarlist = marc_ejemplarlist;
}
public void Crear () {
   if (!Marc_ejemplarPersistencia.Insertar(marc_ejemplar)) {
      JSFUtil.addErrorMessage(Marc_ejemplarPersistencia.excepcion.toString());
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
public void findById_ejemplar(Integer id_ejemplar) {
}
public void findById_sala(Integer id_sala) {
}
public void findById_adquisicion(Integer id_adquisicion) {
}
public void findById_estatus(Integer id_estatus) {
}
public void findByCodigo_barra(String codigo_barra) {
}
public void findByObservacion(String observacion) {
}
public void findByFecha(Date fecha) {
}
public void findByHora(Time hora) {
}
public void findByNumero(String numero) {
}
public void findByMonto(BigDecimal monto) {
}
public void findById_usuario(Integer id_usuario) {
}
public void findById_serie(Integer id_serie) {
}
public void findByVerificado(Boolean verificado) {
}


public void Listar() {
  marc_ejemplarlist.removeAll(marc_ejemplarlist);
  Map<String, String> parametros = new HashMap<String, String>();
  marc_ejemplarlist = Marc_ejemplarPersistencia.getLista(parametros);
  if (marc_ejemplarlist== null) {
     JSFUtil.addErrorMessage(Marc_ejemplarPersistencia.excepcion.toString());
  }
 }


}
