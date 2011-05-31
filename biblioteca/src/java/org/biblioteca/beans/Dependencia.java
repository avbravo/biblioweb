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
@Table(nombre= "dependencia")
public class Dependencia  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_dependencia;
private Integer id_institucion;
private String nombre;

public Dependencia(){
}

public Dependencia(Integer id_dependencia,Integer id_institucion,String nombre){
this.id_dependencia = id_dependencia;
this.id_institucion = id_institucion;
this.nombre = nombre;
}


public void setId_dependencia (Integer id_dependencia) {
 this.id_dependencia = id_dependencia;
}
@Columna(nombre= "id_dependencia" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_dependencia ( ) {
return this.id_dependencia;
}

public void setId_institucion (Integer id_institucion) {
 this.id_institucion = id_institucion;
}
@Relaciones(clase ="Institucion", tabla = "institucion" ,columna = "id_institucion" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_institucion", tipo_relacion="uno a uno" )
@Columna(nombre= "id_institucion" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_institucion ( ) {
return this.id_institucion;
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
