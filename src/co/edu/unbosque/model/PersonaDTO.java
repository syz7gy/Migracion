package co.edu.unbosque.model;

import java.awt.Image;
import java.io.Serializable;
import java.util.Date;

import javax.swing.JFileChooser;
/**
 * esta clase define el objeto PersonaDTO que representa una persona con sus caracteristicas
 * @author Diego Acevedo
 * @version 1.0
 */
public class PersonaDTO implements Serializable{
/**
 * serialVersionUID de la clase
 */
	private static final long serialVersionUID = 7236356291500839371L;
	/**
	 * Nombre de la persona*
	 */
	private String nombre;
	/**
	 * Pais de orige de la persona
	 */
	private Date fecha_nacimiento;
	private String pais;
	/**
	 * foto del pasaporte de la persona 
	 */
	private Image foto;
	/**
	 * Constructor por defecto de la clase PersonaDTO
	 */
	public PersonaDTO() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructor de la clase personaDTO
	 * @param nombre - Nombre de la persona 
	 * @param feha_nacimiento - Fecha de nacimiento
	 * @param pais - Pais de origen de la persona 
	 * @param foto - foto del documento de la persona 
	 */
/**
 * Constructor de la super clase  
 * @param nombre - nombre de la persona
 * @param fecha_nacimiento - fecha de nacimiento de la persona
 * @param pais - pais de origen de la persona
 * @param foto - foto del pasaporte de la persona 
 */
	public PersonaDTO(String nombre, Date feha_nacimiento, String pais, Image foto) {
		super();
		this.nombre = nombre;
		this.fecha_nacimiento = feha_nacimiento;
		this.pais = pais;
		this.foto = foto;
	}
/**
 * Obtiene el nombre de la persona
 * @return Nombre de la persona
 */
	public String getNombre() {
		return nombre;
	}
/**
 * Establece el nombre de a persona 
 * @param nombre de la persona 
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * Obtiene la fecha de nacimiento de la persona 
 * @return Fecha e nacimiento de la persona
 */
	public Date getFeha_nacimiento() {
		return fecha_nacimiento;
	}
/**
 * Establece la fecha de nacimiento de la persona 
 * @param feha_nacimiento
 */
	public void setFeha_nacimiento(Date feha_nacimiento) {
		this.fecha_nacimiento = feha_nacimiento;
	}
/**
 * Obtiene el pais de origen de la persona
 * @return Pais de origen de la persona
 */
	public String getPais() {
		return pais;
	}
/**
 * Establece el ais de origen de la persona 
 * @param pais de origen de la persona 
 */
	public void setPais(String pais) {
		this.pais = pais;
	}
/**
 * Obtiene la foto del pasaporte de la persona 
 * @return foto del pasaporte de la persona
 */
	public Image getFoto() {
		return foto;
	}
/**
 * Establece la foto del pasaporte de la persona
 * @param foto del pasaporte de la persona
 */
	public void setFoto(Image foto) {
		this.foto = foto;
	}
/**
 * Obtiene el serialVrsonUID de la clase
 * @return serialVersionUID de la clase
 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

/**
 * Repesentacion en cadena de la clase PersonaDTO
 * @return Cadena con el nombre, fecha de nacimoento, pais de origen y foto del pasaporte de la persona
 */
	public String toString() {
		return nombre + ";" + fecha_nacimiento + ";" + pais + ";"
				+ foto;
	}
	
	
	
	

}
