package org.biblioteca.controller;

import org.biblioteca.beans.Biblioteca;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.BibliotecaPersistencia;
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
public class BibliotecaController implements Serializable {
private static final long serialVersionUID = 1L;


private Biblioteca biblioteca;

private List<Biblioteca> bibliotecalist;

private Biblioteca selectedbiblioteca;

SelectItem[] bibliotecaItems;


public BibliotecaController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   biblioteca =(Biblioteca) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"biblioteca");
   bibliotecalist = new ArrayList<Biblioteca>();
}

public Biblioteca getBiblioteca() {
 return biblioteca;
}

 public void setBiblioteca(Biblioteca biblioteca) {
 this.biblioteca = biblioteca;
}

public Biblioteca getSelectedBiblioteca() {
 return selectedbiblioteca;
}

 public void setSelectedBiblioteca(Biblioteca selectedbiblioteca) {
 this.selectedbiblioteca = selectedbiblioteca;
}


public SelectItem[]  getBibliotecaItems() {
return bibliotecaItems;
}

public void setBibliotecaItem(SelectItem[] bibliotecaItems) {
this.bibliotecaItems = bibliotecaItems;
}

public List<Biblioteca> getBibliotecalist() {
return bibliotecalist;
}

 public void setBibliotecalist(List<Biblioteca> bibliotecalist) {
this.bibliotecalist = bibliotecalist;
}
public void Crear () {
   if (!BibliotecaPersistencia.Insertar(biblioteca)) {
      JSFUtil.addErrorMessage(BibliotecaPersistencia.excepcion.toString());
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
public void findById_biblioteca(Integer id_biblioteca) {
}
public void findById_institucion(Integer id_institucion) {
}
public void findById_region(Integer id_region) {
}
public void findById_estatus(Integer id_estatus) {
}
public void findByCodigo(String codigo) {
}
public void findByNombre(String nombre) {
}
public void findByTelefono(String telefono) {
}
public void findByFax(String fax) {
}
public void findByEmail(String email) {
}
public void findByApostal(String apostal) {
}
public void findByDireccion(String direccion) {
}
public void findByObservacion(String observacion) {
}


public void Listar() {
  bibliotecalist.removeAll(bibliotecalist);
  Map<String, String> parametros = new HashMap<String, String>();
  bibliotecalist = BibliotecaPersistencia.getLista(parametros);
  if (bibliotecalist== null) {
     JSFUtil.addErrorMessage(BibliotecaPersistencia.excepcion.toString());
  }
 }


}
