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
@Table(nombre= "marc_registro")
public class Marc_registro  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_registro;
private Integer id_dato;
private Integer id_nivel;
private String id_etiqueta;
private String eti_padre;
private String descripcion;
private Integer id_repetido;

public Marc_registro(){
}

public Marc_registro(Integer id_registro,Integer id_dato,Integer id_nivel,String id_etiqueta,String eti_padre,String descripcion,Integer id_repetido){
this.id_registro = id_registro;
this.id_dato = id_dato;
this.id_nivel = id_nivel;
this.id_etiqueta = id_etiqueta;
this.eti_padre = eti_padre;
this.descripcion = descripcion;
this.id_repetido = id_repetido;
}


public void setId_registro (Integer id_registro) {
 this.id_registro = id_registro;
}
@Columna(nombre= "id_registro" ,isNoNulo=true, tipo ="Integer" ,tamano =19, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=true,isImagen=false, isUrl=false)
public Integer getId_registro ( ) {
return this.id_registro;
}

public void setId_dato (Integer id_dato) {
 this.id_dato = id_dato;
}
@Relaciones(clase ="Marc_dato", tabla = "marc_dato" ,columna = "id_dato" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_dato", tipo_relacion="uno a uno" )
@Columna(nombre= "id_dato" ,isNoNulo=true, tipo ="Integer" ,tamano =19, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=true,isImagen=false, isUrl=false)
public Integer getId_dato ( ) {
return this.id_dato;
}

public void setId_nivel (Integer id_nivel) {
 this.id_nivel = id_nivel;
}
@Columna(nombre= "id_nivel" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_nivel ( ) {
return this.id_nivel;
}

public void setId_etiqueta (String id_etiqueta) {
 this.id_etiqueta = id_etiqueta;
}
@Columna(nombre= "id_etiqueta" ,isNoNulo=true, tipo ="String" ,tamano =4, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getId_etiqueta ( ) {
return this.id_etiqueta;
}

public void setEti_padre (String eti_padre) {
 this.eti_padre = eti_padre;
}
@Columna(nombre= "eti_padre" ,isNoNulo=true, tipo ="String" ,tamano =4, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getEti_padre ( ) {
return this.eti_padre;
}

public void setDescripcion (String descripcion) {
 this.descripcion = descripcion;
}
@Columna(nombre= "descripcion" ,isNoNulo=false, tipo ="String" ,tamano =2147483647, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getDescripcion ( ) {
return this.descripcion;
}

public void setId_repetido (Integer id_repetido) {
 this.id_repetido = id_repetido;
}
@Columna(nombre= "id_repetido" ,isNoNulo=false, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_repetido ( ) {
return this.id_repetido;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
