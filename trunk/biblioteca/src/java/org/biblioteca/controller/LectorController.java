package org.biblioteca.controller;

import org.biblioteca.beans.Lector;
import java.sql.Date; 
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.LectorPersistencia;
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
public class LectorController implements Serializable {
private static final long serialVersionUID = 1L;


private Lector lector;

private List<Lector> lectorlist;

private Lector selectedlector;

SelectItem[] lectorItems;


public LectorController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   lector =(Lector) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"lector");
   lectorlist = new ArrayList<Lector>();
}

public Lector getLector() {
 return lector;
}

 public void setLector(Lector lector) {
 this.lector = lector;
}

public Lector getSelectedLector() {
 return selectedlector;
}

 public void setSelectedLector(Lector selectedlector) {
 this.selectedlector = selectedlector;
}


public SelectItem[]  getLectorItems() {
return lectorItems;
}

public void setLectorItem(SelectItem[] lectorItems) {
this.lectorItems = lectorItems;
}

public List<Lector> getLectorlist() {
return lectorlist;
}

 public void setLectorlist(List<Lector> lectorlist) {
this.lectorlist = lectorlist;
}
public void Crear () {
   if (!LectorPersistencia.Insertar(lector)) {
      JSFUtil.addErrorMessage(LectorPersistencia.excepcion.toString());
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
public void findById_lector(Integer id_lector) {
}
public void findById_perfil(Integer id_perfil) {
}
public void findById_region(Integer id_region) {
}
public void findById_dependencia(Integer id_dependencia) {
}
public void findById_estatus(Integer id_estatus) {
}
public void findByDni(String dni) {
}
public void findByClave(String clave) {
}
public void findByNombre(String nombre) {
}
public void findByApellido(String apellido) {
}
public void findBySexo(String sexo) {
}
public void findByTelefono(String telefono) {
}
public void findByCelular(String celular) {
}
public void findByEmail(String email) {
}
public void findByApostal(String apostal) {
}
public void findByDireccion(String direccion) {
}
public void findByObservacion(String observacion) {
}
public void findByExpira_carnet(Date expira_carnet) {
}
public void findByExpira_prestamo(Date expira_prestamo) {
}
public void findByNacio(Date nacio) {
}


public void Listar() {
  lectorlist.removeAll(lectorlist);
  Map<String, String> parametros = new HashMap<String, String>();
  lectorlist = LectorPersistencia.getLista(parametros);
  if (lectorlist== null) {
     JSFUtil.addErrorMessage(LectorPersistencia.excepcion.toString());
  }
 }


}
