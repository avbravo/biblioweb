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
@Table(nombre= "adquisicion")
public class Adquisicion  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_adquisicion;
private Integer id_cuenta;
private Integer id_institucion;
private Integer cantidad;
private String detalle;
private Date fecha;

public Adquisicion(){
}

public Adquisicion(Integer id_adquisicion,Integer id_cuenta,Integer id_institucion,Integer cantidad,String detalle,Date fecha){
this.id_adquisicion = id_adquisicion;
this.id_cuenta = id_cuenta;
this.id_institucion = id_institucion;
this.cantidad = cantidad;
this.detalle = detalle;
this.fecha = fecha;
}


public void setId_adquisicion (Integer id_adquisicion) {
 this.id_adquisicion = id_adquisicion;
}
@Columna(nombre= "id_adquisicion" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_adquisicion ( ) {
return this.id_adquisicion;
}

public void setId_cuenta (Integer id_cuenta) {
 this.id_cuenta = id_cuenta;
}
@Relaciones(clase ="Cuenta", tabla = "cuenta" ,columna = "id_cuenta" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_cuenta", tipo_relacion="uno a uno" )
@Columna(nombre= "id_cuenta" ,isNoNulo=true, tipo ="Integer" ,tamano =19, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_cuenta ( ) {
return this.id_cuenta;
}

public void setId_institucion (Integer id_institucion) {
 this.id_institucion = id_institucion;
}
@Relaciones(clase ="Institucion", tabla = "institucion" ,columna = "id_institucion" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_institucion", tipo_relacion="uno a uno" )
@Columna(nombre= "id_institucion" ,isNoNulo=false, tipo ="Integer" ,tamano =19, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_institucion ( ) {
return this.id_institucion;
}

public void setCantidad (Integer cantidad) {
 this.cantidad = cantidad;
}
@Columna(nombre= "cantidad" ,isNoNulo=false, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getCantidad ( ) {
return this.cantidad;
}

public void setDetalle (String detalle) {
 this.detalle = detalle;
}
@Columna(nombre= "detalle" ,isNoNulo=false, tipo ="String" ,tamano =2147483647, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getDetalle ( ) {
return this.detalle;
}

public void setFecha (Date fecha) {
 this.fecha = fecha;
}
@Columna(nombre= "fecha" ,isNoNulo=false, tipo ="Date" ,tamano =13, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Date getFecha ( ) {
return this.fecha;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
