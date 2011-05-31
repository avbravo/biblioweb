package org.biblioteca.controller;

import org.biblioteca.beans.Pais;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.PaisPersistencia;
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
public class PaisController implements Serializable {
private static final long serialVersionUID = 1L;


private Pais pais;

private List<Pais> paislist;

private Pais selectedpais;

SelectItem[] paisItems;


public PaisController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   pais =(Pais) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"pais");
   paislist = new ArrayList<Pais>();
}

public Pais getPais() {
 return pais;
}

 public void setPais(Pais pais) {
 this.pais = pais;
}

public Pais getSelectedPais() {
 return selectedpais;
}

 public void setSelectedPais(Pais selectedpais) {
 this.selectedpais = selectedpais;
}


public SelectItem[]  getPaisItems() {
return paisItems;
}

public void setPaisItem(SelectItem[] paisItems) {
this.paisItems = paisItems;
}

public List<Pais> getPaislist() {
return paislist;
}

 public void setPaislist(List<Pais> paislist) {
this.paislist = paislist;
}
public void Crear () {
   if (!PaisPersistencia.Insertar(pais)) {
      JSFUtil.addErrorMessage(PaisPersistencia.excepcion.toString());
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
public void findById_pais(Integer id_pais) {
}
public void findByNombre(String nombre) {
}
public void findByCodigo_area(String codigo_area) {
}
public void findBySiglas(String siglas) {
}


public void Listar() {
  paislist.removeAll(paislist);
  Map<String, String> parametros = new HashMap<String, String>();
  paislist = PaisPersistencia.getLista(parametros);
  if (paislist== null) {
     JSFUtil.addErrorMessage(PaisPersistencia.excepcion.toString());
  }
 }


}
