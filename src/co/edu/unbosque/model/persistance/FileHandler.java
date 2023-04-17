package co.edu.unbosque.model.persistance;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandler {
	
	private static Scanner lector;
	private static File file;
	private static PrintWriter excritor;
	private static ObjectInputStream ois;
	private static ObjectOutputStream oos;
	private String nombre_archivo;

	
	public FileHandler() {
		abrirArchivoDetexto(nombre_archivo);
	}
	
	
	public static String abrirArchivoDetexto(String nombre_archivo) {
		file = new File("src/co/edu/unbosque/model/persistance/"+nombre_archivo);
		StringBuilder contenido = new StringBuilder();
		try {
			lector = new Scanner(file);
			while(lector.hasNext()) {
				contenido.append(lector.nextLine());
			}
			lector.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error de lectura: Archivo no encontrado");
			e.printStackTrace();
		}catch (IOException io) {
			System.out.println("Error de lectura: Revise permisos.");
			io.printStackTrace();
		}
		return contenido.toString();
	}


	public static Scanner getLector() {
		return lector;
	}


	public static void setLector(Scanner lector) {
		FileHandler.lector = lector;
	}


	public static File getFile() {
		return file;
	}


	public static void setFile(File file) {
		FileHandler.file = file;
	}


	public String getNombre_archivo() {
		return nombre_archivo;
	}


	public void setNombre_archivo(String nombre_archivo) {
		this.nombre_archivo = nombre_archivo;
	}
	
}
