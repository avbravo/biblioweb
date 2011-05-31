package org.biblioteca.controller;

import org.biblioteca.beans.Proveedor;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.ProveedorPersistencia;
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
public class ProveedorController implements Serializable {
private static final long serialVersionUID = 1L;


private Proveedor proveedor;

private List<Proveedor> proveedorlist;

private Proveedor selectedproveedor;

SelectItem[] proveedorItems;


public ProveedorController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   proveedor =(Proveedor) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"proveedor");
   proveedorlist = new ArrayList<Proveedor>();
}

public Proveedor getProveedor() {
 return proveedor;
}

 public void setProveedor(Proveedor proveedor) {
 this.proveedor = proveedor;
}

public Proveedor getSelectedProveedor() {
 return selectedproveedor;
}

 public void setSelectedProveedor(Proveedor selectedproveedor) {
 this.selectedproveedor = selectedproveedor;
}


public SelectItem[]  getProveedorItems() {
return proveedorItems;
}

public void setProveedorItem(SelectItem[] proveedorItems) {
this.proveedorItems = proveedorItems;
}

public List<Proveedor> getProveedorlist() {
return proveedorlist;
}

 public void setProveedorlist(List<Proveedor> proveedorlist) {
this.proveedorlist = proveedorlist;
}
public void Crear () {
   if (!ProveedorPersistencia.Insertar(proveedor)) {
      JSFUtil.addErrorMessage(ProveedorPersistencia.excepcion.toString());
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
public void findById_proveedor(Integer id_proveedor) {
}
public void findByNombre(String nombre) {
}
public void findByTelefono(String telefono) {
}
public void findByEmail(String email) {
}
public void findByFax(String fax) {
}
public void findByDireccion(String direccion) {
}


public void Listar() {
  proveedorlist.removeAll(proveedorlist);
  Map<String, String> parametros = new HashMap<String, String>();
  proveedorlist = ProveedorPersistencia.getLista(parametros);
  if (proveedorlist== null) {
     JSFUtil.addErrorMessage(ProveedorPersistencia.excepcion.toString());
  }
 }


}
