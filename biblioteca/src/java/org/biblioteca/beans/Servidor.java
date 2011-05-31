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
@Table(nombre= "servidor")
public class Servidor  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_servidor;
private String nombre;
private String host;
private String basedato;
private Integer puerto;
private String usuario;
private String clave;

public Servidor(){
}

public Servidor(Integer id_servidor,String nombre,String host,String basedato,Integer puerto,String usuario,String clave){
this.id_servidor = id_servidor;
this.nombre = nombre;
this.host = host;
this.basedato = basedato;
this.puerto = puerto;
this.usuario = usuario;
this.clave = clave;
}


public void setId_servidor (Integer id_servidor) {
 this.id_servidor = id_servidor;
}
@Columna(nombre= "id_servidor" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_servidor ( ) {
return this.id_servidor;
}

public void setNombre (String nombre) {
 this.nombre = nombre;
}
@Columna(nombre= "nombre" ,isNoNulo=true, tipo ="String" ,tamano =60, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getNombre ( ) {
return this.nombre;
}

public void setHost (String host) {
 this.host = host;
}
@Columna(nombre= "host" ,isNoNulo=true, tipo ="String" ,tamano =60, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getHost ( ) {
return this.host;
}

public void setBasedato (String basedato) {
 this.basedato = basedato;
}
@Columna(nombre= "basedato" ,isNoNulo=true, tipo ="String" ,tamano =60, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getBasedato ( ) {
return this.basedato;
}

public void setPuerto (Integer puerto) {
 this.puerto = puerto;
}
@Columna(nombre= "puerto" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getPuerto ( ) {
return this.puerto;
}

public void setUsuario (String usuario) {
 this.usuario = usuario;
}
@Columna(nombre= "usuario" ,isNoNulo=false, tipo ="String" ,tamano =20, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getUsuario ( ) {
return this.usuario;
}

public void setClave (String clave) {
 this.clave = clave;
}
@Columna(nombre= "clave" ,isNoNulo=false, tipo ="String" ,tamano =20, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getClave ( ) {
return this.clave;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
