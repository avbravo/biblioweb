package org.biblioteca.beans;

import java.sql.Date; 
import java.sql.Time;
 import java.math.BigDecimal;
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
@Table(nombre= "solicitud")
public class Solicitud  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_solicitud;
private Integer id_lector;
private Integer id_servicio;
private Integer id_solest;
private Integer id_ejemplar;
private Integer id_usuario_sol;
private Integer id_usuario_dev;
private Date fecha_solicitud;
private Time hora_solicitud;
private Date fecha_asignada;
private Date fecha_devolucion;
private Time hora_devolucion;
private String observacion;
private Boolean moroso;
private BigDecimal monto;
private Boolean impreso;

public Solicitud(){
}

public Solicitud(Integer id_solicitud,Integer id_lector,Integer id_servicio,Integer id_solest,Integer id_ejemplar,Integer id_usuario_sol,Integer id_usuario_dev,Date fecha_solicitud,Time hora_solicitud,Date fecha_asignada,Date fecha_devolucion,Time hora_devolucion,String observacion,Boolean moroso,BigDecimal monto,Boolean impreso){
this.id_solicitud = id_solicitud;
this.id_lector = id_lector;
this.id_servicio = id_servicio;
this.id_solest = id_solest;
this.id_ejemplar = id_ejemplar;
this.id_usuario_sol = id_usuario_sol;
this.id_usuario_dev = id_usuario_dev;
this.fecha_solicitud = fecha_solicitud;
this.hora_solicitud = hora_solicitud;
this.fecha_asignada = fecha_asignada;
this.fecha_devolucion = fecha_devolucion;
this.hora_devolucion = hora_devolucion;
this.observacion = observacion;
this.moroso = moroso;
this.monto = monto;
this.impreso = impreso;
}


public void setId_solicitud (Integer id_solicitud) {
 this.id_solicitud = id_solicitud;
}
@Columna(nombre= "id_solicitud" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_solicitud ( ) {
return this.id_solicitud;
}

public void setId_lector (Integer id_lector) {
 this.id_lector = id_lector;
}
@Relaciones(clase ="Lector", tabla = "lector" ,columna = "id_lector" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_lector", tipo_relacion="uno a uno" )
@Columna(nombre= "id_lector" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_lector ( ) {
return this.id_lector;
}

public void setId_servicio (Integer id_servicio) {
 this.id_servicio = id_servicio;
}
@Relaciones(clase ="Servicio", tabla = "servicio" ,columna = "id_servicio" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_servicio", tipo_relacion="uno a uno" )
@Columna(nombre= "id_servicio" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_servicio ( ) {
return this.id_servicio;
}

public void setId_solest (Integer id_solest) {
 this.id_solest = id_solest;
}
@Relaciones(clase ="Solicitud_estatus", tabla = "solicitud_estatus" ,columna = "id_solest" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_solest", tipo_relacion="uno a uno" )
@Columna(nombre= "id_solest" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_solest ( ) {
return this.id_solest;
}

public void setId_ejemplar (Integer id_ejemplar) {
 this.id_ejemplar = id_ejemplar;
}
@Columna(nombre= "id_ejemplar" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_ejemplar ( ) {
return this.id_ejemplar;
}

public void setId_usuario_sol (Integer id_usuario_sol) {
 this.id_usuario_sol = id_usuario_sol;
}
@Relaciones(clase ="Usuario", tabla = "usuario" ,columna = "id_usuario" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_usuario_sol", tipo_relacion="uno a uno" )
@Columna(nombre= "id_usuario_sol" ,isNoNulo=false, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_usuario_sol ( ) {
return this.id_usuario_sol;
}

public void setId_usuario_dev (Integer id_usuario_dev) {
 this.id_usuario_dev = id_usuario_dev;
}
@Relaciones(clase ="Usuario", tabla = "usuario" ,columna = "id_usuario" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_usuario_dev", tipo_relacion="uno a uno" )
@Columna(nombre= "id_usuario_dev" ,isNoNulo=false, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_usuario_dev ( ) {
return this.id_usuario_dev;
}

public void setFecha_solicitud (Date fecha_solicitud) {
 this.fecha_solicitud = fecha_solicitud;
}
@Columna(nombre= "fecha_solicitud" ,isNoNulo=true, tipo ="Date" ,tamano =13, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Date getFecha_solicitud ( ) {
return this.fecha_solicitud;
}

public void setHora_solicitud (Time hora_solicitud) {
 this.hora_solicitud = hora_solicitud;
}
@Columna(nombre= "hora_solicitud" ,isNoNulo=true, tipo ="Time" ,tamano =15, digitosDecimales=6, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Time getHora_solicitud ( ) {
return this.hora_solicitud;
}

public void setFecha_asignada (Date fecha_asignada) {
 this.fecha_asignada = fecha_asignada;
}
@Columna(nombre= "fecha_asignada" ,isNoNulo=false, tipo ="Date" ,tamano =13, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Date getFecha_asignada ( ) {
return this.fecha_asignada;
}

public void setFecha_devolucion (Date fecha_devolucion) {
 this.fecha_devolucion = fecha_devolucion;
}
@Columna(nombre= "fecha_devolucion" ,isNoNulo=false, tipo ="Date" ,tamano =13, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Date getFecha_devolucion ( ) {
return this.fecha_devolucion;
}

public void setHora_devolucion (Time hora_devolucion) {
 this.hora_devolucion = hora_devolucion;
}
@Columna(nombre= "hora_devolucion" ,isNoNulo=false, tipo ="Time" ,tamano =15, digitosDecimales=6, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Time getHora_devolucion ( ) {
return this.hora_devolucion;
}

public void setObservacion (String observacion) {
 this.observacion = observacion;
}
@Columna(nombre= "observacion" ,isNoNulo=false, tipo ="String" ,tamano =2147483647, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getObservacion ( ) {
return this.observacion;
}

public void setMoroso (Boolean moroso) {
 this.moroso = moroso;
}
@Columna(nombre= "moroso" ,isNoNulo=false, tipo ="Boolean" ,tamano =1, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Boolean getMoroso ( ) {
return this.moroso;
}

public void setMonto (BigDecimal monto) {
 this.monto = monto;
}
@Columna(nombre= "monto" ,isNoNulo=false, tipo ="BigDecimal" ,tamano =131089, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public BigDecimal getMonto ( ) {
return this.monto;
}

public void setImpreso (Boolean impreso) {
 this.impreso = impreso;
}
@Columna(nombre= "impreso" ,isNoNulo=false, tipo ="Boolean" ,tamano =1, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Boolean getImpreso ( ) {
return this.impreso;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
