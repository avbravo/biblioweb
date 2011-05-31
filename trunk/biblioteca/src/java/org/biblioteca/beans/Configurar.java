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
@Table(nombre= "configurar")
public class Configurar  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_configurar;
private String descripcion;
private String texto;
private Integer valor;

public Configurar(){
}

public Configurar(Integer id_configurar,String descripcion,String texto,Integer valor){
this.id_configurar = id_configurar;
this.descripcion = descripcion;
this.texto = texto;
this.valor = valor;
}


public void setId_configurar (Integer id_configurar) {
 this.id_configurar = id_configurar;
}
@Columna(nombre= "id_configurar" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_configurar ( ) {
return this.id_configurar;
}

public void setDescripcion (String descripcion) {
 this.descripcion = descripcion;
}
@Columna(nombre= "descripcion" ,isNoNulo=true, tipo ="String" ,tamano =2147483647, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getDescripcion ( ) {
return this.descripcion;
}

public void setTexto (String texto) {
 this.texto = texto;
}
@Columna(nombre= "texto" ,isNoNulo=false, tipo ="String" ,tamano =2147483647, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getTexto ( ) {
return this.texto;
}

public void setValor (Integer valor) {
 this.valor = valor;
}
@Columna(nombre= "valor" ,isNoNulo=false, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getValor ( ) {
return this.valor;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
