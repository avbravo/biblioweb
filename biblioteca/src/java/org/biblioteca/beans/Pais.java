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
@Table(nombre= "pais")
public class Pais  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_pais;
private String nombre;
private String codigo_area;
private String siglas;

public Pais(){
}

public Pais(Integer id_pais,String nombre,String codigo_area,String siglas){
this.id_pais = id_pais;
this.nombre = nombre;
this.codigo_area = codigo_area;
this.siglas = siglas;
}


public void setId_pais (Integer id_pais) {
 this.id_pais = id_pais;
}
@Columna(nombre= "id_pais" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
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

public void setCodigo_area (String codigo_area) {
 this.codigo_area = codigo_area;
}
@Columna(nombre= "codigo_area" ,isNoNulo=true, tipo ="String" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getCodigo_area ( ) {
return this.codigo_area;
}

public void setSiglas (String siglas) {
 this.siglas = siglas;
}
@Columna(nombre= "siglas" ,isNoNulo=true, tipo ="String" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getSiglas ( ) {
return this.siglas;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
