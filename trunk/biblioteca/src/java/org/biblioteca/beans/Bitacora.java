package org.biblioteca.beans;

import java.sql.Date; 
import java.sql.Time;
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
@Table(nombre= "bitacora")
public class Bitacora  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_bitacora;
private Integer id_usuario;
private Integer id_modulo;
private Integer id_opcion;
private String registro;
private Date fecha;
private Time hora;
private String ip;

public Bitacora(){
}

public Bitacora(Integer id_bitacora,Integer id_usuario,Integer id_modulo,Integer id_opcion,String registro,Date fecha,Time hora,String ip){
this.id_bitacora = id_bitacora;
this.id_usuario = id_usuario;
this.id_modulo = id_modulo;
this.id_opcion = id_opcion;
this.registro = registro;
this.fecha = fecha;
this.hora = hora;
this.ip = ip;
}


public void setId_bitacora (Integer id_bitacora) {
 this.id_bitacora = id_bitacora;
}
@Columna(nombre= "id_bitacora" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_bitacora ( ) {
return this.id_bitacora;
}

public void setId_usuario (Integer id_usuario) {
 this.id_usuario = id_usuario;
}
@Relaciones(clase ="Usuario", tabla = "usuario" ,columna = "id_usuario" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_usuario", tipo_relacion="uno a uno" )
@Columna(nombre= "id_usuario" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_usuario ( ) {
return this.id_usuario;
}

public void setId_modulo (Integer id_modulo) {
 this.id_modulo = id_modulo;
}
@Relaciones(clase ="Modulo", tabla = "modulo" ,columna = "id_modulo" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_modulo", tipo_relacion="uno a uno" )
@Columna(nombre= "id_modulo" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_modulo ( ) {
return this.id_modulo;
}

public void setId_opcion (Integer id_opcion) {
 this.id_opcion = id_opcion;
}
@Relaciones(clase ="Opcion", tabla = "opcion" ,columna = "id_opcion" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_opcion", tipo_relacion="uno a uno" )
@Columna(nombre= "id_opcion" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_opcion ( ) {
return this.id_opcion;
}

public void setRegistro (String registro) {
 this.registro = registro;
}
@Columna(nombre= "registro" ,isNoNulo=false, tipo ="String" ,tamano =2147483647, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getRegistro ( ) {
return this.registro;
}

public void setFecha (Date fecha) {
 this.fecha = fecha;
}
@Columna(nombre= "fecha" ,isNoNulo=true, tipo ="Date" ,tamano =13, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Date getFecha ( ) {
return this.fecha;
}

public void setHora (Time hora) {
 this.hora = hora;
}
@Columna(nombre= "hora" ,isNoNulo=true, tipo ="Time" ,tamano =15, digitosDecimales=6, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Time getHora ( ) {
return this.hora;
}

public void setIp (String ip) {
 this.ip = ip;
}
@Columna(nombre= "ip" ,isNoNulo=false, tipo ="String" ,tamano =60, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getIp ( ) {
return this.ip;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
