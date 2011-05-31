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
@Table(nombre= "cuenta_tipo")
public class Cuenta_tipo  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_cuetip;
private String nombre;

public Cuenta_tipo(){
}

public Cuenta_tipo(Integer id_cuetip,String nombre){
this.id_cuetip = id_cuetip;
this.nombre = nombre;
}


public void setId_cuetip (Integer id_cuetip) {
 this.id_cuetip = id_cuetip;
}
@Columna(nombre= "id_cuetip" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_cuetip ( ) {
return this.id_cuetip;
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
