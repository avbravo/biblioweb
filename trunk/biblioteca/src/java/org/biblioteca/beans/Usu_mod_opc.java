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
@Table(nombre= "usu_mod_opc")
public class Usu_mod_opc  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_usumodopc;
private Integer id_usuario;
private Integer id_modulo;
private Integer id_opcion;

public Usu_mod_opc(){
}

public Usu_mod_opc(Integer id_usumodopc,Integer id_usuario,Integer id_modulo,Integer id_opcion){
this.id_usumodopc = id_usumodopc;
this.id_usuario = id_usuario;
this.id_modulo = id_modulo;
this.id_opcion = id_opcion;
}


public void setId_usumodopc (Integer id_usumodopc) {
 this.id_usumodopc = id_usumodopc;
}
@Columna(nombre= "id_usumodopc" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_usumodopc ( ) {
return this.id_usumodopc;
}

public void setId_usuario (Integer id_usuario) {
 this.id_usuario = id_usuario;
}
@Relaciones(clase ="Usuario", tabla = "usuario" ,columna = "id_usuario" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_usuario", tipo_relacion="uno a uno" )
@Columna(nombre= "id_usuario" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_usuario ( ) {
return this.id_usuario;
}

public void setId_modulo (Integer id_modulo) {
 this.id_modulo = id_modulo;
}
@Relaciones(clase ="Modulo", tabla = "modulo" ,columna = "id_modulo" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_modulo", tipo_relacion="uno a uno" )
@Columna(nombre= "id_modulo" ,isNoNulo=true, tipo ="Integer" ,tamano =5, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_modulo ( ) {
return this.id_modulo;
}

public void setId_opcion (Integer id_opcion) {
 this.id_opcion = id_opcion;
}
@Relaciones(clase ="Opcion", tabla = "opcion" ,columna = "id_opcion" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_opcion", tipo_relacion="uno a uno" )
@Columna(nombre= "id_opcion" ,isNoNulo=true, tipo ="Integer" ,tamano =5, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_opcion ( ) {
return this.id_opcion;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
