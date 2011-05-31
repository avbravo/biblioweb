package org.biblioteca.controller;

import org.biblioteca.beans.Modulo;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.ModuloPersistencia;
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
public class ModuloController implements Serializable {
private static final long serialVersionUID = 1L;


private Modulo modulo;

private List<Modulo> modulolist;

private Modulo selectedmodulo;

SelectItem[] moduloItems;


public ModuloController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   modulo =(Modulo) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"modulo");
   modulolist = new ArrayList<Modulo>();
}

public Modulo getModulo() {
 return modulo;
}

 public void setModulo(Modulo modulo) {
 this.modulo = modulo;
}

public Modulo getSelectedModulo() {
 return selectedmodulo;
}

 public void setSelectedModulo(Modulo selectedmodulo) {
 this.selectedmodulo = selectedmodulo;
}


public SelectItem[]  getModuloItems() {
return moduloItems;
}

public void setModuloItem(SelectItem[] moduloItems) {
this.moduloItems = moduloItems;
}

public List<Modulo> getModulolist() {
return modulolist;
}

 public void setModulolist(List<Modulo> modulolist) {
this.modulolist = modulolist;
}
public void Crear () {
   if (!ModuloPersistencia.Insertar(modulo)) {
      JSFUtil.addErrorMessage(ModuloPersistencia.excepcion.toString());
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
public void findById_modulo(Integer id_modulo) {
}
public void findByNombre(String nombre) {
}


public void Listar() {
  modulolist.removeAll(modulolist);
  Map<String, String> parametros = new HashMap<String, String>();
  modulolist = ModuloPersistencia.getLista(parametros);
  if (modulolist== null) {
     JSFUtil.addErrorMessage(ModuloPersistencia.excepcion.toString());
  }
 }


}
