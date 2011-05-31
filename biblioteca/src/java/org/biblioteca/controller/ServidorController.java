package org.biblioteca.controller;

import org.biblioteca.beans.Servidor;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.ServidorPersistencia;
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
public class ServidorController implements Serializable {
private static final long serialVersionUID = 1L;


private Servidor servidor;

private List<Servidor> servidorlist;

private Servidor selectedservidor;

SelectItem[] servidorItems;


public ServidorController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   servidor =(Servidor) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"servidor");
   servidorlist = new ArrayList<Servidor>();
}

public Servidor getServidor() {
 return servidor;
}

 public void setServidor(Servidor servidor) {
 this.servidor = servidor;
}

public Servidor getSelectedServidor() {
 return selectedservidor;
}

 public void setSelectedServidor(Servidor selectedservidor) {
 this.selectedservidor = selectedservidor;
}


public SelectItem[]  getServidorItems() {
return servidorItems;
}

public void setServidorItem(SelectItem[] servidorItems) {
this.servidorItems = servidorItems;
}

public List<Servidor> getServidorlist() {
return servidorlist;
}

 public void setServidorlist(List<Servidor> servidorlist) {
this.servidorlist = servidorlist;
}
public void Crear () {
   if (!ServidorPersistencia.Insertar(servidor)) {
      JSFUtil.addErrorMessage(ServidorPersistencia.excepcion.toString());
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
public void findById_servidor(Integer id_servidor) {
}
public void findByNombre(String nombre) {
}
public void findByHost(String host) {
}
public void findByBasedato(String basedato) {
}
public void findByPuerto(Integer puerto) {
}
public void findByUsuario(String usuario) {
}
public void findByClave(String clave) {
}


public void Listar() {
  servidorlist.removeAll(servidorlist);
  Map<String, String> parametros = new HashMap<String, String>();
  servidorlist = ServidorPersistencia.getLista(parametros);
  if (servidorlist== null) {
     JSFUtil.addErrorMessage(ServidorPersistencia.excepcion.toString());
  }
 }


}
