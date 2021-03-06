package py.gov.stp.objetosV2;
import java.sql.Date;
/**
@author          DGTIC - STP
@email			 dgtic@stp.gov.py
*/
public class Cronograma {
	protected int id;
	protected String nombre;
	protected String descripcion;
	protected double proporcion;
	protected double peso;
	protected int version;
	protected boolean borrado =false;
	protected int accion_id;
	protected int unidad_medida_id;
	protected int hito_tipo_id;
	protected boolean acumulable;
	protected Date fechaInsercion;
	protected Date fechaActualizacion;	
    protected String usuarioResponsable;
    protected String prodConcat;
    	
	
	public int getId() { 
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getProporcion() {
		return proporcion;
	}


	public void setProporcion(double proporcion) {
		this.proporcion = proporcion;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	public boolean isBorrado() {
		return borrado;
	}


	public void setBorrado(boolean borrado) {
		this.borrado = borrado;
	}


	public int getAccion_id() {
		return accion_id;
	}


	public void setAccion_id(int accion_id) {
		this.accion_id = accion_id;
	}


	public int getUnidad_medida_id() {
		return unidad_medida_id;
	}


	public void setUnidad_medida_id(int unidad_medida_id) {
		this.unidad_medida_id = unidad_medida_id;
	}


	public int getHito_tipo_id() {
		return hito_tipo_id;
	}


	public void setHito_tipo_id(int hito_tipo_id) {
		this.hito_tipo_id = hito_tipo_id;
	}


	public boolean isAcumulable() {
		return acumulable;
	}


	public void setAcumulable(boolean acumulable) {
		this.acumulable = acumulable;
	}


	public void changeBorrado(){
		this.borrado=!borrado;
	}


	public Date getFechaInsercion() {
		return fechaInsercion;
	}


	public void setFechaInsercion(Date fechaInsercion) {
		this.fechaInsercion = fechaInsercion;
	}


	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}


	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}


	public String getUsuarioResponsable() {
		return usuarioResponsable;
	}


	public void setUsuarioResponsable(String usuarioResponsable) {
		this.usuarioResponsable = usuarioResponsable;
	}


	public String getProdConcat() {
		return prodConcat;
	}


	public void setProdConcat(String prodConcat) {
		this.prodConcat = prodConcat;
	}
	
}