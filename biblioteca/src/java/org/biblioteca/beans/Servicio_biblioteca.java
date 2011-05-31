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
@Table(nombre= "servicio_biblioteca")
public class Servicio_biblioteca  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_serbib;
private Integer id_biblioteca;
private Integer id_perfil;
private Integer id_servicio;
private Integer id_documento;
private Integer id_estatus;
private Integer dias;

public Servicio_biblioteca(){
}

public Servicio_biblioteca(Integer id_serbib,Integer id_biblioteca,Integer id_perfil,Integer id_servicio,Integer id_documento,Integer id_estatus,Integer dias){
this.id_serbib = id_serbib;
this.id_biblioteca = id_biblioteca;
this.id_perfil = id_perfil;
this.id_servicio = id_servicio;
this.id_documento = id_documento;
this.id_estatus = id_estatus;
this.dias = dias;
}


public void setId_serbib (Integer id_serbib) {
 this.id_serbib = id_serbib;
}
@Columna(nombre= "id_serbib" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_serbib ( ) {
return this.id_serbib;
}

public void setId_biblioteca (Integer id_biblioteca) {
 this.id_biblioteca = id_biblioteca;
}
@Relaciones(clase ="Biblioteca", tabla = "biblioteca" ,columna = "id_biblioteca" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_biblioteca", tipo_relacion="uno a uno" )
@Columna(nombre= "id_biblioteca" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_biblioteca ( ) {
return this.id_biblioteca;
}

public void setId_perfil (Integer id_perfil) {
 this.id_perfil = id_perfil;
}
@Relaciones(clase ="Perfil", tabla = "perfil" ,columna = "id_perfil" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_perfil", tipo_relacion="uno a uno" )
@Columna(nombre= "id_perfil" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_perfil ( ) {
return this.id_perfil;
}

public void setId_servicio (Integer id_servicio) {
 this.id_servicio = id_servicio;
}
@Relaciones(clase ="Servicio", tabla = "servicio" ,columna = "id_servicio" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_servicio", tipo_relacion="uno a uno" )
@Columna(nombre= "id_servicio" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_servicio ( ) {
return this.id_servicio;
}

public void setId_documento (Integer id_documento) {
 this.id_documento = id_documento;
}
@Relaciones(clase ="Documento", tabla = "documento" ,columna = "id_documento" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_documento", tipo_relacion="uno a uno" )
@Columna(nombre= "id_documento" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_documento ( ) {
return this.id_documento;
}

public void setId_estatus (Integer id_estatus) {
 this.id_estatus = id_estatus;
}
@Relaciones(clase ="Estatus", tabla = "estatus" ,columna = "id_estatus" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_estatus", tipo_relacion="uno a uno" )
@Columna(nombre= "id_estatus" ,isNoNulo=false, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_estatus ( ) {
return this.id_estatus;
}

public void setDias (Integer dias) {
 this.dias = dias;
}
@Columna(nombre= "dias" ,isNoNulo=false, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getDias ( ) {
return this.dias;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
