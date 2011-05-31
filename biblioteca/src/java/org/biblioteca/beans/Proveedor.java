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
@Table(nombre= "proveedor")
public class Proveedor  implements Serializable {
private static final long serialVersionUID = 1L;
private Integer id_proveedor;
private String nombre;
private String telefono;
private String email;
private String fax;
private String direccion;

public Proveedor(){
}

public Proveedor(Integer id_proveedor,String nombre,String telefono,String email,String fax,String direccion){
this.id_proveedor = id_proveedor;
this.nombre = nombre;
this.telefono = telefono;
this.email = email;
this.fax = fax;
this.direccion = direccion;
}


public void setId_proveedor (Integer id_proveedor) {
 this.id_proveedor = id_proveedor;
}
@Columna(nombre= "id_proveedor" ,isNoNulo=true, tipo ="Integer" ,tamano =10, digitosDecimales=0, comentario="", is_autoincrementable="SI", isPK=true,isImagen=false, isUrl=false)
public Integer getId_proveedor ( ) {
return this.id_proveedor;
}

public void setNombre (String nombre) {
 this.nombre = nombre;
}
@Columna(nombre= "nombre" ,isNoNulo=true, tipo ="String" ,tamano =50, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getNombre ( ) {
return this.nombre;
}

public void setTelefono (String telefono) {
 this.telefono = telefono;
}
@Columna(nombre= "telefono" ,isNoNulo=false, tipo ="String" ,tamano =50, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getTelefono ( ) {
return this.telefono;
}

public void setEmail (String email) {
 this.email = email;
}
@Columna(nombre= "email" ,isNoNulo=false, tipo ="String" ,tamano =100, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getEmail ( ) {
return this.email;
}

public void setFax (String fax) {
 this.fax = fax;
}
@Columna(nombre= "fax" ,isNoNulo=false, tipo ="String" ,tamano =50, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getFax ( ) {
return this.fax;
}

public void setDireccion (String direccion) {
 this.direccion = direccion;
}
@Columna(nombre= "direccion" ,isNoNulo=false, tipo ="String" ,tamano =2147483647, digitosDecimales=0, comentario="", is_autoincrementable="NO", isPK=false,isImagen=false, isUrl=false)
public String getDireccion ( ) {
return this.direccion;
}



@Override
public int hashCode() {
int hash = 0;

return hash;
}


}
