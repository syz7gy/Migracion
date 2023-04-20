package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.function.Function;

import co.edu.unbosque.model.persistance.FileHandler;

public class PersonaDAO implements OperacionesDAO{
	
	private ArrayList<PersonaDTO> lista;
	
	public PersonaDAO() {
		try {
			lista = cargarDesdeArchivo();
		} catch (Exception e) {
			lista = new ArrayList<>();
		}
		
	}
	
	private ArrayList<PersonaDTO> cargarDesdeArchivo(){
		ArrayList<PersonaDTO> desde_archivo = new ArrayList<>();
		String contenido = (String) FileHandler.leerSerializado("Personas.jpac");
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
			desde_archivo.add(new PersonaDTO(nombre, nacimiento, pais, null));
		}
		return desde_archivo;
	}
	
	private void escribirEnArchivo() {
		StringBuilder sb = new StringBuilder();
		for(PersonaDTO p : lista) {
			sb.append(p.getNombre() + ";");
			sb.append(p.getFeha_nacimiento() + ";");
			sb.append(p.getPais() + ";");
			sb.append(p.getFoto());
		}
		FileHandler.escribirSerializado("Personas.jpac", sb.toString());
	}

	public ArrayList<PersonaDTO> getLista() {
		return (ArrayList<PersonaDTO>) lista;
	}

	public void setLista(ArrayList<PersonaDTO> lista) {
		this.lista = lista;
	}

	@Override
	public void crear(Object o) {
		lista.add((PersonaDTO)o);
		escribirEnArchivo();
	}

	@Override
	public boolean actualizar(int index, Object o) {
		lista.set(index, (PersonaDTO)o);
		escribirEnArchivo();
		return true;
	}

	@Override
	public boolean eliminar(int index) {
		try {
			lista.remove(index);
			escribirEnArchivo();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean eliminar(String name) {
		try {
			int index = lista.indexOf(name);
			lista.remove(index);
			escribirEnArchivo();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public void mostrarTodo() {
		
	}

	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		return null;
	}

}
