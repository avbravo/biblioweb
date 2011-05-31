package org.biblioteca.controller;

import org.biblioteca.beans.Region;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.RegionPersistencia;
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
public class RegionController implements Serializable {
private static final long serialVersionUID = 1L;


private Region region;

private List<Region> regionlist;

private Region selectedregion;

SelectItem[] regionItems;


public RegionController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   region =(Region) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"region");
   regionlist = new ArrayList<Region>();
}

public Region getRegion() {
 return region;
}

 public void setRegion(Region region) {
 this.region = region;
}

public Region getSelectedRegion() {
 return selectedregion;
}

 public void setSelectedRegion(Region selectedregion) {
 this.selectedregion = selectedregion;
}


public SelectItem[]  getRegionItems() {
return regionItems;
}

public void setRegionItem(SelectItem[] regionItems) {
this.regionItems = regionItems;
}

public List<Region> getRegionlist() {
return regionlist;
}

 public void setRegionlist(List<Region> regionlist) {
this.regionlist = regionlist;
}
public void Crear () {
   if (!RegionPersistencia.Insertar(region)) {
      JSFUtil.addErrorMessage(RegionPersistencia.excepcion.toString());
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
public void findById_region(Integer id_region) {
}
public void findById_pais(Integer id_pais) {
}
public void findByNombre(String nombre) {
}


public void Listar() {
  regionlist.removeAll(regionlist);
  Map<String, String> parametros = new HashMap<String, String>();
  regionlist = RegionPersistencia.getLista(parametros);
  if (regionlist== null) {
     JSFUtil.addErrorMessage(RegionPersistencia.excepcion.toString());
  }
 }


}
