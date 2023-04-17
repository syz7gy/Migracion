package co.edu.unbosque.model;

import java.awt.Image;
import java.io.Serializable;
import java.util.Date;

import javax.swing.JFileChooser;

public class PersonaDTO implements Serializable{

	private static final long serialVersionUID = 7236356291500839371L;
	private String nombre;
	private Date feha_nacimiento;
	private String pais;
	private Image foto;
	
	public PersonaDTO() {
		// TODO Auto-generated constructor stub
	}

	public PersonaDTO(String nombre, Date feha_nacimiento, String pais, Image foto) {
		super();
		this.nombre = nombre;
		this.feha_nacimiento = feha_nacimiento;
		this.pais = pais;
		this.foto = foto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFeha_nacimiento() {
		return feha_nacimiento;
	}

	public void setFeha_nacimiento(Date feha_nacimiento) {
		this.feha_nacimiento = feha_nacimiento;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Image getFoto() {
		return foto;
	}

	public void setFoto(Image foto) {
		this.foto = foto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
