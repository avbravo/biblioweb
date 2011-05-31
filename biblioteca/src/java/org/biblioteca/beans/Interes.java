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
@Table(nombre= "interes")
public class Interes  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_interes;
private String nombre;
private String descripcion;
private String url;

public Interes(){
}

public Interes(Integer id_interes,String nombre,String descripcion,String url){
this.id_interes = id_interes;
this.nombre = nombre;
this.descripcion = descripcion;
this.url = url;
}


public void setId_interes (Integer id_interes) {
 this.id_interes = id_interes;
}
@Columna(nombre= "id_interes" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_interes ( ) {
return this.id_interes;
}

public void setNombre (String nombre) {
 this.nombre = nombre;
}
@Columna(nombre= "nombre" ,isNoNulo=true, tipo ="String" ,tamano =100, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getNombre ( ) {
return this.nombre;
}

public void setDescripcion (String descripcion) {
 this.descripcion = descripcion;
}
@Columna(nombre= "descripcion" ,isNoNulo=false, tipo ="String" ,tamano =2147483647, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getDescripcion ( ) {
return this.descripcion;
}

public void setUrl (String url) {
 this.url = url;
}
@Columna(nombre= "url" ,isNoNulo=true, tipo ="String" ,tamano =2147483647, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getUrl ( ) {
return this.url;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
