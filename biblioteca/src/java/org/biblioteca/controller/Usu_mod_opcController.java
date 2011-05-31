package org.biblioteca.controller;

import org.biblioteca.beans.Usu_mod_opc;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.Usu_mod_opcPersistencia;
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
public class Usu_mod_opcController implements Serializable {
private static final long serialVersionUID = 1L;


private Usu_mod_opc usu_mod_opc;

private List<Usu_mod_opc> usu_mod_opclist;

private Usu_mod_opc selectedusu_mod_opc;

SelectItem[] usu_mod_opcItems;


public Usu_mod_opcController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   usu_mod_opc =(Usu_mod_opc) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"usu_mod_opc");
   usu_mod_opclist = new ArrayList<Usu_mod_opc>();
}

public Usu_mod_opc getUsu_mod_opc() {
 return usu_mod_opc;
}

 public void setUsu_mod_opc(Usu_mod_opc usu_mod_opc) {
 this.usu_mod_opc = usu_mod_opc;
}

public Usu_mod_opc getSelectedUsu_mod_opc() {
 return selectedusu_mod_opc;
}

 public void setSelectedUsu_mod_opc(Usu_mod_opc selectedusu_mod_opc) {
 this.selectedusu_mod_opc = selectedusu_mod_opc;
}


public SelectItem[]  getUsu_mod_opcItems() {
return usu_mod_opcItems;
}

public void setUsu_mod_opcItem(SelectItem[] usu_mod_opcItems) {
this.usu_mod_opcItems = usu_mod_opcItems;
}

public List<Usu_mod_opc> getUsu_mod_opclist() {
return usu_mod_opclist;
}

 public void setUsu_mod_opclist(List<Usu_mod_opc> usu_mod_opclist) {
this.usu_mod_opclist = usu_mod_opclist;
}
public void Crear () {
   if (!Usu_mod_opcPersistencia.Insertar(usu_mod_opc)) {
      JSFUtil.addErrorMessage(Usu_mod_opcPersistencia.excepcion.toString());
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
public void findById_usumodopc(Integer id_usumodopc) {
}
public void findById_usuario(Integer id_usuario) {
}
public void findById_modulo(Integer id_modulo) {
}
public void findById_opcion(Integer id_opcion) {
}


public void Listar() {
  usu_mod_opclist.removeAll(usu_mod_opclist);
  Map<String, String> parametros = new HashMap<String, String>();
  usu_mod_opclist = Usu_mod_opcPersistencia.getLista(parametros);
  if (usu_mod_opclist== null) {
     JSFUtil.addErrorMessage(Usu_mod_opcPersistencia.excepcion.toString());
  }
 }


}
