package org.biblioteca.controller;

import org.biblioteca.beans.Documento;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.javscazpersitence.anotaciones.persistencia.Persistencia;
import org.biblioteca.persistencia.DocumentoPersistencia;
import javax.faces.context.FacesContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.el.ELContext;
import javax.faces.model.SelectItem;
import org.biblioteca.generales.JSFUtil;


/**
*
* @author avbravo
*/

@ManagedBean
@SessionScoped
public class DocumentoController implements Serializable {
private static final long serialVersionUID = 1L;


private Documento documento;

private List<Documento> documentolist;

private Documento selecteddocumento;

SelectItem[] documentoItems;


public DocumentoController(){
     ELContext elContext = FacesContext.getCurrentInstance().getELContext();
   documento =(Documento) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null,"documento");
   documentolist = new ArrayList<Documento>();
}

public Documento getDocumento() {
 return documento;
}

 public void setDocumento(Documento documento) {
 this.documento = documento;
}

public Documento getSelectedDocumento() {
 return selecteddocumento;
}

 public void setSelectedDocumento(Documento selecteddocumento) {
 this.selecteddocumento = selecteddocumento;
}


public SelectItem[]  getDocumentoItems() {
return documentoItems;
}

public void setDocumentoItem(SelectItem[] documentoItems) {
this.documentoItems = documentoItems;
}

public List<Documento> getDocumentolist() {
return documentolist;
}

 public void setDocumentolist(List<Documento> documentolist) {
this.documentolist = documentolist;
}
public void Crear () {
   if (!DocumentoPersistencia.Insertar(documento)) {
      JSFUtil.addErrorMessage(DocumentoPersistencia.excepcion.toString());
   } else {
        JSFUtil.addSuccessMessage("Guardado exitosamente...");
         }
}
public void Editar() {
}
public void Eliminar() {
}
public void Actualizar() {
}
public void findAll() {
}
public void findById_documento(Integer id_documento) {
}
public void findByNombre(String nombre) {
}


public void Listar() {
  documentolist.removeAll(documentolist);
  Map<String, String> parametros = new HashMap<String, String>();
  documentolist = DocumentoPersistencia.getLista(parametros);
  if (documentolist== null) {
     JSFUtil.addErrorMessage(DocumentoPersistencia.excepcion.toString());
  }
 }


}
