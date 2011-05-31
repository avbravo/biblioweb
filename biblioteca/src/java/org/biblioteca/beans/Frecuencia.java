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
@Table(nombre= "frecuencia")
public class Frecuencia  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_frecuencia;
private String nombre;

public Frecuencia(){
}

public Frecuencia(Integer id_frecuencia,String nombre){
this.id_frecuencia = id_frecuencia;
this.nombre = nombre;
}


public void setId_frecuencia (Integer id_frecuencia) {
 this.id_frecuencia = id_frecuencia;
}
@Columna(nombre= "id_frecuencia" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_frecuencia ( ) {
return this.id_frecuencia;
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
