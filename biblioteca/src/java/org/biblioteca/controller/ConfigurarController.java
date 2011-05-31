package org.biblioteca.controller;

import org.biblioteca.beans.Configurar;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.ConfigurarPersistencia;
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
public class ConfigurarController implements Serializable {
private static final long serialVersionUID = 1L;


private Configurar configurar;

private List<Configurar> configurarlist;

private Configurar selectedconfigurar;

SelectItem[] configurarItems;


public ConfigurarController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   configurar =(Configurar) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"configurar");
   configurarlist = new ArrayList<Configurar>();
}

public Configurar getConfigurar() {
 return configurar;
}

 public void setConfigurar(Configurar configurar) {
 this.configurar = configurar;
}

public Configurar getSelectedConfigurar() {
 return selectedconfigurar;
}

 public void setSelectedConfigurar(Configurar selectedconfigurar) {
 this.selectedconfigurar = selectedconfigurar;
}


public SelectItem[]  getConfigurarItems() {
return configurarItems;
}

public void setConfigurarItem(SelectItem[] configurarItems) {
this.configurarItems = configurarItems;
}

public List<Configurar> getConfigurarlist() {
return configurarlist;
}

 public void setConfigurarlist(List<Configurar> configurarlist) {
this.configurarlist = configurarlist;
}
public void Crear () {
   if (!ConfigurarPersistencia.Insertar(configurar)) {
      JSFUtil.addErrorMessage(ConfigurarPersistencia.excepcion.toString());
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
public void findById_configurar(Integer id_configurar) {
}
public void findByDescripcion(String descripcion) {
}
public void findByTexto(String texto) {
}
public void findByValor(Integer valor) {
}


public void Listar() {
  configurarlist.removeAll(configurarlist);
  Map<String, String> parametros = new HashMap<String, String>();
  configurarlist = ConfigurarPersistencia.getLista(parametros);
  if (configurarlist== null) {
     JSFUtil.addErrorMessage(ConfigurarPersistencia.excepcion.toString());
  }
 }


}
