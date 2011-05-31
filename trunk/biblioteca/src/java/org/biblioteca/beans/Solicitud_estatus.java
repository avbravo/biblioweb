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
@Table(nombre= "solicitud_estatus")
public class Solicitud_estatus  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_solest;
private String nombre;

public Solicitud_estatus(){
}

public Solicitud_estatus(Integer id_solest,String nombre){
this.id_solest = id_solest;
this.nombre = nombre;
}


public void setId_solest (Integer id_solest) {
 this.id_solest = id_solest;
}
@Columna(nombre= "id_solest" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=true,isImagen=false, isUrl=false)
public Integer getId_solest ( ) {
return this.id_solest;
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
