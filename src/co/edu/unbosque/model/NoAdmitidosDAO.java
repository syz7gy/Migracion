package co.edu.unbosque.model;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.Function;

import co.edu.unbosque.model.persistance.FileHandler;

public class NoAdmitidosDAO implements OperacionesDAO{
	
	private ArrayList<NoAdmitidosDTO> lista_no;
	
	public NoAdmitidosDAO() {
		try {
			lista_no = cargarDesdeArchivo();
		} catch (Exception e) {
			try {
				throw new FileNotFoundException();
			} catch (FileNotFoundException f) {
				lista_no = new ArrayList<>();
			}
		}
		
	}
	
	private ArrayList<NoAdmitidosDTO> cargarDesdeArchivo(){
		ArrayList<NoAdmitidosDTO> desde_archivo = new ArrayList<>();
		String contenido = (String) FileHandler.abrirArchivoDeTexto("NoAdmitidos.csv");
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
		for(NoAdmitidosDTO p : lista_no) {
			sb.append(p.getNombre() + ";");
			sb.append(simple.format(p.getFeha_nacimiento()) + ";");
			sb.append(p.getPais() + ";");
			sb.append(p.getFoto());
		}
		FileHandler.escribirEnArhivo("NoAdmitidos.csv", sb.toString());
	}

	public ArrayList<NoAdmitidosDTO> getLista_no() {
		return (ArrayList<NoAdmitidosDTO>) lista_no;
	}

	public void setLista_no(ArrayList<NoAdmitidosDTO> lista_no) {
		this.lista_no = lista_no;
	}

	@Override
	public void crear(Object o) {
		lista_no.add((NoAdmitidosDTO)o);
		escribirEnArchivo();
	}

	@Override
	public boolean actualizar(int index, Object o) {
		lista_no.set(index, (NoAdmitidosDTO)o);
		escribirEnArchivo();
		return true;
	}

	@Override
	public boolean eliminar(int index) {
		try {
			lista_no.remove(index);
			escribirEnArchivo();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean eliminar(String name) {
		try {
			int index = lista_no.indexOf(name);
			lista_no.remove(index);
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
