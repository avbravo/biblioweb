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
@Table(nombre= "biblioteca")
public class Biblioteca  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_biblioteca;
private Integer id_institucion;
private Integer id_region;
private Integer id_estatus;
private String codigo;
private String nombre;
private String telefono;
private String fax;
private String email;
private String apostal;
private String direccion;
private String observacion;

public Biblioteca(){
}

public Biblioteca(Integer id_biblioteca,Integer id_institucion,Integer id_region,Integer id_estatus,String codigo,String nombre,String telefono,String fax,String email,String apostal,String direccion,String observacion){
this.id_biblioteca = id_biblioteca;
this.id_institucion = id_institucion;
this.id_region = id_region;
this.id_estatus = id_estatus;
this.codigo = codigo;
this.nombre = nombre;
this.telefono = telefono;
this.fax = fax;
this.email = email;
this.apostal = apostal;
this.direccion = direccion;
this.observacion = observacion;
}


public void setId_biblioteca (Integer id_biblioteca) {
 this.id_biblioteca = id_biblioteca;
}
@Columna(nombre= "id_biblioteca" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_biblioteca ( ) {
return this.id_biblioteca;
}

public void setId_institucion (Integer id_institucion) {
 this.id_institucion = id_institucion;
}
@Relaciones(clase ="Institucion", tabla = "institucion" ,columna = "id_institucion" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_institucion", tipo_relacion="uno a uno" )
@Columna(nombre= "id_institucion" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_institucion ( ) {
return this.id_institucion;
}

public void setId_region (Integer id_region) {
 this.id_region = id_region;
}
@Relaciones(clase ="Region", tabla = "region" ,columna = "id_region" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_region", tipo_relacion="uno a uno" )
@Columna(nombre= "id_region" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_region ( ) {
return this.id_region;
}

public void setId_estatus (Integer id_estatus) {
 this.id_estatus = id_estatus;
}
@Relaciones(clase ="Estatus", tabla = "estatus" ,columna = "id_estatus" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_estatus", tipo_relacion="uno a uno" )
@Columna(nombre= "id_estatus" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_estatus ( ) {
return this.id_estatus;
}

public void setCodigo (String codigo) {
 this.codigo = codigo;
}
@Columna(nombre= "codigo" ,isNoNulo=true, tipo ="String" ,tamano =50, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getCodigo ( ) {
return this.codigo;
}

public void setNombre (String nombre) {
 this.nombre = nombre;
}
@Columna(nombre= "nombre" ,isNoNulo=true, tipo ="String" ,tamano =50, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getNombre ( ) {
return this.nombre;
}

public void setTelefono (String telefono) {
 this.telefono = telefono;
}
@Columna(nombre= "telefono" ,isNoNulo=false, tipo ="String" ,tamano =30, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getTelefono ( ) {
return this.telefono;
}

public void setFax (String fax) {
 this.fax = fax;
}
@Columna(nombre= "fax" ,isNoNulo=false, tipo ="String" ,tamano =30, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getFax ( ) {
return this.fax;
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
@Columna(nombre= "apostal" ,isNoNulo=false, tipo ="String" ,tamano =100, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
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



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
