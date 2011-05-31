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
@Table(nombre= "cuenta")
public class Cuenta  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_cuenta;
private Integer id_cuetip;
private Integer id_proveedor;
private Integer id_frecuencia;
private String observacion;
private Date fecha;
private String nombre;

public Cuenta(){
}

public Cuenta(Integer id_cuenta,Integer id_cuetip,Integer id_proveedor,Integer id_frecuencia,String observacion,Date fecha,String nombre){
this.id_cuenta = id_cuenta;
this.id_cuetip = id_cuetip;
this.id_proveedor = id_proveedor;
this.id_frecuencia = id_frecuencia;
this.observacion = observacion;
this.fecha = fecha;
this.nombre = nombre;
}


public void setId_cuenta (Integer id_cuenta) {
 this.id_cuenta = id_cuenta;
}
@Columna(nombre= "id_cuenta" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_cuenta ( ) {
return this.id_cuenta;
}

public void setId_cuetip (Integer id_cuetip) {
 this.id_cuetip = id_cuetip;
}
@Relaciones(clase ="Cuenta_tipo", tabla = "cuenta_tipo" ,columna = "id_cuetip" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_cuetip", tipo_relacion="uno a uno" )
@Columna(nombre= "id_cuetip" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_cuetip ( ) {
return this.id_cuetip;
}

public void setId_proveedor (Integer id_proveedor) {
 this.id_proveedor = id_proveedor;
}
@Relaciones(clase ="Proveedor", tabla = "proveedor" ,columna = "id_proveedor" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_proveedor", tipo_relacion="uno a uno" )
@Columna(nombre= "id_proveedor" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_proveedor ( ) {
return this.id_proveedor;
}

public void setId_frecuencia (Integer id_frecuencia) {
 this.id_frecuencia = id_frecuencia;
}
@Relaciones(clase ="Frecuencia", tabla = "frecuencia" ,columna = "id_frecuencia" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_frecuencia", tipo_relacion="uno a uno" )
@Columna(nombre= "id_frecuencia" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_frecuencia ( ) {
return this.id_frecuencia;
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
@Columna(nombre= "fecha" ,isNoNulo=true, tipo ="Date" ,tamano =13, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Date getFecha ( ) {
return this.fecha;
}

public void setNombre (String nombre) {
 this.nombre = nombre;
}
@Columna(nombre= "nombre" ,isNoNulo=false, tipo ="String" ,tamano =200, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getNombre ( ) {
return this.nombre;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
