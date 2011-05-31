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
@Table(nombre= "mensaje_usuario")
public class Mensaje_usuario  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_menusu;
private Integer id_usuario_ori;
private Integer id_usuario_des;
private Integer id_mensaje;
private Date fecha;
private Boolean verificado;

public Mensaje_usuario(){
}

public Mensaje_usuario(Integer id_menusu,Integer id_usuario_ori,Integer id_usuario_des,Integer id_mensaje,Date fecha,Boolean verificado){
this.id_menusu = id_menusu;
this.id_usuario_ori = id_usuario_ori;
this.id_usuario_des = id_usuario_des;
this.id_mensaje = id_mensaje;
this.fecha = fecha;
this.verificado = verificado;
}


public void setId_menusu (Integer id_menusu) {
 this.id_menusu = id_menusu;
}
@Columna(nombre= "id_menusu" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_menusu ( ) {
return this.id_menusu;
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
@Columna(nombre= "id_usuario_des" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_usuario_des ( ) {
return this.id_usuario_des;
}

public void setId_mensaje (Integer id_mensaje) {
 this.id_mensaje = id_mensaje;
}
@Relaciones(clase ="Mensaje", tabla = "mensaje" ,columna = "id_mensaje" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_mensaje", tipo_relacion="uno a uno" )
@Columna(nombre= "id_mensaje" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_mensaje ( ) {
return this.id_mensaje;
}

public void setFecha (Date fecha) {
 this.fecha = fecha;
}
@Columna(nombre= "fecha" ,isNoNulo=false, tipo ="Date" ,tamano =13, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Date getFecha ( ) {
return this.fecha;
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
