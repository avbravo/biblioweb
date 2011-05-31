package org.biblioteca.controller;

import org.biblioteca.beans.Perfil;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.PerfilPersistencia;
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
public class PerfilController implements Serializable {
private static final long serialVersionUID = 1L;


private Perfil perfil;

private List<Perfil> perfillist;

private Perfil selectedperfil;

SelectItem[] perfilItems;


public PerfilController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   perfil =(Perfil) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"perfil");
   perfillist = new ArrayList<Perfil>();
}

public Perfil getPerfil() {
 return perfil;
}

 public void setPerfil(Perfil perfil) {
 this.perfil = perfil;
}

public Perfil getSelectedPerfil() {
 return selectedperfil;
}

 public void setSelectedPerfil(Perfil selectedperfil) {
 this.selectedperfil = selectedperfil;
}


public SelectItem[]  getPerfilItems() {
return perfilItems;
}

public void setPerfilItem(SelectItem[] perfilItems) {
this.perfilItems = perfilItems;
}

public List<Perfil> getPerfillist() {
return perfillist;
}

 public void setPerfillist(List<Perfil> perfillist) {
this.perfillist = perfillist;
}
public void Crear () {
   if (!PerfilPersistencia.Insertar(perfil)) {
      JSFUtil.addErrorMessage(PerfilPersistencia.excepcion.toString());
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
public void findById_perfil(Integer id_perfil) {
}
public void findByNombre(String nombre) {
}


public void Listar() {
  perfillist.removeAll(perfillist);
  Map<String, String> parametros = new HashMap<String, String>();
  perfillist = PerfilPersistencia.getLista(parametros);
  if (perfillist== null) {
     JSFUtil.addErrorMessage(PerfilPersistencia.excepcion.toString());
  }
 }


}
