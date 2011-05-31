package org.biblioteca.menu ;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
/**
*
* @author avbravo
*/

@ManagedBean
@SessionScoped
public class MenuBeans implements Serializable {
private static final long serialVersionUID = 1L;
private boolean adquisicionCrear = false;
private boolean adquisicionEditar = false;
private boolean adquisicionListar = false;
private boolean adquisicionConsulta = false;
private boolean adquisicionEliminar = false;
private boolean anuncioCrear = false;
private boolean anuncioEditar = false;
private boolean anuncioListar = false;
private boolean anuncioConsulta = false;
private boolean anuncioEliminar = false;
private boolean bibliotecaCrear = false;
private boolean bibliotecaEditar = false;
private boolean bibliotecaListar = false;
private boolean bibliotecaConsulta = false;
private boolean bibliotecaEliminar = false;
private boolean bitacoraCrear = false;
private boolean bitacoraEditar = false;
private boolean bitacoraListar = false;
private boolean bitacoraConsulta = false;
private boolean bitacoraEliminar = false;
private boolean configurarCrear = false;
private boolean configurarEditar = false;
private boolean configurarListar = false;
private boolean configurarConsulta = false;
private boolean configurarEliminar = false;
private boolean controlCrear = false;
private boolean controlEditar = false;
private boolean controlListar = false;
private boolean controlConsulta = false;
private boolean controlEliminar = false;
private boolean cuentaCrear = false;
private boolean cuentaEditar = false;
private boolean cuentaListar = false;
private boolean cuentaConsulta = false;
private boolean cuentaEliminar = false;
private boolean cuenta_tipoCrear = false;
private boolean cuenta_tipoEditar = false;
private boolean cuenta_tipoListar = false;
private boolean cuenta_tipoConsulta = false;
private boolean cuenta_tipoEliminar = false;
private boolean dependenciaCrear = false;
private boolean dependenciaEditar = false;
private boolean dependenciaListar = false;
private boolean dependenciaConsulta = false;
private boolean dependenciaEliminar = false;
private boolean documentoCrear = false;
private boolean documentoEditar = false;
private boolean documentoListar = false;
private boolean documentoConsulta = false;
private boolean documentoEliminar = false;
private boolean estatusCrear = false;
private boolean estatusEditar = false;
private boolean estatusListar = false;
private boolean estatusConsulta = false;
private boolean estatusEliminar = false;
private boolean frecuenciaCrear = false;
private boolean frecuenciaEditar = false;
private boolean frecuenciaListar = false;
private boolean frecuenciaConsulta = false;
private boolean frecuenciaEliminar = false;
private boolean institucionCrear = false;
private boolean institucionEditar = false;
private boolean institucionListar = false;
private boolean institucionConsulta = false;
private boolean institucionEliminar = false;
private boolean interesCrear = false;
private boolean interesEditar = false;
private boolean interesListar = false;
private boolean interesConsulta = false;
private boolean interesEliminar = false;
private boolean lectorCrear = false;
private boolean lectorEditar = false;
private boolean lectorListar = false;
private boolean lectorConsulta = false;
private boolean lectorEliminar = false;
private boolean marc_analiticaCrear = false;
private boolean marc_analiticaEditar = false;
private boolean marc_analiticaListar = false;
private boolean marc_analiticaConsulta = false;
private boolean marc_analiticaEliminar = false;
private boolean marc_datoCrear = false;
private boolean marc_datoEditar = false;
private boolean marc_datoListar = false;
private boolean marc_datoConsulta = false;
private boolean marc_datoEliminar = false;
private boolean marc_ejemplarCrear = false;
private boolean marc_ejemplarEditar = false;
private boolean marc_ejemplarListar = false;
private boolean marc_ejemplarConsulta = false;
private boolean marc_ejemplarEliminar = false;
private boolean marc_registroCrear = false;
private boolean marc_registroEditar = false;
private boolean marc_registroListar = false;
private boolean marc_registroConsulta = false;
private boolean marc_registroEliminar = false;
private boolean marc_serieCrear = false;
private boolean marc_serieEditar = false;
private boolean marc_serieListar = false;
private boolean marc_serieConsulta = false;
private boolean marc_serieEliminar = false;
private boolean mensajeCrear = false;
private boolean mensajeEditar = false;
private boolean mensajeListar = false;
private boolean mensajeConsulta = false;
private boolean mensajeEliminar = false;
private boolean mensaje_usuarioCrear = false;
private boolean mensaje_usuarioEditar = false;
private boolean mensaje_usuarioListar = false;
private boolean mensaje_usuarioConsulta = false;
private boolean mensaje_usuarioEliminar = false;
private boolean moduloCrear = false;
private boolean moduloEditar = false;
private boolean moduloListar = false;
private boolean moduloConsulta = false;
private boolean moduloEliminar = false;
private boolean opcionCrear = false;
private boolean opcionEditar = false;
private boolean opcionListar = false;
private boolean opcionConsulta = false;
private boolean opcionEliminar = false;
private boolean paisCrear = false;
private boolean paisEditar = false;
private boolean paisListar = false;
private boolean paisConsulta = false;
private boolean paisEliminar = false;
private boolean perfilCrear = false;
private boolean perfilEditar = false;
private boolean perfilListar = false;
private boolean perfilConsulta = false;
private boolean perfilEliminar = false;
private boolean proveedorCrear = false;
private boolean proveedorEditar = false;
private boolean proveedorListar = false;
private boolean proveedorConsulta = false;
private boolean proveedorEliminar = false;
private boolean recomendacionCrear = false;
private boolean recomendacionEditar = false;
private boolean recomendacionListar = false;
private boolean recomendacionConsulta = false;
private boolean recomendacionEliminar = false;
private boolean regionCrear = false;
private boolean regionEditar = false;
private boolean regionListar = false;
private boolean regionConsulta = false;
private boolean regionEliminar = false;
private boolean salaCrear = false;
private boolean salaEditar = false;
private boolean salaListar = false;
private boolean salaConsulta = false;
private boolean salaEliminar = false;
private boolean servicioCrear = false;
private boolean servicioEditar = false;
private boolean servicioListar = false;
private boolean servicioConsulta = false;
private boolean servicioEliminar = false;
private boolean servicio_bibliotecaCrear = false;
private boolean servicio_bibliotecaEditar = false;
private boolean servicio_bibliotecaListar = false;
private boolean servicio_bibliotecaConsulta = false;
private boolean servicio_bibliotecaEliminar = false;
private boolean servidorCrear = false;
private boolean servidorEditar = false;
private boolean servidorListar = false;
private boolean servidorConsulta = false;
private boolean servidorEliminar = false;
private boolean solicitudCrear = false;
private boolean solicitudEditar = false;
private boolean solicitudListar = false;
private boolean solicitudConsulta = false;
private boolean solicitudEliminar = false;
private boolean solicitud_estatusCrear = false;
private boolean solicitud_estatusEditar = false;
private boolean solicitud_estatusListar = false;
private boolean solicitud_estatusConsulta = false;
private boolean solicitud_estatusEliminar = false;
private boolean temaCrear = false;
private boolean temaEditar = false;
private boolean temaListar = false;
private boolean temaConsulta = false;
private boolean temaEliminar = false;
private boolean trasladoCrear = false;
private boolean trasladoEditar = false;
private boolean trasladoListar = false;
private boolean trasladoConsulta = false;
private boolean trasladoEliminar = false;
private boolean urlCrear = false;
private boolean urlEditar = false;
private boolean urlListar = false;
private boolean urlConsulta = false;
private boolean urlEliminar = false;
private boolean usu_mod_opcCrear = false;
private boolean usu_mod_opcEditar = false;
private boolean usu_mod_opcListar = false;
private boolean usu_mod_opcConsulta = false;
private boolean usu_mod_opcEliminar = false;
private boolean usuarioCrear = false;
private boolean usuarioEditar = false;
private boolean usuarioListar = false;
private boolean usuarioConsulta = false;
private boolean usuarioEliminar = false;

public MenuBeans() {
}


public void DesativarTodos(){
adquisicionCrear = false;
adquisicionEditar = false;
adquisicionListar = false;
adquisicionConsulta = false;
adquisicionEliminar = false;
anuncioCrear = false;
anuncioEditar = false;
anuncioListar = false;
anuncioConsulta = false;
anuncioEliminar = false;
bibliotecaCrear = false;
bibliotecaEditar = false;
bibliotecaListar = false;
bibliotecaConsulta = false;
bibliotecaEliminar = false;
bitacoraCrear = false;
bitacoraEditar = false;
bitacoraListar = false;
bitacoraConsulta = false;
bitacoraEliminar = false;
configurarCrear = false;
configurarEditar = false;
configurarListar = false;
configurarConsulta = false;
configurarEliminar = false;
controlCrear = false;
controlEditar = false;
controlListar = false;
controlConsulta = false;
controlEliminar = false;
cuentaCrear = false;
cuentaEditar = false;
cuentaListar = false;
cuentaConsulta = false;
cuentaEliminar = false;
cuenta_tipoCrear = false;
cuenta_tipoEditar = false;
cuenta_tipoListar = false;
cuenta_tipoConsulta = false;
cuenta_tipoEliminar = false;
dependenciaCrear = false;
dependenciaEditar = false;
dependenciaListar = false;
dependenciaConsulta = false;
dependenciaEliminar = false;
documentoCrear = false;
documentoEditar = false;
documentoListar = false;
documentoConsulta = false;
documentoEliminar = false;
estatusCrear = false;
estatusEditar = false;
estatusListar = false;
estatusConsulta = false;
estatusEliminar = false;
frecuenciaCrear = false;
frecuenciaEditar = false;
frecuenciaListar = false;
frecuenciaConsulta = false;
frecuenciaEliminar = false;
institucionCrear = false;
institucionEditar = false;
institucionListar = false;
institucionConsulta = false;
institucionEliminar = false;
interesCrear = false;
interesEditar = false;
interesListar = false;
interesConsulta = false;
interesEliminar = false;
lectorCrear = false;
lectorEditar = false;
lectorListar = false;
lectorConsulta = false;
lectorEliminar = false;
marc_analiticaCrear = false;
marc_analiticaEditar = false;
marc_analiticaListar = false;
marc_analiticaConsulta = false;
marc_analiticaEliminar = false;
marc_datoCrear = false;
marc_datoEditar = false;
marc_datoListar = false;
marc_datoConsulta = false;
marc_datoEliminar = false;
marc_ejemplarCrear = false;
marc_ejemplarEditar = false;
marc_ejemplarListar = false;
marc_ejemplarConsulta = false;
marc_ejemplarEliminar = false;
marc_registroCrear = false;
marc_registroEditar = false;
marc_registroListar = false;
marc_registroConsulta = false;
marc_registroEliminar = false;
marc_serieCrear = false;
marc_serieEditar = false;
marc_serieListar = false;
marc_serieConsulta = false;
marc_serieEliminar = false;
mensajeCrear = false;
mensajeEditar = false;
mensajeListar = false;
mensajeConsulta = false;
mensajeEliminar = false;
mensaje_usuarioCrear = false;
mensaje_usuarioEditar = false;
mensaje_usuarioListar = false;
mensaje_usuarioConsulta = false;
mensaje_usuarioEliminar = false;
moduloCrear = false;
moduloEditar = false;
moduloListar = false;
moduloConsulta = false;
moduloEliminar = false;
opcionCrear = false;
opcionEditar = false;
opcionListar = false;
opcionConsulta = false;
opcionEliminar = false;
paisCrear = false;
paisEditar = false;
paisListar = false;
paisConsulta = false;
paisEliminar = false;
perfilCrear = false;
perfilEditar = false;
perfilListar = false;
perfilConsulta = false;
perfilEliminar = false;
proveedorCrear = false;
proveedorEditar = false;
proveedorListar = false;
proveedorConsulta = false;
proveedorEliminar = false;
recomendacionCrear = false;
recomendacionEditar = false;
recomendacionListar = false;
recomendacionConsulta = false;
recomendacionEliminar = false;
regionCrear = false;
regionEditar = false;
regionListar = false;
regionConsulta = false;
regionEliminar = false;
salaCrear = false;
salaEditar = false;
salaListar = false;
salaConsulta = false;
salaEliminar = false;
servicioCrear = false;
servicioEditar = false;
servicioListar = false;
servicioConsulta = false;
servicioEliminar = false;
servicio_bibliotecaCrear = false;
servicio_bibliotecaEditar = false;
servicio_bibliotecaListar = false;
servicio_bibliotecaConsulta = false;
servicio_bibliotecaEliminar = false;
servidorCrear = false;
servidorEditar = false;
servidorListar = false;
servidorConsulta = false;
servidorEliminar = false;
solicitudCrear = false;
solicitudEditar = false;
solicitudListar = false;
solicitudConsulta = false;
solicitudEliminar = false;
solicitud_estatusCrear = false;
solicitud_estatusEditar = false;
solicitud_estatusListar = false;
solicitud_estatusConsulta = false;
solicitud_estatusEliminar = false;
temaCrear = false;
temaEditar = false;
temaListar = false;
temaConsulta = false;
temaEliminar = false;
trasladoCrear = false;
trasladoEditar = false;
trasladoListar = false;
trasladoConsulta = false;
trasladoEliminar = false;
urlCrear = false;
urlEditar = false;
urlListar = false;
urlConsulta = false;
urlEliminar = false;
usu_mod_opcCrear = false;
usu_mod_opcEditar = false;
usu_mod_opcListar = false;
usu_mod_opcConsulta = false;
usu_mod_opcEliminar = false;
usuarioCrear = false;
usuarioEditar = false;
usuarioListar = false;
usuarioConsulta = false;
usuarioEliminar = false;
}




public void ActivarTodos(){
adquisicionCrear = true;
adquisicionEditar = true;
adquisicionListar = true;
adquisicionConsulta = true;
adquisicionEliminar = true;
anuncioCrear = true;
anuncioEditar = true;
anuncioListar = true;
anuncioConsulta = true;
anuncioEliminar = true;
bibliotecaCrear = true;
bibliotecaEditar = true;
bibliotecaListar = true;
bibliotecaConsulta = true;
bibliotecaEliminar = true;
bitacoraCrear = true;
bitacoraEditar = true;
bitacoraListar = true;
bitacoraConsulta = true;
bitacoraEliminar = true;
configurarCrear = true;
configurarEditar = true;
configurarListar = true;
configurarConsulta = true;
configurarEliminar = true;
controlCrear = true;
controlEditar = true;
controlListar = true;
controlConsulta = true;
controlEliminar = true;
cuentaCrear = true;
cuentaEditar = true;
cuentaListar = true;
cuentaConsulta = true;
cuentaEliminar = true;
cuenta_tipoCrear = true;
cuenta_tipoEditar = true;
cuenta_tipoListar = true;
cuenta_tipoConsulta = true;
cuenta_tipoEliminar = true;
dependenciaCrear = true;
dependenciaEditar = true;
dependenciaListar = true;
dependenciaConsulta = true;
dependenciaEliminar = true;
documentoCrear = true;
documentoEditar = true;
documentoListar = true;
documentoConsulta = true;
documentoEliminar = true;
estatusCrear = true;
estatusEditar = true;
estatusListar = true;
estatusConsulta = true;
estatusEliminar = true;
frecuenciaCrear = true;
frecuenciaEditar = true;
frecuenciaListar = true;
frecuenciaConsulta = true;
frecuenciaEliminar = true;
institucionCrear = true;
institucionEditar = true;
institucionListar = true;
institucionConsulta = true;
institucionEliminar = true;
interesCrear = true;
interesEditar = true;
interesListar = true;
interesConsulta = true;
interesEliminar = true;
lectorCrear = true;
lectorEditar = true;
lectorListar = true;
lectorConsulta = true;
lectorEliminar = true;
marc_analiticaCrear = true;
marc_analiticaEditar = true;
marc_analiticaListar = true;
marc_analiticaConsulta = true;
marc_analiticaEliminar = true;
marc_datoCrear = true;
marc_datoEditar = true;
marc_datoListar = true;
marc_datoConsulta = true;
marc_datoEliminar = true;
marc_ejemplarCrear = true;
marc_ejemplarEditar = true;
marc_ejemplarListar = true;
marc_ejemplarConsulta = true;
marc_ejemplarEliminar = true;
marc_registroCrear = true;
marc_registroEditar = true;
marc_registroListar = true;
marc_registroConsulta = true;
marc_registroEliminar = true;
marc_serieCrear = true;
marc_serieEditar = true;
marc_serieListar = true;
marc_serieConsulta = true;
marc_serieEliminar = true;
mensajeCrear = true;
mensajeEditar = true;
mensajeListar = true;
mensajeConsulta = true;
mensajeEliminar = true;
mensaje_usuarioCrear = true;
mensaje_usuarioEditar = true;
mensaje_usuarioListar = true;
mensaje_usuarioConsulta = true;
mensaje_usuarioEliminar = true;
moduloCrear = true;
moduloEditar = true;
moduloListar = true;
moduloConsulta = true;
moduloEliminar = true;
opcionCrear = true;
opcionEditar = true;
opcionListar = true;
opcionConsulta = true;
opcionEliminar = true;
paisCrear = true;
paisEditar = true;
paisListar = true;
paisConsulta = true;
paisEliminar = true;
perfilCrear = true;
perfilEditar = true;
perfilListar = true;
perfilConsulta = true;
perfilEliminar = true;
proveedorCrear = true;
proveedorEditar = true;
proveedorListar = true;
proveedorConsulta = true;
proveedorEliminar = true;
recomendacionCrear = true;
recomendacionEditar = true;
recomendacionListar = true;
recomendacionConsulta = true;
recomendacionEliminar = true;
regionCrear = true;
regionEditar = true;
regionListar = true;
regionConsulta = true;
regionEliminar = true;
salaCrear = true;
salaEditar = true;
salaListar = true;
salaConsulta = true;
salaEliminar = true;
servicioCrear = true;
servicioEditar = true;
servicioListar = true;
servicioConsulta = true;
servicioEliminar = true;
servicio_bibliotecaCrear = true;
servicio_bibliotecaEditar = true;
servicio_bibliotecaListar = true;
servicio_bibliotecaConsulta = true;
servicio_bibliotecaEliminar = true;
servidorCrear = true;
servidorEditar = true;
servidorListar = true;
servidorConsulta = true;
servidorEliminar = true;
solicitudCrear = true;
solicitudEditar = true;
solicitudListar = true;
solicitudConsulta = true;
solicitudEliminar = true;
solicitud_estatusCrear = true;
solicitud_estatusEditar = true;
solicitud_estatusListar = true;
solicitud_estatusConsulta = true;
solicitud_estatusEliminar = true;
temaCrear = true;
temaEditar = true;
temaListar = true;
temaConsulta = true;
temaEliminar = true;
trasladoCrear = true;
trasladoEditar = true;
trasladoListar = true;
trasladoConsulta = true;
trasladoEliminar = true;
urlCrear = true;
urlEditar = true;
urlListar = true;
urlConsulta = true;
urlEliminar = true;
usu_mod_opcCrear = true;
usu_mod_opcEditar = true;
usu_mod_opcListar = true;
usu_mod_opcConsulta = true;
usu_mod_opcEliminar = true;
usuarioCrear = true;
usuarioEditar = true;
usuarioListar = true;
usuarioConsulta = true;
usuarioEliminar = true;
}







public boolean isAdquisicionCrear(){
    return adquisicionCrear;
}

 public void setAdquisicionCrear( boolean adquisicionCrear){
    this.adquisicionCrear = adquisicionCrear ;
}

public boolean isAdquisicionEditar(){
    return adquisicionEditar;
}

 public void setAdquisicionEditar( boolean adquisicionEditar){
    this.adquisicionEditar = adquisicionEditar ;
}

public boolean isAdquisicionListar(){
    return adquisicionListar;
}

 public void setAdquisicionListar( boolean adquisicionListar){
    this.adquisicionListar = adquisicionListar ;
}

public boolean isAdquisicionConsulta(){
    return adquisicionConsulta;
}

 public void setAdquisicionConsulta( boolean adquisicionConsulta){
    this.adquisicionConsulta = adquisicionConsulta ;
}

public boolean isAdquisicionEliminar(){
    return adquisicionEliminar;
}

 public void setAdquisicionEliminar( boolean adquisicionEliminar){
    this.adquisicionEliminar = adquisicionEliminar ;
}

public boolean isAnuncioCrear(){
    return anuncioCrear;
}

 public void setAnuncioCrear( boolean anuncioCrear){
    this.anuncioCrear = anuncioCrear ;
}

public boolean isAnuncioEditar(){
    return anuncioEditar;
}

 public void setAnuncioEditar( boolean anuncioEditar){
    this.anuncioEditar = anuncioEditar ;
}

public boolean isAnuncioListar(){
    return anuncioListar;
}

 public void setAnuncioListar( boolean anuncioListar){
    this.anuncioListar = anuncioListar ;
}

public boolean isAnuncioConsulta(){
    return anuncioConsulta;
}

 public void setAnuncioConsulta( boolean anuncioConsulta){
    this.anuncioConsulta = anuncioConsulta ;
}

public boolean isAnuncioEliminar(){
    return anuncioEliminar;
}

 public void setAnuncioEliminar( boolean anuncioEliminar){
    this.anuncioEliminar = anuncioEliminar ;
}

public boolean isBibliotecaCrear(){
    return bibliotecaCrear;
}

 public void setBibliotecaCrear( boolean bibliotecaCrear){
    this.bibliotecaCrear = bibliotecaCrear ;
}

public boolean isBibliotecaEditar(){
    return bibliotecaEditar;
}

 public void setBibliotecaEditar( boolean bibliotecaEditar){
    this.bibliotecaEditar = bibliotecaEditar ;
}

public boolean isBibliotecaListar(){
    return bibliotecaListar;
}

 public void setBibliotecaListar( boolean bibliotecaListar){
    this.bibliotecaListar = bibliotecaListar ;
}

public boolean isBibliotecaConsulta(){
    return bibliotecaConsulta;
}

 public void setBibliotecaConsulta( boolean bibliotecaConsulta){
    this.bibliotecaConsulta = bibliotecaConsulta ;
}

public boolean isBibliotecaEliminar(){
    return bibliotecaEliminar;
}

 public void setBibliotecaEliminar( boolean bibliotecaEliminar){
    this.bibliotecaEliminar = bibliotecaEliminar ;
}

public boolean isBitacoraCrear(){
    return bitacoraCrear;
}

 public void setBitacoraCrear( boolean bitacoraCrear){
    this.bitacoraCrear = bitacoraCrear ;
}

public boolean isBitacoraEditar(){
    return bitacoraEditar;
}

 public void setBitacoraEditar( boolean bitacoraEditar){
    this.bitacoraEditar = bitacoraEditar ;
}

public boolean isBitacoraListar(){
    return bitacoraListar;
}

 public void setBitacoraListar( boolean bitacoraListar){
    this.bitacoraListar = bitacoraListar ;
}

public boolean isBitacoraConsulta(){
    return bitacoraConsulta;
}

 public void setBitacoraConsulta( boolean bitacoraConsulta){
    this.bitacoraConsulta = bitacoraConsulta ;
}

public boolean isBitacoraEliminar(){
    return bitacoraEliminar;
}

 public void setBitacoraEliminar( boolean bitacoraEliminar){
    this.bitacoraEliminar = bitacoraEliminar ;
}

public boolean isConfigurarCrear(){
    return configurarCrear;
}

 public void setConfigurarCrear( boolean configurarCrear){
    this.configurarCrear = configurarCrear ;
}

public boolean isConfigurarEditar(){
    return configurarEditar;
}

 public void setConfigurarEditar( boolean configurarEditar){
    this.configurarEditar = configurarEditar ;
}

public boolean isConfigurarListar(){
    return configurarListar;
}

 public void setConfigurarListar( boolean configurarListar){
    this.configurarListar = configurarListar ;
}

public boolean isConfigurarConsulta(){
    return configurarConsulta;
}

 public void setConfigurarConsulta( boolean configurarConsulta){
    this.configurarConsulta = configurarConsulta ;
}

public boolean isConfigurarEliminar(){
    return configurarEliminar;
}

 public void setConfigurarEliminar( boolean configurarEliminar){
    this.configurarEliminar = configurarEliminar ;
}

public boolean isControlCrear(){
    return controlCrear;
}

 public void setControlCrear( boolean controlCrear){
    this.controlCrear = controlCrear ;
}

public boolean isControlEditar(){
    return controlEditar;
}

 public void setControlEditar( boolean controlEditar){
    this.controlEditar = controlEditar ;
}

public boolean isControlListar(){
    return controlListar;
}

 public void setControlListar( boolean controlListar){
    this.controlListar = controlListar ;
}

public boolean isControlConsulta(){
    return controlConsulta;
}

 public void setControlConsulta( boolean controlConsulta){
    this.controlConsulta = controlConsulta ;
}

public boolean isControlEliminar(){
    return controlEliminar;
}

 public void setControlEliminar( boolean controlEliminar){
    this.controlEliminar = controlEliminar ;
}

public boolean isCuentaCrear(){
    return cuentaCrear;
}

 public void setCuentaCrear( boolean cuentaCrear){
    this.cuentaCrear = cuentaCrear ;
}

public boolean isCuentaEditar(){
    return cuentaEditar;
}

 public void setCuentaEditar( boolean cuentaEditar){
    this.cuentaEditar = cuentaEditar ;
}

public boolean isCuentaListar(){
    return cuentaListar;
}

 public void setCuentaListar( boolean cuentaListar){
    this.cuentaListar = cuentaListar ;
}

public boolean isCuentaConsulta(){
    return cuentaConsulta;
}

 public void setCuentaConsulta( boolean cuentaConsulta){
    this.cuentaConsulta = cuentaConsulta ;
}

public boolean isCuentaEliminar(){
    return cuentaEliminar;
}

 public void setCuentaEliminar( boolean cuentaEliminar){
    this.cuentaEliminar = cuentaEliminar ;
}

public boolean isCuenta_tipoCrear(){
    return cuenta_tipoCrear;
}

 public void setCuenta_tipoCrear( boolean cuenta_tipoCrear){
    this.cuenta_tipoCrear = cuenta_tipoCrear ;
}

public boolean isCuenta_tipoEditar(){
    return cuenta_tipoEditar;
}

 public void setCuenta_tipoEditar( boolean cuenta_tipoEditar){
    this.cuenta_tipoEditar = cuenta_tipoEditar ;
}

public boolean isCuenta_tipoListar(){
    return cuenta_tipoListar;
}

 public void setCuenta_tipoListar( boolean cuenta_tipoListar){
    this.cuenta_tipoListar = cuenta_tipoListar ;
}

public boolean isCuenta_tipoConsulta(){
    return cuenta_tipoConsulta;
}

 public void setCuenta_tipoConsulta( boolean cuenta_tipoConsulta){
    this.cuenta_tipoConsulta = cuenta_tipoConsulta ;
}

public boolean isCuenta_tipoEliminar(){
    return cuenta_tipoEliminar;
}

 public void setCuenta_tipoEliminar( boolean cuenta_tipoEliminar){
    this.cuenta_tipoEliminar = cuenta_tipoEliminar ;
}

public boolean isDependenciaCrear(){
    return dependenciaCrear;
}

 public void setDependenciaCrear( boolean dependenciaCrear){
    this.dependenciaCrear = dependenciaCrear ;
}

public boolean isDependenciaEditar(){
    return dependenciaEditar;
}

 public void setDependenciaEditar( boolean dependenciaEditar){
    this.dependenciaEditar = dependenciaEditar ;
}

public boolean isDependenciaListar(){
    return dependenciaListar;
}

 public void setDependenciaListar( boolean dependenciaListar){
    this.dependenciaListar = dependenciaListar ;
}

public boolean isDependenciaConsulta(){
    return dependenciaConsulta;
}

 public void setDependenciaConsulta( boolean dependenciaConsulta){
    this.dependenciaConsulta = dependenciaConsulta ;
}

public boolean isDependenciaEliminar(){
    return dependenciaEliminar;
}

 public void setDependenciaEliminar( boolean dependenciaEliminar){
    this.dependenciaEliminar = dependenciaEliminar ;
}

public boolean isDocumentoCrear(){
    return documentoCrear;
}

 public void setDocumentoCrear( boolean documentoCrear){
    this.documentoCrear = documentoCrear ;
}

public boolean isDocumentoEditar(){
    return documentoEditar;
}

 public void setDocumentoEditar( boolean documentoEditar){
    this.documentoEditar = documentoEditar ;
}

public boolean isDocumentoListar(){
    return documentoListar;
}

 public void setDocumentoListar( boolean documentoListar){
    this.documentoListar = documentoListar ;
}

public boolean isDocumentoConsulta(){
    return documentoConsulta;
}

 public void setDocumentoConsulta( boolean documentoConsulta){
    this.documentoConsulta = documentoConsulta ;
}

public boolean isDocumentoEliminar(){
    return documentoEliminar;
}

 public void setDocumentoEliminar( boolean documentoEliminar){
    this.documentoEliminar = documentoEliminar ;
}

public boolean isEstatusCrear(){
    return estatusCrear;
}

 public void setEstatusCrear( boolean estatusCrear){
    this.estatusCrear = estatusCrear ;
}

public boolean isEstatusEditar(){
    return estatusEditar;
}

 public void setEstatusEditar( boolean estatusEditar){
    this.estatusEditar = estatusEditar ;
}

public boolean isEstatusListar(){
    return estatusListar;
}

 public void setEstatusListar( boolean estatusListar){
    this.estatusListar = estatusListar ;
}

public boolean isEstatusConsulta(){
    return estatusConsulta;
}

 public void setEstatusConsulta( boolean estatusConsulta){
    this.estatusConsulta = estatusConsulta ;
}

public boolean isEstatusEliminar(){
    return estatusEliminar;
}

 public void setEstatusEliminar( boolean estatusEliminar){
    this.estatusEliminar = estatusEliminar ;
}

public boolean isFrecuenciaCrear(){
    return frecuenciaCrear;
}

 public void setFrecuenciaCrear( boolean frecuenciaCrear){
    this.frecuenciaCrear = frecuenciaCrear ;
}

public boolean isFrecuenciaEditar(){
    return frecuenciaEditar;
}

 public void setFrecuenciaEditar( boolean frecuenciaEditar){
    this.frecuenciaEditar = frecuenciaEditar ;
}

public boolean isFrecuenciaListar(){
    return frecuenciaListar;
}

 public void setFrecuenciaListar( boolean frecuenciaListar){
    this.frecuenciaListar = frecuenciaListar ;
}

public boolean isFrecuenciaConsulta(){
    return frecuenciaConsulta;
}

 public void setFrecuenciaConsulta( boolean frecuenciaConsulta){
    this.frecuenciaConsulta = frecuenciaConsulta ;
}

public boolean isFrecuenciaEliminar(){
    return frecuenciaEliminar;
}

 public void setFrecuenciaEliminar( boolean frecuenciaEliminar){
    this.frecuenciaEliminar = frecuenciaEliminar ;
}

public boolean isInstitucionCrear(){
    return institucionCrear;
}

 public void setInstitucionCrear( boolean institucionCrear){
    this.institucionCrear = institucionCrear ;
}

public boolean isInstitucionEditar(){
    return institucionEditar;
}

 public void setInstitucionEditar( boolean institucionEditar){
    this.institucionEditar = institucionEditar ;
}

public boolean isInstitucionListar(){
    return institucionListar;
}

 public void setInstitucionListar( boolean institucionListar){
    this.institucionListar = institucionListar ;
}

public boolean isInstitucionConsulta(){
    return institucionConsulta;
}

 public void setInstitucionConsulta( boolean institucionConsulta){
    this.institucionConsulta = institucionConsulta ;
}

public boolean isInstitucionEliminar(){
    return institucionEliminar;
}

 public void setInstitucionEliminar( boolean institucionEliminar){
    this.institucionEliminar = institucionEliminar ;
}

public boolean isInteresCrear(){
    return interesCrear;
}

 public void setInteresCrear( boolean interesCrear){
    this.interesCrear = interesCrear ;
}

public boolean isInteresEditar(){
    return interesEditar;
}

 public void setInteresEditar( boolean interesEditar){
    this.interesEditar = interesEditar ;
}

public boolean isInteresListar(){
    return interesListar;
}

 public void setInteresListar( boolean interesListar){
    this.interesListar = interesListar ;
}

public boolean isInteresConsulta(){
    return interesConsulta;
}

 public void setInteresConsulta( boolean interesConsulta){
    this.interesConsulta = interesConsulta ;
}

public boolean isInteresEliminar(){
    return interesEliminar;
}

 public void setInteresEliminar( boolean interesEliminar){
    this.interesEliminar = interesEliminar ;
}

public boolean isLectorCrear(){
    return lectorCrear;
}

 public void setLectorCrear( boolean lectorCrear){
    this.lectorCrear = lectorCrear ;
}

public boolean isLectorEditar(){
    return lectorEditar;
}

 public void setLectorEditar( boolean lectorEditar){
    this.lectorEditar = lectorEditar ;
}

public boolean isLectorListar(){
    return lectorListar;
}

 public void setLectorListar( boolean lectorListar){
    this.lectorListar = lectorListar ;
}

public boolean isLectorConsulta(){
    return lectorConsulta;
}

 public void setLectorConsulta( boolean lectorConsulta){
    this.lectorConsulta = lectorConsulta ;
}

public boolean isLectorEliminar(){
    return lectorEliminar;
}

 public void setLectorEliminar( boolean lectorEliminar){
    this.lectorEliminar = lectorEliminar ;
}

public boolean isMarc_analiticaCrear(){
    return marc_analiticaCrear;
}

 public void setMarc_analiticaCrear( boolean marc_analiticaCrear){
    this.marc_analiticaCrear = marc_analiticaCrear ;
}

public boolean isMarc_analiticaEditar(){
    return marc_analiticaEditar;
}

 public void setMarc_analiticaEditar( boolean marc_analiticaEditar){
    this.marc_analiticaEditar = marc_analiticaEditar ;
}

public boolean isMarc_analiticaListar(){
    return marc_analiticaListar;
}

 public void setMarc_analiticaListar( boolean marc_analiticaListar){
    this.marc_analiticaListar = marc_analiticaListar ;
}

public boolean isMarc_analiticaConsulta(){
    return marc_analiticaConsulta;
}

 public void setMarc_analiticaConsulta( boolean marc_analiticaConsulta){
    this.marc_analiticaConsulta = marc_analiticaConsulta ;
}

public boolean isMarc_analiticaEliminar(){
    return marc_analiticaEliminar;
}

 public void setMarc_analiticaEliminar( boolean marc_analiticaEliminar){
    this.marc_analiticaEliminar = marc_analiticaEliminar ;
}

public boolean isMarc_datoCrear(){
    return marc_datoCrear;
}

 public void setMarc_datoCrear( boolean marc_datoCrear){
    this.marc_datoCrear = marc_datoCrear ;
}

public boolean isMarc_datoEditar(){
    return marc_datoEditar;
}

 public void setMarc_datoEditar( boolean marc_datoEditar){
    this.marc_datoEditar = marc_datoEditar ;
}

public boolean isMarc_datoListar(){
    return marc_datoListar;
}

 public void setMarc_datoListar( boolean marc_datoListar){
    this.marc_datoListar = marc_datoListar ;
}

public boolean isMarc_datoConsulta(){
    return marc_datoConsulta;
}

 public void setMarc_datoConsulta( boolean marc_datoConsulta){
    this.marc_datoConsulta = marc_datoConsulta ;
}

public boolean isMarc_datoEliminar(){
    return marc_datoEliminar;
}

 public void setMarc_datoEliminar( boolean marc_datoEliminar){
    this.marc_datoEliminar = marc_datoEliminar ;
}

public boolean isMarc_ejemplarCrear(){
    return marc_ejemplarCrear;
}

 public void setMarc_ejemplarCrear( boolean marc_ejemplarCrear){
    this.marc_ejemplarCrear = marc_ejemplarCrear ;
}

public boolean isMarc_ejemplarEditar(){
    return marc_ejemplarEditar;
}

 public void setMarc_ejemplarEditar( boolean marc_ejemplarEditar){
    this.marc_ejemplarEditar = marc_ejemplarEditar ;
}

public boolean isMarc_ejemplarListar(){
    return marc_ejemplarListar;
}

 public void setMarc_ejemplarListar( boolean marc_ejemplarListar){
    this.marc_ejemplarListar = marc_ejemplarListar ;
}

public boolean isMarc_ejemplarConsulta(){
    return marc_ejemplarConsulta;
}

 public void setMarc_ejemplarConsulta( boolean marc_ejemplarConsulta){
    this.marc_ejemplarConsulta = marc_ejemplarConsulta ;
}

public boolean isMarc_ejemplarEliminar(){
    return marc_ejemplarEliminar;
}

 public void setMarc_ejemplarEliminar( boolean marc_ejemplarEliminar){
    this.marc_ejemplarEliminar = marc_ejemplarEliminar ;
}

public boolean isMarc_registroCrear(){
    return marc_registroCrear;
}

 public void setMarc_registroCrear( boolean marc_registroCrear){
    this.marc_registroCrear = marc_registroCrear ;
}

public boolean isMarc_registroEditar(){
    return marc_registroEditar;
}

 public void setMarc_registroEditar( boolean marc_registroEditar){
    this.marc_registroEditar = marc_registroEditar ;
}

public boolean isMarc_registroListar(){
    return marc_registroListar;
}

 public void setMarc_registroListar( boolean marc_registroListar){
    this.marc_registroListar = marc_registroListar ;
}

public boolean isMarc_registroConsulta(){
    return marc_registroConsulta;
}

 public void setMarc_registroConsulta( boolean marc_registroConsulta){
    this.marc_registroConsulta = marc_registroConsulta ;
}

public boolean isMarc_registroEliminar(){
    return marc_registroEliminar;
}

 public void setMarc_registroEliminar( boolean marc_registroEliminar){
    this.marc_registroEliminar = marc_registroEliminar ;
}

public boolean isMarc_serieCrear(){
    return marc_serieCrear;
}

 public void setMarc_serieCrear( boolean marc_serieCrear){
    this.marc_serieCrear = marc_serieCrear ;
}

public boolean isMarc_serieEditar(){
    return marc_serieEditar;
}

 public void setMarc_serieEditar( boolean marc_serieEditar){
    this.marc_serieEditar = marc_serieEditar ;
}

public boolean isMarc_serieListar(){
    return marc_serieListar;
}

 public void setMarc_serieListar( boolean marc_serieListar){
    this.marc_serieListar = marc_serieListar ;
}

public boolean isMarc_serieConsulta(){
    return marc_serieConsulta;
}

 public void setMarc_serieConsulta( boolean marc_serieConsulta){
    this.marc_serieConsulta = marc_serieConsulta ;
}

public boolean isMarc_serieEliminar(){
    return marc_serieEliminar;
}

 public void setMarc_serieEliminar( boolean marc_serieEliminar){
    this.marc_serieEliminar = marc_serieEliminar ;
}

public boolean isMensajeCrear(){
    return mensajeCrear;
}

 public void setMensajeCrear( boolean mensajeCrear){
    this.mensajeCrear = mensajeCrear ;
}

public boolean isMensajeEditar(){
    return mensajeEditar;
}

 public void setMensajeEditar( boolean mensajeEditar){
    this.mensajeEditar = mensajeEditar ;
}

public boolean isMensajeListar(){
    return mensajeListar;
}

 public void setMensajeListar( boolean mensajeListar){
    this.mensajeListar = mensajeListar ;
}

public boolean isMensajeConsulta(){
    return mensajeConsulta;
}

 public void setMensajeConsulta( boolean mensajeConsulta){
    this.mensajeConsulta = mensajeConsulta ;
}

public boolean isMensajeEliminar(){
    return mensajeEliminar;
}

 public void setMensajeEliminar( boolean mensajeEliminar){
    this.mensajeEliminar = mensajeEliminar ;
}

public boolean isMensaje_usuarioCrear(){
    return mensaje_usuarioCrear;
}

 public void setMensaje_usuarioCrear( boolean mensaje_usuarioCrear){
    this.mensaje_usuarioCrear = mensaje_usuarioCrear ;
}

public boolean isMensaje_usuarioEditar(){
    return mensaje_usuarioEditar;
}

 public void setMensaje_usuarioEditar( boolean mensaje_usuarioEditar){
    this.mensaje_usuarioEditar = mensaje_usuarioEditar ;
}

public boolean isMensaje_usuarioListar(){
    return mensaje_usuarioListar;
}

 public void setMensaje_usuarioListar( boolean mensaje_usuarioListar){
    this.mensaje_usuarioListar = mensaje_usuarioListar ;
}

public boolean isMensaje_usuarioConsulta(){
    return mensaje_usuarioConsulta;
}

 public void setMensaje_usuarioConsulta( boolean mensaje_usuarioConsulta){
    this.mensaje_usuarioConsulta = mensaje_usuarioConsulta ;
}

public boolean isMensaje_usuarioEliminar(){
    return mensaje_usuarioEliminar;
}

 public void setMensaje_usuarioEliminar( boolean mensaje_usuarioEliminar){
    this.mensaje_usuarioEliminar = mensaje_usuarioEliminar ;
}

public boolean isModuloCrear(){
    return moduloCrear;
}

 public void setModuloCrear( boolean moduloCrear){
    this.moduloCrear = moduloCrear ;
}

public boolean isModuloEditar(){
    return moduloEditar;
}

 public void setModuloEditar( boolean moduloEditar){
    this.moduloEditar = moduloEditar ;
}

public boolean isModuloListar(){
    return moduloListar;
}

 public void setModuloListar( boolean moduloListar){
    this.moduloListar = moduloListar ;
}

public boolean isModuloConsulta(){
    return moduloConsulta;
}

 public void setModuloConsulta( boolean moduloConsulta){
    this.moduloConsulta = moduloConsulta ;
}

public boolean isModuloEliminar(){
    return moduloEliminar;
}

 public void setModuloEliminar( boolean moduloEliminar){
    this.moduloEliminar = moduloEliminar ;
}

public boolean isOpcionCrear(){
    return opcionCrear;
}

 public void setOpcionCrear( boolean opcionCrear){
    this.opcionCrear = opcionCrear ;
}

public boolean isOpcionEditar(){
    return opcionEditar;
}

 public void setOpcionEditar( boolean opcionEditar){
    this.opcionEditar = opcionEditar ;
}

public boolean isOpcionListar(){
    return opcionListar;
}

 public void setOpcionListar( boolean opcionListar){
    this.opcionListar = opcionListar ;
}

public boolean isOpcionConsulta(){
    return opcionConsulta;
}

 public void setOpcionConsulta( boolean opcionConsulta){
    this.opcionConsulta = opcionConsulta ;
}

public boolean isOpcionEliminar(){
    return opcionEliminar;
}

 public void setOpcionEliminar( boolean opcionEliminar){
    this.opcionEliminar = opcionEliminar ;
}

public boolean isPaisCrear(){
    return paisCrear;
}

 public void setPaisCrear( boolean paisCrear){
    this.paisCrear = paisCrear ;
}

public boolean isPaisEditar(){
    return paisEditar;
}

 public void setPaisEditar( boolean paisEditar){
    this.paisEditar = paisEditar ;
}

public boolean isPaisListar(){
    return paisListar;
}

 public void setPaisListar( boolean paisListar){
    this.paisListar = paisListar ;
}

public boolean isPaisConsulta(){
    return paisConsulta;
}

 public void setPaisConsulta( boolean paisConsulta){
    this.paisConsulta = paisConsulta ;
}

public boolean isPaisEliminar(){
    return paisEliminar;
}

 public void setPaisEliminar( boolean paisEliminar){
    this.paisEliminar = paisEliminar ;
}

public boolean isPerfilCrear(){
    return perfilCrear;
}

 public void setPerfilCrear( boolean perfilCrear){
    this.perfilCrear = perfilCrear ;
}

public boolean isPerfilEditar(){
    return perfilEditar;
}

 public void setPerfilEditar( boolean perfilEditar){
    this.perfilEditar = perfilEditar ;
}

public boolean isPerfilListar(){
    return perfilListar;
}

 public void setPerfilListar( boolean perfilListar){
    this.perfilListar = perfilListar ;
}

public boolean isPerfilConsulta(){
    return perfilConsulta;
}

 public void setPerfilConsulta( boolean perfilConsulta){
    this.perfilConsulta = perfilConsulta ;
}

public boolean isPerfilEliminar(){
    return perfilEliminar;
}

 public void setPerfilEliminar( boolean perfilEliminar){
    this.perfilEliminar = perfilEliminar ;
}

public boolean isProveedorCrear(){
    return proveedorCrear;
}

 public void setProveedorCrear( boolean proveedorCrear){
    this.proveedorCrear = proveedorCrear ;
}

public boolean isProveedorEditar(){
    return proveedorEditar;
}

 public void setProveedorEditar( boolean proveedorEditar){
    this.proveedorEditar = proveedorEditar ;
}

public boolean isProveedorListar(){
    return proveedorListar;
}

 public void setProveedorListar( boolean proveedorListar){
    this.proveedorListar = proveedorListar ;
}

public boolean isProveedorConsulta(){
    return proveedorConsulta;
}

 public void setProveedorConsulta( boolean proveedorConsulta){
    this.proveedorConsulta = proveedorConsulta ;
}

public boolean isProveedorEliminar(){
    return proveedorEliminar;
}

 public void setProveedorEliminar( boolean proveedorEliminar){
    this.proveedorEliminar = proveedorEliminar ;
}

public boolean isRecomendacionCrear(){
    return recomendacionCrear;
}

 public void setRecomendacionCrear( boolean recomendacionCrear){
    this.recomendacionCrear = recomendacionCrear ;
}

public boolean isRecomendacionEditar(){
    return recomendacionEditar;
}

 public void setRecomendacionEditar( boolean recomendacionEditar){
    this.recomendacionEditar = recomendacionEditar ;
}

public boolean isRecomendacionListar(){
    return recomendacionListar;
}

 public void setRecomendacionListar( boolean recomendacionListar){
    this.recomendacionListar = recomendacionListar ;
}

public boolean isRecomendacionConsulta(){
    return recomendacionConsulta;
}

 public void setRecomendacionConsulta( boolean recomendacionConsulta){
    this.recomendacionConsulta = recomendacionConsulta ;
}

public boolean isRecomendacionEliminar(){
    return recomendacionEliminar;
}

 public void setRecomendacionEliminar( boolean recomendacionEliminar){
    this.recomendacionEliminar = recomendacionEliminar ;
}

public boolean isRegionCrear(){
    return regionCrear;
}

 public void setRegionCrear( boolean regionCrear){
    this.regionCrear = regionCrear ;
}

public boolean isRegionEditar(){
    return regionEditar;
}

 public void setRegionEditar( boolean regionEditar){
    this.regionEditar = regionEditar ;
}

public boolean isRegionListar(){
    return regionListar;
}

 public void setRegionListar( boolean regionListar){
    this.regionListar = regionListar ;
}

public boolean isRegionConsulta(){
    return regionConsulta;
}

 public void setRegionConsulta( boolean regionConsulta){
    this.regionConsulta = regionConsulta ;
}

public boolean isRegionEliminar(){
    return regionEliminar;
}

 public void setRegionEliminar( boolean regionEliminar){
    this.regionEliminar = regionEliminar ;
}

public boolean isSalaCrear(){
    return salaCrear;
}

 public void setSalaCrear( boolean salaCrear){
    this.salaCrear = salaCrear ;
}

public boolean isSalaEditar(){
    return salaEditar;
}

 public void setSalaEditar( boolean salaEditar){
    this.salaEditar = salaEditar ;
}

public boolean isSalaListar(){
    return salaListar;
}

 public void setSalaListar( boolean salaListar){
    this.salaListar = salaListar ;
}

public boolean isSalaConsulta(){
    return salaConsulta;
}

 public void setSalaConsulta( boolean salaConsulta){
    this.salaConsulta = salaConsulta ;
}

public boolean isSalaEliminar(){
    return salaEliminar;
}

 public void setSalaEliminar( boolean salaEliminar){
    this.salaEliminar = salaEliminar ;
}

public boolean isServicioCrear(){
    return servicioCrear;
}

 public void setServicioCrear( boolean servicioCrear){
    this.servicioCrear = servicioCrear ;
}

public boolean isServicioEditar(){
    return servicioEditar;
}

 public void setServicioEditar( boolean servicioEditar){
    this.servicioEditar = servicioEditar ;
}

public boolean isServicioListar(){
    return servicioListar;
}

 public void setServicioListar( boolean servicioListar){
    this.servicioListar = servicioListar ;
}

public boolean isServicioConsulta(){
    return servicioConsulta;
}

 public void setServicioConsulta( boolean servicioConsulta){
    this.servicioConsulta = servicioConsulta ;
}

public boolean isServicioEliminar(){
    return servicioEliminar;
}

 public void setServicioEliminar( boolean servicioEliminar){
    this.servicioEliminar = servicioEliminar ;
}

public boolean isServicio_bibliotecaCrear(){
    return servicio_bibliotecaCrear;
}

 public void setServicio_bibliotecaCrear( boolean servicio_bibliotecaCrear){
    this.servicio_bibliotecaCrear = servicio_bibliotecaCrear ;
}

public boolean isServicio_bibliotecaEditar(){
    return servicio_bibliotecaEditar;
}

 public void setServicio_bibliotecaEditar( boolean servicio_bibliotecaEditar){
    this.servicio_bibliotecaEditar = servicio_bibliotecaEditar ;
}

public boolean isServicio_bibliotecaListar(){
    return servicio_bibliotecaListar;
}

 public void setServicio_bibliotecaListar( boolean servicio_bibliotecaListar){
    this.servicio_bibliotecaListar = servicio_bibliotecaListar ;
}

public boolean isServicio_bibliotecaConsulta(){
    return servicio_bibliotecaConsulta;
}

 public void setServicio_bibliotecaConsulta( boolean servicio_bibliotecaConsulta){
    this.servicio_bibliotecaConsulta = servicio_bibliotecaConsulta ;
}

public boolean isServicio_bibliotecaEliminar(){
    return servicio_bibliotecaEliminar;
}

 public void setServicio_bibliotecaEliminar( boolean servicio_bibliotecaEliminar){
    this.servicio_bibliotecaEliminar = servicio_bibliotecaEliminar ;
}

public boolean isServidorCrear(){
    return servidorCrear;
}

 public void setServidorCrear( boolean servidorCrear){
    this.servidorCrear = servidorCrear ;
}

public boolean isServidorEditar(){
    return servidorEditar;
}

 public void setServidorEditar( boolean servidorEditar){
    this.servidorEditar = servidorEditar ;
}

public boolean isServidorListar(){
    return servidorListar;
}

 public void setServidorListar( boolean servidorListar){
    this.servidorListar = servidorListar ;
}

public boolean isServidorConsulta(){
    return servidorConsulta;
}

 public void setServidorConsulta( boolean servidorConsulta){
    this.servidorConsulta = servidorConsulta ;
}

public boolean isServidorEliminar(){
    return servidorEliminar;
}

 public void setServidorEliminar( boolean servidorEliminar){
    this.servidorEliminar = servidorEliminar ;
}

public boolean isSolicitudCrear(){
    return solicitudCrear;
}

 public void setSolicitudCrear( boolean solicitudCrear){
    this.solicitudCrear = solicitudCrear ;
}

public boolean isSolicitudEditar(){
    return solicitudEditar;
}

 public void setSolicitudEditar( boolean solicitudEditar){
    this.solicitudEditar = solicitudEditar ;
}

public boolean isSolicitudListar(){
    return solicitudListar;
}

 public void setSolicitudListar( boolean solicitudListar){
    this.solicitudListar = solicitudListar ;
}

public boolean isSolicitudConsulta(){
    return solicitudConsulta;
}

 public void setSolicitudConsulta( boolean solicitudConsulta){
    this.solicitudConsulta = solicitudConsulta ;
}

public boolean isSolicitudEliminar(){
    return solicitudEliminar;
}

 public void setSolicitudEliminar( boolean solicitudEliminar){
    this.solicitudEliminar = solicitudEliminar ;
}

public boolean isSolicitud_estatusCrear(){
    return solicitud_estatusCrear;
}

 public void setSolicitud_estatusCrear( boolean solicitud_estatusCrear){
    this.solicitud_estatusCrear = solicitud_estatusCrear ;
}

public boolean isSolicitud_estatusEditar(){
    return solicitud_estatusEditar;
}

 public void setSolicitud_estatusEditar( boolean solicitud_estatusEditar){
    this.solicitud_estatusEditar = solicitud_estatusEditar ;
}

public boolean isSolicitud_estatusListar(){
    return solicitud_estatusListar;
}

 public void setSolicitud_estatusListar( boolean solicitud_estatusListar){
    this.solicitud_estatusListar = solicitud_estatusListar ;
}

public boolean isSolicitud_estatusConsulta(){
    return solicitud_estatusConsulta;
}

 public void setSolicitud_estatusConsulta( boolean solicitud_estatusConsulta){
    this.solicitud_estatusConsulta = solicitud_estatusConsulta ;
}

public boolean isSolicitud_estatusEliminar(){
    return solicitud_estatusEliminar;
}

 public void setSolicitud_estatusEliminar( boolean solicitud_estatusEliminar){
    this.solicitud_estatusEliminar = solicitud_estatusEliminar ;
}

public boolean isTemaCrear(){
    return temaCrear;
}

 public void setTemaCrear( boolean temaCrear){
    this.temaCrear = temaCrear ;
}

public boolean isTemaEditar(){
    return temaEditar;
}

 public void setTemaEditar( boolean temaEditar){
    this.temaEditar = temaEditar ;
}

public boolean isTemaListar(){
    return temaListar;
}

 public void setTemaListar( boolean temaListar){
    this.temaListar = temaListar ;
}

public boolean isTemaConsulta(){
    return temaConsulta;
}

 public void setTemaConsulta( boolean temaConsulta){
    this.temaConsulta = temaConsulta ;
}

public boolean isTemaEliminar(){
    return temaEliminar;
}

 public void setTemaEliminar( boolean temaEliminar){
    this.temaEliminar = temaEliminar ;
}

public boolean isTrasladoCrear(){
    return trasladoCrear;
}

 public void setTrasladoCrear( boolean trasladoCrear){
    this.trasladoCrear = trasladoCrear ;
}

public boolean isTrasladoEditar(){
    return trasladoEditar;
}

 public void setTrasladoEditar( boolean trasladoEditar){
    this.trasladoEditar = trasladoEditar ;
}

public boolean isTrasladoListar(){
    return trasladoListar;
}

 public void setTrasladoListar( boolean trasladoListar){
    this.trasladoListar = trasladoListar ;
}

public boolean isTrasladoConsulta(){
    return trasladoConsulta;
}

 public void setTrasladoConsulta( boolean trasladoConsulta){
    this.trasladoConsulta = trasladoConsulta ;
}

public boolean isTrasladoEliminar(){
    return trasladoEliminar;
}

 public void setTrasladoEliminar( boolean trasladoEliminar){
    this.trasladoEliminar = trasladoEliminar ;
}

public boolean isUrlCrear(){
    return urlCrear;
}

 public void setUrlCrear( boolean urlCrear){
    this.urlCrear = urlCrear ;
}

public boolean isUrlEditar(){
    return urlEditar;
}

 public void setUrlEditar( boolean urlEditar){
    this.urlEditar = urlEditar ;
}

public boolean isUrlListar(){
    return urlListar;
}

 public void setUrlListar( boolean urlListar){
    this.urlListar = urlListar ;
}

public boolean isUrlConsulta(){
    return urlConsulta;
}

 public void setUrlConsulta( boolean urlConsulta){
    this.urlConsulta = urlConsulta ;
}

public boolean isUrlEliminar(){
    return urlEliminar;
}

 public void setUrlEliminar( boolean urlEliminar){
    this.urlEliminar = urlEliminar ;
}

public boolean isUsu_mod_opcCrear(){
    return usu_mod_opcCrear;
}

 public void setUsu_mod_opcCrear( boolean usu_mod_opcCrear){
    this.usu_mod_opcCrear = usu_mod_opcCrear ;
}

public boolean isUsu_mod_opcEditar(){
    return usu_mod_opcEditar;
}

 public void setUsu_mod_opcEditar( boolean usu_mod_opcEditar){
    this.usu_mod_opcEditar = usu_mod_opcEditar ;
}

public boolean isUsu_mod_opcListar(){
    return usu_mod_opcListar;
}

 public void setUsu_mod_opcListar( boolean usu_mod_opcListar){
    this.usu_mod_opcListar = usu_mod_opcListar ;
}

public boolean isUsu_mod_opcConsulta(){
    return usu_mod_opcConsulta;
}

 public void setUsu_mod_opcConsulta( boolean usu_mod_opcConsulta){
    this.usu_mod_opcConsulta = usu_mod_opcConsulta ;
}

public boolean isUsu_mod_opcEliminar(){
    return usu_mod_opcEliminar;
}

 public void setUsu_mod_opcEliminar( boolean usu_mod_opcEliminar){
    this.usu_mod_opcEliminar = usu_mod_opcEliminar ;
}

public boolean isUsuarioCrear(){
    return usuarioCrear;
}

 public void setUsuarioCrear( boolean usuarioCrear){
    this.usuarioCrear = usuarioCrear ;
}

public boolean isUsuarioEditar(){
    return usuarioEditar;
}

 public void setUsuarioEditar( boolean usuarioEditar){
    this.usuarioEditar = usuarioEditar ;
}

public boolean isUsuarioListar(){
    return usuarioListar;
}

 public void setUsuarioListar( boolean usuarioListar){
    this.usuarioListar = usuarioListar ;
}

public boolean isUsuarioConsulta(){
    return usuarioConsulta;
}

 public void setUsuarioConsulta( boolean usuarioConsulta){
    this.usuarioConsulta = usuarioConsulta ;
}

public boolean isUsuarioEliminar(){
    return usuarioEliminar;
}

 public void setUsuarioEliminar( boolean usuarioEliminar){
    this.usuarioEliminar = usuarioEliminar ;
}


}
