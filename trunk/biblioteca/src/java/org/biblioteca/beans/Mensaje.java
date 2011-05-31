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
@Table(nombre= "mensaje")
public class Mensaje  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_mensaje;
private String titulo;
private String contenido;
private Date fecha;
private Time hora;

public Mensaje(){
}

public Mensaje(Integer id_mensaje,String titulo,String contenido,Date fecha,Time hora){
this.id_mensaje = id_mensaje;
this.titulo = titulo;
this.contenido = contenido;
this.fecha = fecha;
this.hora = hora;
}


public void setId_mensaje (Integer id_mensaje) {
 this.id_mensaje = id_mensaje;
}
@Columna(nombre= "id_mensaje" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_mensaje ( ) {
return this.id_mensaje;
}

public void setTitulo (String titulo) {
 this.titulo = titulo;
}
@Columna(nombre= "titulo" ,isNoNulo=true, tipo ="String" ,tamano =100, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getTitulo ( ) {
return this.titulo;
}

public void setContenido (String contenido) {
 this.contenido = contenido;
}
@Columna(nombre= "contenido" ,isNoNulo=true, tipo ="String" ,tamano =2147483647, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
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

public void setHora (Time hora) {
 this.hora = hora;
}
@Columna(nombre= "hora" ,isNoNulo=false, tipo ="Time" ,tamano =15, digitosDecimales=6, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Time getHora ( ) {
return this.hora;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
