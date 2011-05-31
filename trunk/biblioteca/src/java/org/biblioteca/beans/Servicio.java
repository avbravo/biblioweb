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
@Table(nombre= "servicio")
public class Servicio  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_servicio;
private String nombre;

public Servicio(){
}

public Servicio(Integer id_servicio,String nombre){
this.id_servicio = id_servicio;
this.nombre = nombre;
}


public void setId_servicio (Integer id_servicio) {
 this.id_servicio = id_servicio;
}
@Columna(nombre= "id_servicio" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=true,isImagen=false, isUrl=false)
public Integer getId_servicio ( ) {
return this.id_servicio;
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
