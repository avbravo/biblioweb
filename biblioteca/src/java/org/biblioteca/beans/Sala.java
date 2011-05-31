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
@Table(nombre= "sala")
public class Sala  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_sala;
private Integer id_biblioteca;
private String nombre;
private String ubicacion;

public Sala(){
}

public Sala(Integer id_sala,Integer id_biblioteca,String nombre,String ubicacion){
this.id_sala = id_sala;
this.id_biblioteca = id_biblioteca;
this.nombre = nombre;
this.ubicacion = ubicacion;
}


public void setId_sala (Integer id_sala) {
 this.id_sala = id_sala;
}
@Columna(nombre= "id_sala" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_sala ( ) {
return this.id_sala;
}

public void setId_biblioteca (Integer id_biblioteca) {
 this.id_biblioteca = id_biblioteca;
}
@Relaciones(clase ="Biblioteca", tabla = "biblioteca" ,columna = "id_biblioteca" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_biblioteca", tipo_relacion="uno a uno" )
@Columna(nombre= "id_biblioteca" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_biblioteca ( ) {
return this.id_biblioteca;
}

public void setNombre (String nombre) {
 this.nombre = nombre;
}
@Columna(nombre= "nombre" ,isNoNulo=true, tipo ="String" ,tamano =60, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getNombre ( ) {
return this.nombre;
}

public void setUbicacion (String ubicacion) {
 this.ubicacion = ubicacion;
}
@Columna(nombre= "ubicacion" ,isNoNulo=true, tipo ="String" ,tamano =2147483647, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getUbicacion ( ) {
return this.ubicacion;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
