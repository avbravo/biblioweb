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
@Table(nombre= "anuncio")
public class Anuncio  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_anuncio;
private Integer id_usuario;
private String titulo;
private String contenido;
private Date fecha;
private Date fecha_ini;
private Date fecha_fin;

public Anuncio(){
}

public Anuncio(Integer id_anuncio,Integer id_usuario,String titulo,String contenido,Date fecha,Date fecha_ini,Date fecha_fin){
this.id_anuncio = id_anuncio;
this.id_usuario = id_usuario;
this.titulo = titulo;
this.contenido = contenido;
this.fecha = fecha;
this.fecha_ini = fecha_ini;
this.fecha_fin = fecha_fin;
}


public void setId_anuncio (Integer id_anuncio) {
 this.id_anuncio = id_anuncio;
}
@Columna(nombre= "id_anuncio" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_anuncio ( ) {
return this.id_anuncio;
}

public void setId_usuario (Integer id_usuario) {
 this.id_usuario = id_usuario;
}
@Relaciones(clase ="Usuario", tabla = "usuario" ,columna = "id_usuario" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_usuario", tipo_relacion="uno a uno" )
@Columna(nombre= "id_usuario" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_usuario ( ) {
return this.id_usuario;
}

public void setTitulo (String titulo) {
 this.titulo = titulo;
}
@Columna(nombre= "titulo" ,isNoNulo=false, tipo ="String" ,tamano =50, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getTitulo ( ) {
return this.titulo;
}

public void setContenido (String contenido) {
 this.contenido = contenido;
}
@Columna(nombre= "contenido" ,isNoNulo=false, tipo ="String" ,tamano =2147483647, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getContenido ( ) {
return this.contenido;
}

public void setFecha (Date fecha) {
 this.fecha = fecha;
}
@Columna(nombre= "fecha" ,isNoNulo=false, tipo ="Date" ,tamano =13, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Date getFecha ( ) {
return this.fecha;
}

public void setFecha_ini (Date fecha_ini) {
 this.fecha_ini = fecha_ini;
}
@Columna(nombre= "fecha_ini" ,isNoNulo=false, tipo ="Date" ,tamano =13, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Date getFecha_ini ( ) {
return this.fecha_ini;
}

public void setFecha_fin (Date fecha_fin) {
 this.fecha_fin = fecha_fin;
}
@Columna(nombre= "fecha_fin" ,isNoNulo=false, tipo ="Date" ,tamano =13, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Date getFecha_fin ( ) {
return this.fecha_fin;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
