package org.biblioteca.controller;

import org.biblioteca.beans.Usuario;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.UsuarioPersistencia;
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
public class UsuarioController implements Serializable {
private static final long serialVersionUID = 1L;


private Usuario usuario;

private List<Usuario> usuariolist;

private Usuario selectedusuario;

SelectItem[] usuarioItems;


public UsuarioController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   usuario =(Usuario) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"usuario");
   usuariolist = new ArrayList<Usuario>();
}

public Usuario getUsuario() {
 return usuario;
}

 public void setUsuario(Usuario usuario) {
 this.usuario = usuario;
}

public Usuario getSelectedUsuario() {
 return selectedusuario;
}

 public void setSelectedUsuario(Usuario selectedusuario) {
 this.selectedusuario = selectedusuario;
}


public SelectItem[]  getUsuarioItems() {
return usuarioItems;
}

public void setUsuarioItem(SelectItem[] usuarioItems) {
this.usuarioItems = usuarioItems;
}

public List<Usuario> getUsuariolist() {
return usuariolist;
}

 public void setUsuariolist(List<Usuario> usuariolist) {
this.usuariolist = usuariolist;
}
public void Crear () {
   if (!UsuarioPersistencia.Insertar(usuario)) {
      JSFUtil.addErrorMessage(UsuarioPersistencia.excepcion.toString());
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
public void findById_usuario(Integer id_usuario) {
}
public void findById_sala(Integer id_sala) {
}
public void findById_control(Integer id_control) {
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


public void Listar() {
  usuariolist.removeAll(usuariolist);
  Map<String, String> parametros = new HashMap<String, String>();
  usuariolist = UsuarioPersistencia.getLista(parametros);
  if (usuariolist== null) {
     JSFUtil.addErrorMessage(UsuarioPersistencia.excepcion.toString());
  }
 }


}
