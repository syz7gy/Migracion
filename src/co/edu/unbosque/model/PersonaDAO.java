package co.edu.unbosque.model;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;

import co.edu.unbosque.model.persistance.FileHandler;

public class PersonaDAO implements OperacionesDAO{
	
	private ArrayList<PersonaDTO> lista;
	private String archivo;
	
	public PersonaDAO() {
		lista = new ArrayList<>();
		
	}
	
	private ArrayList<PersonaDTO> cargarDesdeArchivo(){
		ArrayList<PersonaDTO> desde_archivo;
		String contenido = FileHandler.abrirArchivoDeTexto(archivo);
		String[] lineas = contenido.split("\n");
		for (String linea : lineas) {
			String[] attrs = linea.split(";");
			String nombre = attrs[0];
			String[] fecha = attrs[1].split("/");
			int dia = Integer.parseInt(fecha[0]);
			int mes = Integer.parseInt(fecha[1]);
			int año = Integer.parseInt(fecha[2]);
			Date nacimiento = new Date(año - 1900, mes, dia);
			String pais = attrs[2];
		}
		return null;
	}

	public ArrayList<PersonaDTO> getLista() {
		return lista;
	}

	public void setLista(ArrayList<PersonaDTO> lista) {
		this.lista = lista;
	}

	@Override
	public void crear(Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean actualizar(int index, Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void mostrarTodo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		return null;
	}

}
