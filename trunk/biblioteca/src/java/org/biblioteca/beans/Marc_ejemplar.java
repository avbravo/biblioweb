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
@Table(nombre= "marc_ejemplar")
public class Marc_ejemplar  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_ejemplar;
private Integer id_sala;
private Integer id_adquisicion;
private Integer id_estatus;
private String codigo_barra;
private String observacion;
private Date fecha;
private Time hora;
private String numero;
private BigDecimal monto;
private Integer id_usuario;
private Integer id_serie;
private Boolean verificado;

public Marc_ejemplar(){
}

public Marc_ejemplar(Integer id_ejemplar,Integer id_sala,Integer id_adquisicion,Integer id_estatus,String codigo_barra,String observacion,Date fecha,Time hora,String numero,BigDecimal monto,Integer id_usuario,Integer id_serie,Boolean verificado){
this.id_ejemplar = id_ejemplar;
this.id_sala = id_sala;
this.id_adquisicion = id_adquisicion;
this.id_estatus = id_estatus;
this.codigo_barra = codigo_barra;
this.observacion = observacion;
this.fecha = fecha;
this.hora = hora;
this.numero = numero;
this.monto = monto;
this.id_usuario = id_usuario;
this.id_serie = id_serie;
this.verificado = verificado;
}


public void setId_ejemplar (Integer id_ejemplar) {
 this.id_ejemplar = id_ejemplar;
}
@Columna(nombre= "id_ejemplar" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_ejemplar ( ) {
return this.id_ejemplar;
}

public void setId_sala (Integer id_sala) {
 this.id_sala = id_sala;
}
@Relaciones(clase ="Sala", tabla = "sala" ,columna = "id_sala" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_sala", tipo_relacion="uno a uno" )
@Columna(nombre= "id_sala" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_sala ( ) {
return this.id_sala;
}

public void setId_adquisicion (Integer id_adquisicion) {
 this.id_adquisicion = id_adquisicion;
}
@Relaciones(clase ="Adquisicion", tabla = "adquisicion" ,columna = "id_adquisicion" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_adquisicion", tipo_relacion="uno a uno" )
@Columna(nombre= "id_adquisicion" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_adquisicion ( ) {
return this.id_adquisicion;
}

public void setId_estatus (Integer id_estatus) {
 this.id_estatus = id_estatus;
}
@Relaciones(clase ="Estatus", tabla = "estatus" ,columna = "id_estatus" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_estatus", tipo_relacion="uno a uno" )
@Columna(nombre= "id_estatus" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_estatus ( ) {
return this.id_estatus;
}

public void setCodigo_barra (String codigo_barra) {
 this.codigo_barra = codigo_barra;
}
@Columna(nombre= "codigo_barra" ,isNoNulo=true, tipo ="String" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getCodigo_barra ( ) {
return this.codigo_barra;
}

public void setObservacion (String observacion) {
 this.observacion = observacion;
}
@Columna(nombre= "observacion" ,isNoNulo=false, tipo ="String" ,tamano =2147483647, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getObservacion ( ) {
return this.observacion;
}

public void setFecha (Date fecha) {
 this.fecha = fecha;
}
@Columna(nombre= "fecha" ,isNoNulo=false, tipo ="Date" ,tamano =13, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Date getFecha ( ) {
return this.fecha;
}

public void setHora (Time hora) {
 this.hora = hora;
}
@Columna(nombre= "hora" ,isNoNulo=false, tipo ="Time" ,tamano =15, digitosDecimales=6, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Time getHora ( ) {
return this.hora;
}

public void setNumero (String numero) {
 this.numero = numero;
}
@Columna(nombre= "numero" ,isNoNulo=true, tipo ="String" ,tamano =3, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getNumero ( ) {
return this.numero;
}

public void setMonto (BigDecimal monto) {
 this.monto = monto;
}
@Columna(nombre= "monto" ,isNoNulo=false, tipo ="BigDecimal" ,tamano =131089, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public BigDecimal getMonto ( ) {
return this.monto;
}

public void setId_usuario (Integer id_usuario) {
 this.id_usuario = id_usuario;
}
@Relaciones(clase ="Usuario", tabla = "usuario" ,columna = "id_usuario" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_usuario", tipo_relacion="uno a uno" )
@Columna(nombre= "id_usuario" ,isNoNulo=false, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_usuario ( ) {
return this.id_usuario;
}

public void setId_serie (Integer id_serie) {
 this.id_serie = id_serie;
}
@Relaciones(clase ="Marc_serie", tabla = "marc_serie" ,columna = "id_serie" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_serie", tipo_relacion="uno a uno" )
@Columna(nombre= "id_serie" ,isNoNulo=false, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_serie ( ) {
return this.id_serie;
}

public void setVerificado (Boolean verificado) {
 this.verificado = verificado;
}
@Columna(nombre= "verificado" ,isNoNulo=false, tipo ="Boolean" ,tamano =1, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Boolean getVerificado ( ) {
return this.verificado;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
