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
@Table(nombre= "marc_serie")
public class Marc_serie  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_serie;
private Integer id_dato;
private String nombre;

public Marc_serie(){
}

public Marc_serie(Integer id_serie,Integer id_dato,String nombre){
this.id_serie = id_serie;
this.id_dato = id_dato;
this.nombre = nombre;
}


public void setId_serie (Integer id_serie) {
 this.id_serie = id_serie;
}
@Columna(nombre= "id_serie" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_serie ( ) {
return this.id_serie;
}

public void setId_dato (Integer id_dato) {
 this.id_dato = id_dato;
}
@Relaciones(clase ="Marc_dato", tabla = "marc_dato" ,columna = "id_dato" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_dato", tipo_relacion="uno a uno" )
@Columna(nombre= "id_dato" ,isNoNulo=false, tipo ="Integer" ,tamano =19, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_dato ( ) {
return this.id_dato;
}

public void setNombre (String nombre) {
 this.nombre = nombre;
}
@Columna(nombre= "nombre" ,isNoNulo=true, tipo ="String" ,tamano =100, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getNombre ( ) {
return this.nombre;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
