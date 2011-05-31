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
@Table(nombre= "perfil")
public class Perfil  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_perfil;
private String nombre;

public Perfil(){
}

public Perfil(Integer id_perfil,String nombre){
this.id_perfil = id_perfil;
this.nombre = nombre;
}


public void setId_perfil (Integer id_perfil) {
 this.id_perfil = id_perfil;
}
@Columna(nombre= "id_perfil" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_perfil ( ) {
return this.id_perfil;
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
