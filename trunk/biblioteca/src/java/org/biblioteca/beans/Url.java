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
@Table(nombre= "url")
public class Url  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_url;
private String nombre;
private String url;

public Url(){
}

public Url(Integer id_url,String nombre,String url){
this.id_url = id_url;
this.nombre = nombre;
this.url = url;
}


public void setId_url (Integer id_url) {
 this.id_url = id_url;
}
@Columna(nombre= "id_url" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_url ( ) {
return this.id_url;
}

public void setNombre (String nombre) {
 this.nombre = nombre;
}
@Columna(nombre= "nombre" ,isNoNulo=true, tipo ="String" ,tamano =150, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getNombre ( ) {
return this.nombre;
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
