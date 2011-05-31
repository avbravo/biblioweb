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
@Table(nombre= "marc_analitica")
public class Marc_analitica  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_analitica;
private Integer numero;
private Integer id_dato;
private Integer id_nivel;
private String id_etiqueta;
private String eti_padre;
private String descripcion;
private Integer id_repetido;
private Integer id_usuario;

public Marc_analitica(){
}

public Marc_analitica(Integer id_analitica,Integer numero,Integer id_dato,Integer id_nivel,String id_etiqueta,String eti_padre,String descripcion,Integer id_repetido,Integer id_usuario){
this.id_analitica = id_analitica;
this.numero = numero;
this.id_dato = id_dato;
this.id_nivel = id_nivel;
this.id_etiqueta = id_etiqueta;
this.eti_padre = eti_padre;
this.descripcion = descripcion;
this.id_repetido = id_repetido;
this.id_usuario = id_usuario;
}


public void setId_analitica (Integer id_analitica) {
 this.id_analitica = id_analitica;
}
@Columna(nombre= "id_analitica" ,isNoNulo=true, tipo ="Integer" ,tamano =19, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=true,isImagen=false, isUrl=false)
public Integer getId_analitica ( ) {
return this.id_analitica;
}

public void setNumero (Integer numero) {
 this.numero = numero;
}
@Columna(nombre= "numero" ,isNoNulo=true, tipo ="Integer" ,tamano =19, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=true,isImagen=false, isUrl=false)
public Integer getNumero ( ) {
return this.numero;
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

public void setId_usuario (Integer id_usuario) {
 this.id_usuario = id_usuario;
}
@Relaciones(clase ="Usuario", tabla = "usuario" ,columna = "id_usuario" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_usuario_analitica", tipo_relacion="uno a uno" )
@Columna(nombre= "id_usuario" ,isNoNulo=false, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_usuario ( ) {
return this.id_usuario;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
