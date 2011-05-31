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
@Table(nombre= "control")
public class Control  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_control;
private String nombre;

public Control(){
}

public Control(Integer id_control,String nombre){
this.id_control = id_control;
this.nombre = nombre;
}


public void setId_control (Integer id_control) {
 this.id_control = id_control;
}
@Columna(nombre= "id_control" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=true,isImagen=false, isUrl=false)
public Integer getId_control ( ) {
return this.id_control;
}

public void setNombre (String nombre) {
 this.nombre = nombre;
}
@Columna(nombre= "nombre" ,isNoNulo=true, tipo ="String" ,tamano =30, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getNombre ( ) {
return this.nombre;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
