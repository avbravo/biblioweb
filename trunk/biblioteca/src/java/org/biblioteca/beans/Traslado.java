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
@Table(nombre= "traslado")
public class Traslado  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_traslado;
private Integer id_usuario_ori;
private Integer id_usuario_des;
private Integer id_sala_ori;
private Integer id_sala_des;
private Integer id_ejemplar;
private Date fecha_ori;
private Date fecha_des;
private Boolean temporal;

public Traslado(){
}

public Traslado(Integer id_traslado,Integer id_usuario_ori,Integer id_usuario_des,Integer id_sala_ori,Integer id_sala_des,Integer id_ejemplar,Date fecha_ori,Date fecha_des,Boolean temporal){
this.id_traslado = id_traslado;
this.id_usuario_ori = id_usuario_ori;
this.id_usuario_des = id_usuario_des;
this.id_sala_ori = id_sala_ori;
this.id_sala_des = id_sala_des;
this.id_ejemplar = id_ejemplar;
this.fecha_ori = fecha_ori;
this.fecha_des = fecha_des;
this.temporal = temporal;
}


public void setId_traslado (Integer id_traslado) {
 this.id_traslado = id_traslado;
}
@Columna(nombre= "id_traslado" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_traslado ( ) {
return this.id_traslado;
}

public void setId_usuario_ori (Integer id_usuario_ori) {
 this.id_usuario_ori = id_usuario_ori;
}
@Relaciones(clase ="Usuario", tabla = "usuario" ,columna = "id_usuario" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_usuario_ori", tipo_relacion="uno a uno" )
@Columna(nombre= "id_usuario_ori" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_usuario_ori ( ) {
return this.id_usuario_ori;
}

public void setId_usuario_des (Integer id_usuario_des) {
 this.id_usuario_des = id_usuario_des;
}
@Relaciones(clase ="Usuario", tabla = "usuario" ,columna = "id_usuario" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_usuario_des", tipo_relacion="uno a uno" )
@Columna(nombre= "id_usuario_des" ,isNoNulo=false, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_usuario_des ( ) {
return this.id_usuario_des;
}

public void setId_sala_ori (Integer id_sala_ori) {
 this.id_sala_ori = id_sala_ori;
}
@Relaciones(clase ="Sala", tabla = "sala" ,columna = "id_sala" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_sala_ori", tipo_relacion="uno a uno" )
@Columna(nombre= "id_sala_ori" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_sala_ori ( ) {
return this.id_sala_ori;
}

public void setId_sala_des (Integer id_sala_des) {
 this.id_sala_des = id_sala_des;
}
@Columna(nombre= "id_sala_des" ,isNoNulo=false, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_sala_des ( ) {
return this.id_sala_des;
}

public void setId_ejemplar (Integer id_ejemplar) {
 this.id_ejemplar = id_ejemplar;
}
@Relaciones(clase ="Marc_ejemplar", tabla = "marc_ejemplar" ,columna = "id_ejemplar" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_ejemplar", tipo_relacion="uno a uno" )
@Columna(nombre= "id_ejemplar" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_ejemplar ( ) {
return this.id_ejemplar;
}

public void setFecha_ori (Date fecha_ori) {
 this.fecha_ori = fecha_ori;
}
@Columna(nombre= "fecha_ori" ,isNoNulo=true, tipo ="Date" ,tamano =13, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Date getFecha_ori ( ) {
return this.fecha_ori;
}

public void setFecha_des (Date fecha_des) {
 this.fecha_des = fecha_des;
}
@Columna(nombre= "fecha_des" ,isNoNulo=false, tipo ="Date" ,tamano =13, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Date getFecha_des ( ) {
return this.fecha_des;
}

public void setTemporal (Boolean temporal) {
 this.temporal = temporal;
}
@Columna(nombre= "temporal" ,isNoNulo=false, tipo ="Boolean" ,tamano =1, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Boolean getTemporal ( ) {
return this.temporal;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
