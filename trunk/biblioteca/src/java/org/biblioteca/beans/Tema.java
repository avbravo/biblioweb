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
@Table(nombre= "tema")
public class Tema  implements Serializable {
private static final long serialVersionUID = 1L;
private String id_tema;
private String nombre;

public Tema(){
}

public Tema(String id_tema,String nombre){
this.id_tema = id_tema;
this.nombre = nombre;
}


public void setId_tema (String id_tema) {
 this.id_tema = id_tema;
}
@Columna(nombre= "id_tema" ,isNoNulo=true, tipo ="String" ,tamano =2147483647, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=true,isImagen=false, isUrl=false)
public String getId_tema ( ) {
return this.id_tema;
}

public void setNombre (String nombre) {
 this.nombre = nombre;
}
@Columna(nombre= "nombre" ,isNoNulo=true, tipo ="String" ,tamano =50, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getNombre ( ) {
return this.nombre;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
