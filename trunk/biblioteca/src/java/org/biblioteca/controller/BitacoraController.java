package org.biblioteca.controller;

import org.biblioteca.beans.Bitacora;
import java.sql.Date; 
import java.sql.Time;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.BitacoraPersistencia;
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
public class BitacoraController implements Serializable {
private static final long serialVersionUID = 1L;


private Bitacora bitacora;

private List<Bitacora> bitacoralist;

private Bitacora selectedbitacora;

SelectItem[] bitacoraItems;


public BitacoraController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   bitacora =(Bitacora) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"bitacora");
   bitacoralist = new ArrayList<Bitacora>();
}

public Bitacora getBitacora() {
 return bitacora;
}

 public void setBitacora(Bitacora bitacora) {
 this.bitacora = bitacora;
}

public Bitacora getSelectedBitacora() {
 return selectedbitacora;
}

 public void setSelectedBitacora(Bitacora selectedbitacora) {
 this.selectedbitacora = selectedbitacora;
}


public SelectItem[]  getBitacoraItems() {
return bitacoraItems;
}

public void setBitacoraItem(SelectItem[] bitacoraItems) {
this.bitacoraItems = bitacoraItems;
}

public List<Bitacora> getBitacoralist() {
return bitacoralist;
}

 public void setBitacoralist(List<Bitacora> bitacoralist) {
this.bitacoralist = bitacoralist;
}
public void Crear () {
   if (!BitacoraPersistencia.Insertar(bitacora)) {
      JSFUtil.addErrorMessage(BitacoraPersistencia.excepcion.toString());
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
public void findById_bitacora(Integer id_bitacora) {
}
public void findById_usuario(Integer id_usuario) {
}
public void findById_modulo(Integer id_modulo) {
}
public void findById_opcion(Integer id_opcion) {
}
public void findByRegistro(String registro) {
}
public void findByFecha(Date fecha) {
}
public void findByHora(Time hora) {
}
public void findByIp(String ip) {
}


public void Listar() {
  bitacoralist.removeAll(bitacoralist);
  Map<String, String> parametros = new HashMap<String, String>();
  bitacoralist = BitacoraPersistencia.getLista(parametros);
  if (bitacoralist== null) {
     JSFUtil.addErrorMessage(BitacoraPersistencia.excepcion.toString());
  }
 }


}
