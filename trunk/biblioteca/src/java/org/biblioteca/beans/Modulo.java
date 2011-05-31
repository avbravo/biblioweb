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
@Table(nombre= "modulo")
public class Modulo  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_modulo;
private String nombre;

public Modulo(){
}

public Modulo(Integer id_modulo,String nombre){
this.id_modulo = id_modulo;
this.nombre = nombre;
}


public void setId_modulo (Integer id_modulo) {
 this.id_modulo = id_modulo;
}
@Columna(nombre= "id_modulo" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=true,isImagen=false, isUrl=false)
public Integer getId_modulo ( ) {
return this.id_modulo;
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
