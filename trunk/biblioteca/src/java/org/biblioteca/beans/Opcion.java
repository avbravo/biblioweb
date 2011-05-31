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
@Table(nombre= "opcion")
public class Opcion  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_opcion;
private String nombre;

public Opcion(){
}

public Opcion(Integer id_opcion,String nombre){
this.id_opcion = id_opcion;
this.nombre = nombre;
}


public void setId_opcion (Integer id_opcion) {
 this.id_opcion = id_opcion;
}
@Columna(nombre= "id_opcion" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=true,isImagen=false, isUrl=false)
public Integer getId_opcion ( ) {
return this.id_opcion;
}

public void setNombre (String nombre) {
 this.nombre = nombre;
}
@Columna(nombre= "nombre" ,isNoNulo=true, tipo ="String" ,tamano =30, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getNombre ( ) {
return this.nombre;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
