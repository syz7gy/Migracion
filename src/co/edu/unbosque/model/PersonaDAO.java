package co.edu.unbosque.model;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.Function;

import co.edu.unbosque.model.persistance.FileHandler;

public class PersonaDAO implements OperacionesDAO{
	
	private ArrayList<NoAdmitidosDTO> lista;
	
	public PersonaDAO() {
		try {
			lista = cargarDesdeArchivo();
		} catch (Exception e) {
			try {
				throw new FileNotFoundException();
			} catch (FileNotFoundException f) {
				lista = new ArrayList<>();
			}
		}
		
	}
	
	private ArrayList<NoAdmitidosDTO> cargarDesdeArchivo(){
		ArrayList<NoAdmitidosDTO> desde_archivo = new ArrayList<>();
		String contenido = (String) FileHandler.leerSerializado("Personas.jpac");
		String[] lineas = contenido.split("\n");
		for (String linea : lineas) {
			String[] attrs = linea.split(";");
			String nombre = attrs[0];
			Date nacimiento = new Date(attrs[1]);
			SimpleDateFormat simple = new SimpleDateFormat("dd/mm/yyyy");
			simple.format(nacimiento);
			String pais = attrs[2];
			desde_archivo.add(new NoAdmitidosDTO(nombre, nacimiento, pais, null));
		}
		return desde_archivo;
	}
	
	private void escribirEnArchivo() {
		StringBuilder sb = new StringBuilder();
		SimpleDateFormat simple = new SimpleDateFormat("dd/mm/yyyy");
		for(NoAdmitidosDTO p : lista) {
			sb.append(p.getNombre() + ";");
			sb.append(simple.format(p.getFeha_nacimiento()) + ";");
			sb.append(p.getPais() + ";");
			sb.append(p.getFoto());
		}
		FileHandler.escribirSerializado("Personas.jpac", sb.toString());
	}

	public ArrayList<NoAdmitidosDTO> getLista() {
		return (ArrayList<NoAdmitidosDTO>) lista;
	}

	public void setLista(ArrayList<NoAdmitidosDTO> lista) {
		this.lista = lista;
	}

	@Override
	public void crear(Object o) {
		lista.add((NoAdmitidosDTO)o);
		escribirEnArchivo();
	}

	@Override
	public boolean actualizar(int index, Object o) {
		lista.set(index, (NoAdmitidosDTO)o);
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
