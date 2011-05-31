package org.biblioteca.beans;

import java.sql.Date; 
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
@Table(nombre= "lector")
public class Lector  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_lector;
private Integer id_perfil;
private Integer id_region;
private Integer id_dependencia;
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
private String observacion;
private Date expira_carnet;
private Date expira_prestamo;
private Date nacio;

public Lector(){
}

public Lector(Integer id_lector,Integer id_perfil,Integer id_region,Integer id_dependencia,Integer id_estatus,String dni,String clave,String nombre,String apellido,String sexo,String telefono,String celular,String email,String apostal,String direccion,String observacion,Date expira_carnet,Date expira_prestamo,Date nacio){
this.id_lector = id_lector;
this.id_perfil = id_perfil;
this.id_region = id_region;
this.id_dependencia = id_dependencia;
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
this.observacion = observacion;
this.expira_carnet = expira_carnet;
this.expira_prestamo = expira_prestamo;
this.nacio = nacio;
}


public void setId_lector (Integer id_lector) {
 this.id_lector = id_lector;
}
@Columna(nombre= "id_lector" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_lector ( ) {
return this.id_lector;
}

public void setId_perfil (Integer id_perfil) {
 this.id_perfil = id_perfil;
}
@Relaciones(clase ="Perfil", tabla = "perfil" ,columna = "id_perfil" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_perfil", tipo_relacion="uno a uno" )
@Columna(nombre= "id_perfil" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_perfil ( ) {
return this.id_perfil;
}

public void setId_region (Integer id_region) {
 this.id_region = id_region;
}
@Relaciones(clase ="Region", tabla = "region" ,columna = "id_region" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_region", tipo_relacion="uno a uno" )
@Columna(nombre= "id_region" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_region ( ) {
return this.id_region;
}

public void setId_dependencia (Integer id_dependencia) {
 this.id_dependencia = id_dependencia;
}
@Relaciones(clase ="Dependencia", tabla = "dependencia" ,columna = "id_dependencia" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_dependencia", tipo_relacion="uno a uno" )
@Columna(nombre= "id_dependencia" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_dependencia ( ) {
return this.id_dependencia;
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
@Columna(nombre= "sexo" ,isNoNulo=true, tipo ="String" ,tamano =1, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
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

public void setObservacion (String observacion) {
 this.observacion = observacion;
}
@Columna(nombre= "observacion" ,isNoNulo=false, tipo ="String" ,tamano =2147483647, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getObservacion ( ) {
return this.observacion;
}

public void setExpira_carnet (Date expira_carnet) {
 this.expira_carnet = expira_carnet;
}
@Columna(nombre= "expira_carnet" ,isNoNulo=false, tipo ="Date" ,tamano =13, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Date getExpira_carnet ( ) {
return this.expira_carnet;
}

public void setExpira_prestamo (Date expira_prestamo) {
 this.expira_prestamo = expira_prestamo;
}
@Columna(nombre= "expira_prestamo" ,isNoNulo=false, tipo ="Date" ,tamano =13, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Date getExpira_prestamo ( ) {
return this.expira_prestamo;
}

public void setNacio (Date nacio) {
 this.nacio = nacio;
}
@Columna(nombre= "nacio" ,isNoNulo=false, tipo ="Date" ,tamano =13, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Date getNacio ( ) {
return this.nacio;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
