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
@Table(nombre= "institucion")
public class Institucion  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_institucion;
private String nombre;
private String siglas;

public Institucion(){
}

public Institucion(Integer id_institucion,String nombre,String siglas){
this.id_institucion = id_institucion;
this.nombre = nombre;
this.siglas = siglas;
}


public void setId_institucion (Integer id_institucion) {
 this.id_institucion = id_institucion;
}
@Columna(nombre= "id_institucion" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_institucion ( ) {
return this.id_institucion;
}

public void setNombre (String nombre) {
 this.nombre = nombre;
}
@Columna(nombre= "nombre" ,isNoNulo=true, tipo ="String" ,tamano =100, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getNombre ( ) {
return this.nombre;
}

public void setSiglas (String siglas) {
 this.siglas = siglas;
}
@Columna(nombre= "siglas" ,isNoNulo=true, tipo ="String" ,tamano =20, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getSiglas ( ) {
return this.siglas;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
