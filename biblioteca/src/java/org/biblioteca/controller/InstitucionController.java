package org.biblioteca.controller;

import org.biblioteca.beans.Institucion;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.InstitucionPersistencia;
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
public class InstitucionController implements Serializable {
private static final long serialVersionUID = 1L;


private Institucion institucion;

private List<Institucion> institucionlist;

private Institucion selectedinstitucion;

SelectItem[] institucionItems;


public InstitucionController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   institucion =(Institucion) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"institucion");
   institucionlist = new ArrayList<Institucion>();
}

public Institucion getInstitucion() {
 return institucion;
}

 public void setInstitucion(Institucion institucion) {
 this.institucion = institucion;
}

public Institucion getSelectedInstitucion() {
 return selectedinstitucion;
}

 public void setSelectedInstitucion(Institucion selectedinstitucion) {
 this.selectedinstitucion = selectedinstitucion;
}


public SelectItem[]  getInstitucionItems() {
return institucionItems;
}

public void setInstitucionItem(SelectItem[] institucionItems) {
this.institucionItems = institucionItems;
}

public List<Institucion> getInstitucionlist() {
return institucionlist;
}

 public void setInstitucionlist(List<Institucion> institucionlist) {
this.institucionlist = institucionlist;
}
public void Crear () {
   if (!InstitucionPersistencia.Insertar(institucion)) {
      JSFUtil.addErrorMessage(InstitucionPersistencia.excepcion.toString());
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
public void findById_institucion(Integer id_institucion) {
}
public void findByNombre(String nombre) {
}
public void findBySiglas(String siglas) {
}


public void Listar() {
  institucionlist.removeAll(institucionlist);
  Map<String, String> parametros = new HashMap<String, String>();
  institucionlist = InstitucionPersistencia.getLista(parametros);
  if (institucionlist== null) {
     JSFUtil.addErrorMessage(InstitucionPersistencia.excepcion.toString());
  }
 }


}
