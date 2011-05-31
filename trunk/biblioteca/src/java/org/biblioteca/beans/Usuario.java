package org.biblioteca.beans;

import com.javscazpersitence.anotaciones.Columna;
import com.javscazpersitence.anotaciones.Relaciones;
import com.javscazpersitence.anotaciones.Table;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
/**
*
* @author avbravo
*/

@ManagedBean
@SessionScoped
@Table(nombre= "usuario")
public class Usuario  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_usuario;
private Integer id_sala;
private Integer id_control;
private Integer id_estatus;
private String dni;
private String clave;
private String nombre;
private String apellido;
private String sexo;
private String telefono;
private String celular;
private String email;
private String apostal;
private String direccion;

public Usuario(){
}

public Usuario(Integer id_usuario,Integer id_sala,Integer id_control,Integer id_estatus,String dni,String clave,String nombre,String apellido,String sexo,String telefono,String celular,String email,String apostal,String direccion){
this.id_usuario = id_usuario;
this.id_sala = id_sala;
this.id_control = id_control;
this.id_estatus = id_estatus;
this.dni = dni;
this.clave = clave;
this.nombre = nombre;
this.apellido = apellido;
this.sexo = sexo;
this.telefono = telefono;
this.celular = celular;
this.email = email;
this.apostal = apostal;
this.direccion = direccion;
}


public void setId_usuario (Integer id_usuario) {
 this.id_usuario = id_usuario;
}
@Columna(nombre= "id_usuario" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_usuario ( ) {
return this.id_usuario;
}

public void setId_sala (Integer id_sala) {
 this.id_sala = id_sala;
}
@Relaciones(clase ="Sala", tabla = "sala" ,columna = "id_sala" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_sala", tipo_relacion="uno a uno" )
@Columna(nombre= "id_sala" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_sala ( ) {
return this.id_sala;
}

public void setId_control (Integer id_control) {
 this.id_control = id_control;
}
@Relaciones(clase ="Control", tabla = "control" ,columna = "id_control" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_control", tipo_relacion="uno a uno" )
@Columna(nombre= "id_control" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_control ( ) {
return this.id_control;
}

public void setId_estatus (Integer id_estatus) {
 this.id_estatus = id_estatus;
}
@Relaciones(clase ="Estatus", tabla = "estatus" ,columna = "id_estatus" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_estatus", tipo_relacion="uno a uno" )
@Columna(nombre= "id_estatus" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_estatus ( ) {
return this.id_estatus;
}

public void setDni (String dni) {
 this.dni = dni;
}
@Columna(nombre= "dni" ,isNoNulo=true, tipo ="String" ,tamano =30, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getDni ( ) {
return this.dni;
}

public void setClave (String clave) {
 this.clave = clave;
}
@Columna(nombre= "clave" ,isNoNulo=true, tipo ="String" ,tamano =2147483647, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getClave ( ) {
return this.clave;
}

public void setNombre (String nombre) {
 this.nombre = nombre;
}
@Columna(nombre= "nombre" ,isNoNulo=true, tipo ="String" ,tamano =50, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getNombre ( ) {
return this.nombre;
}

public void setApellido (String apellido) {
 this.apellido = apellido;
}
@Columna(nombre= "apellido" ,isNoNulo=true, tipo ="String" ,tamano =50, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getApellido ( ) {
return this.apellido;
}

public void setSexo (String sexo) {
 this.sexo = sexo;
}
@Columna(nombre= "sexo" ,isNoNulo=false, tipo ="String" ,tamano =1, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getSexo ( ) {
return this.sexo;
}

public void setTelefono (String telefono) {
 this.telefono = telefono;
}
@Columna(nombre= "telefono" ,isNoNulo=false, tipo ="String" ,tamano =30, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getTelefono ( ) {
return this.telefono;
}

public void setCelular (String celular) {
 this.celular = celular;
}
@Columna(nombre= "celular" ,isNoNulo=false, tipo ="String" ,tamano =30, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getCelular ( ) {
return this.celular;
}

public void setEmail (String email) {
 this.email = email;
}
@Columna(nombre= "email" ,isNoNulo=false, tipo ="String" ,tamano =200, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getEmail ( ) {
return this.email;
}

public void setApostal (String apostal) {
 this.apostal = apostal;
}
@Columna(nombre= "apostal" ,isNoNulo=false, tipo ="String" ,tamano =30, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getApostal ( ) {
return this.apostal;
}

public void setDireccion (String direccion) {
 this.direccion = direccion;
}
@Columna(nombre= "direccion" ,isNoNulo=false, tipo ="String" ,tamano =2147483647, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getDireccion ( ) {
return this.direccion;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
