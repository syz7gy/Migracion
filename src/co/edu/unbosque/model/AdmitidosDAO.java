package co.edu.unbosque.model;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.Function;

import co.edu.unbosque.model.persistance.FileHandler;

public class AdmitidosDAO implements OperacionesDAO{
	
	private ArrayList<AdmitidosDTO> lista_si;
	
	public AdmitidosDAO() {
		try {
			lista_si = cargarDesdeArchivo();
		} catch (Exception e) {
			try {
				throw new FileNotFoundException();
			} catch (FileNotFoundException f) {
				lista_si = new ArrayList<>();
			}
		}
		
	}
	
	private ArrayList<AdmitidosDTO> cargarDesdeArchivo(){
		ArrayList<AdmitidosDTO> desde_archivo = new ArrayList<>();
		String contenido = (String) FileHandler.abrirArchivoDeTexto("Admitidos.csv");
		String[] lineas = contenido.split("\n");
		for (String linea : lineas) {
			String[] attrs = linea.split(";");
			String nombre = attrs[0];
			Date nacimiento = new Date(attrs[1]);
			SimpleDateFormat simple = new SimpleDateFormat("dd/mm/yyyy");
			simple.format(nacimiento);
			String pais = attrs[2];
			desde_archivo.add(new AdmitidosDTO(nombre, nacimiento, pais, null));
		}
		return desde_archivo;
	}
	
	private void escribirEnArchivo() {
		StringBuilder sb = new StringBuilder();
		SimpleDateFormat simple = new SimpleDateFormat("dd/mm/yyyy");
		for(AdmitidosDTO a : lista_si) {
			sb.append(a.getNombre() + ";");
			sb.append(a.getFeha_nacimiento() + ";");
			sb.append(simple.format(a.getFeha_nacimiento())+ ";");
			sb.append(a.getFoto());
		}
		FileHandler.escribirEnArhivo("Admitidos.csv", sb.toString());
	}

	public ArrayList<AdmitidosDTO> getLista_si() {
		return (ArrayList<AdmitidosDTO>) lista_si;
	}

	public void setLista_si(ArrayList<AdmitidosDTO> lista_si) {
		this.lista_si = lista_si;
	}

	@Override
	public void crear(Object o) {
		lista_si.add((AdmitidosDTO)o);
		escribirEnArchivo();
	}

	@Override
	public boolean actualizar(int index, Object o) {
		lista_si.set(index, (AdmitidosDTO)o);
		escribirEnArchivo();
		return true;
	}

	@Override
	public boolean eliminar(int index) {
		try {
			lista_si.remove(index);
			escribirEnArchivo();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean eliminar(String name) {
		try {
			int index = lista_si.indexOf(name);
			lista_si.remove(index);
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
		StringBuilder sb = new StringBuilder();
		for(AdmitidosDTO a : lista_si) {
			sb.append(a.toString());
		}
		return sb.toString();
	}

}
