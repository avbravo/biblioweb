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
@Table(nombre= "region")
public class Region  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_region;
private Integer id_pais;
private String nombre;

public Region(){
}

public Region(Integer id_region,Integer id_pais,String nombre){
this.id_region = id_region;
this.id_pais = id_pais;
this.nombre = nombre;
}


public void setId_region (Integer id_region) {
 this.id_region = id_region;
}
@Columna(nombre= "id_region" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_region ( ) {
return this.id_region;
}

public void setId_pais (Integer id_pais) {
 this.id_pais = id_pais;
}
@Relaciones(clase ="Pais", tabla = "pais" ,columna = "id_pais" , regla_actualizacion="restringuido", regla_eliminacion="restringuido", key_seq=1, nombre_relacion="id_pais", tipo_relacion="uno a uno" )
@Columna(nombre= "id_pais" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_pais ( ) {
return this.id_pais;
}

public void setNombre (String nombre) {
 this.nombre = nombre;
}
@Columna(nombre= "nombre" ,isNoNulo=true, tipo ="String" ,tamano =60, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getNombre ( ) {
return this.nombre;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
