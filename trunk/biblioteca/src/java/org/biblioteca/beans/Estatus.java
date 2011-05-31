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
@Table(nombre= "estatus")
public class Estatus  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_estatus;
private Integer id_modulo;
private String nombre;
private Boolean habilitado;

public Estatus(){
}

public Estatus(Integer id_estatus,Integer id_modulo,String nombre,Boolean habilitado){
this.id_estatus = id_estatus;
this.id_modulo = id_modulo;
this.nombre = nombre;
this.habilitado = habilitado;
}


public void setId_estatus (Integer id_estatus) {
 this.id_estatus = id_estatus;
}
@Columna(nombre= "id_estatus" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_estatus ( ) {
return this.id_estatus;
}

public void setId_modulo (Integer id_modulo) {
 this.id_modulo = id_modulo;
}
@Relaciones(clase ="Modulo", tabla = "modulo" ,columna = "id_modulo" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_modulo", tipo_relacion="uno a uno" )
@Columna(nombre= "id_modulo" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_modulo ( ) {
return this.id_modulo;
}

public void setNombre (String nombre) {
 this.nombre = nombre;
}
@Columna(nombre= "nombre" ,isNoNulo=true, tipo ="String" ,tamano =50, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getNombre ( ) {
return this.nombre;
}

public void setHabilitado (Boolean habilitado) {
 this.habilitado = habilitado;
}
@Columna(nombre= "habilitado" ,isNoNulo=false, tipo ="Boolean" ,tamano =1, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Boolean getHabilitado ( ) {
return this.habilitado;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
