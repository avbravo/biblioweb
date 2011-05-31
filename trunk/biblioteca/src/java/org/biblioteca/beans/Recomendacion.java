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
@Table(nombre= "recomendacion")
public class Recomendacion  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_recomendacion;
private String nombre;
private String email;
private String observacion;
private Boolean leido;

public Recomendacion(){
}

public Recomendacion(Integer id_recomendacion,String nombre,String email,String observacion,Boolean leido){
this.id_recomendacion = id_recomendacion;
this.nombre = nombre;
this.email = email;
this.observacion = observacion;
this.leido = leido;
}


public void setId_recomendacion (Integer id_recomendacion) {
 this.id_recomendacion = id_recomendacion;
}
@Columna(nombre= "id_recomendacion" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=false,isImagen=false, isUrl=false)
public Integer getId_recomendacion ( ) {
return this.id_recomendacion;
}

public void setNombre (String nombre) {
 this.nombre = nombre;
}
@Columna(nombre= "nombre" ,isNoNulo=false, tipo ="String" ,tamano =50, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getNombre ( ) {
return this.nombre;
}

public void setEmail (String email) {
 this.email = email;
}
@Columna(nombre= "email" ,isNoNulo=false, tipo ="String" ,tamano =255, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getEmail ( ) {
return this.email;
}

public void setObservacion (String observacion) {
 this.observacion = observacion;
}
@Columna(nombre= "observacion" ,isNoNulo=true, tipo ="String" ,tamano =2147483647, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getObservacion ( ) {
return this.observacion;
}

public void setLeido (Boolean leido) {
 this.leido = leido;
}
@Columna(nombre= "leido" ,isNoNulo=false, tipo ="Boolean" ,tamano =1, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Boolean getLeido ( ) {
return this.leido;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
