package org.biblioteca.beans;

import java.sql.Date; 
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
@Table(nombre= "marc_dato")
public class Marc_dato  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_dato;
private Integer id_estatus;
private Integer id_usuario;
private Integer id_documento;
private Date fecha;
private Boolean impreso;

public Marc_dato(){
}

public Marc_dato(Integer id_dato,Integer id_estatus,Integer id_usuario,Integer id_documento,Date fecha,Boolean impreso){
this.id_dato = id_dato;
this.id_estatus = id_estatus;
this.id_usuario = id_usuario;
this.id_documento = id_documento;
this.fecha = fecha;
this.impreso = impreso;
}


public void setId_dato (Integer id_dato) {
 this.id_dato = id_dato;
}
@Columna(nombre= "id_dato" ,isNoNulo=true, tipo ="Integer" ,tamano =19, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=true,isImagen=false, isUrl=false)
public Integer getId_dato ( ) {
return this.id_dato;
}

public void setId_estatus (Integer id_estatus) {
 this.id_estatus = id_estatus;
}
@Columna(nombre= "id_estatus" ,isNoNulo=false, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_estatus ( ) {
return this.id_estatus;
}

public void setId_usuario (Integer id_usuario) {
 this.id_usuario = id_usuario;
}
@Columna(nombre= "id_usuario" ,isNoNulo=false, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_usuario ( ) {
return this.id_usuario;
}

public void setId_documento (Integer id_documento) {
 this.id_documento = id_documento;
}
@Columna(nombre= "id_documento" ,isNoNulo=false, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Integer getId_documento ( ) {
return this.id_documento;
}

public void setFecha (Date fecha) {
 this.fecha = fecha;
}
@Columna(nombre= "fecha" ,isNoNulo=false, tipo ="Date" ,tamano =13, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Date getFecha ( ) {
return this.fecha;
}

public void setImpreso (Boolean impreso) {
 this.impreso = impreso;
}
@Columna(nombre= "impreso" ,isNoNulo=false, tipo ="Boolean" ,tamano =1, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public Boolean getImpreso ( ) {
return this.impreso;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
