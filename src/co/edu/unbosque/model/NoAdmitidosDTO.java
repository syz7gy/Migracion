package co.edu.unbosque.model;

import java.awt.Image;
import java.util.Date;

import javax.swing.ImageIcon;

public class NoAdmitidosDTO extends PersonaDTO{

	public NoAdmitidosDTO() {
		// TODO Auto-generated constructor stub
	}
/**
 * Constructor de la super clase  
 * @param nombre - nombre de la persona
 * @param fecha_nacimiento - fecha de nacimiento de la persona
 * @param pais - pais de origen de la persona
 * @param foto - foto del pasaporte de la persona 
 */
	public NoAdmitidosDTO(String nombre, Date fecha_nacimiento, String pais, ImageIcon foto) {
	super(nombre, fecha_nacimiento, pais, foto);
	// TODO Auto-generated constructor stub
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: " + getNombre() + "\n");
		sb.append("Fecha: " + getFeha_nacimiento() + "\n");
		sb.append("Pais: " + getPais() + "\n");
		return sb.toString();
	}
	
	
	
	

}
