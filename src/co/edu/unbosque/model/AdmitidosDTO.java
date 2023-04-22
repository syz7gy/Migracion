package co.edu.unbosque.model;

import java.awt.Image;
import java.util.Date;

import javax.swing.ImageIcon;

public class AdmitidosDTO extends PersonaDTO{
	
	public AdmitidosDTO() {
		// TODO Auto-generated constructor stub
	}

	public AdmitidosDTO(String nombre, Date fecha_nacimiento, String pais, ImageIcon foto) {
		super(nombre, fecha_nacimiento, pais, foto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: " + getNombre() + "\n");
		sb.append("Fecha: " + getFeha_nacimiento() + "\n");
		sb.append("Pais: " + getPais() + "\n");
		return sb.toString();
	}

}
