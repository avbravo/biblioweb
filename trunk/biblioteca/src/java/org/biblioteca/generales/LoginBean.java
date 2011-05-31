package org.biblioteca.generales ;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import com.javscazpersitence.anotaciones.persistencia.Configuracion;
import java.util.ResourceBundle;
import org.biblioteca.menu.MenuBeans;
import javax.el.ELContext;
/**
*
* @author avbravo
*/

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {
private static final long serialVersionUID = 1L;
MenuBeans menuBeans;
 boolean logeado = false;
 private String username;
 private String password;
 private String nombreUsuarioLogeado="";
public LoginBean() {
   ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   menuBeans = (MenuBeans) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "menuBeans");
   ResourceBundle rb = ResourceBundle.getBundle("org.biblioteca.properties.configuration");
   Configuracion configuracion = new Configuracion();
   if(!configuracion.CargarArchivo(rb)){
      JSFUtil.addErrorMessage(configuracion.excepcion,"");
    }
}

 public String getNombreUsuarioLogeado() {
 return nombreUsuarioLogeado;
 }
 public void setNombreUsuarioLogeado(String nombreUsuarioLogeado) {
this.nombreUsuarioLogeado = nombreUsuarioLogeado;
}

 public String getPassword() {
 return password;
 }

public void setPassword(String password) {
 this.password = password;
 }

public String getUsername() {
return username;
}

 public void setUsername(String username) {
this.username = username;
}

public boolean isLogeado() {
  return logeado;
}

public void setLogeado(boolean logeado) {
  this.logeado = logeado;
}

public String VerificarLogin(){
try {
  if (username.equals("test") && password.equals("test")){
     menuBeans.ActivarTodos();
     this.logeado = true;
     nombreUsuarioLogeado = "Test";
     JSFUtil.addSuccessMessage("Bienvenido");
     return "/index";
   }
 else {
     JSFUtil.addSuccessMessage("Usuario o Password incorrecto");
}
    } catch (Exception e) {
      JSFUtil.addErrorMessage(e, "Error. VerificarLogin()");
    }
    return null;
}

public String logout() {
  HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
  if (session != null) {
      session.invalidate();
  }
  return "/index";
  }
}
