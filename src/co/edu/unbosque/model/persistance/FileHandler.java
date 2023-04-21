package co.edu.unbosque.model.persistance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandler {

	private static Scanner lector;
	private static File file;
	private static PrintWriter escritor;
	private static ObjectInputStream ois;
	private static ObjectOutputStream oos;
	private String nombre_archivo;

	public FileHandler() {
		abrirArchivoDeTexto(nombre_archivo);
	}

	public static String abrirArchivoDeTexto(String nombre_archivo) {
		file = new File("src/co/edu/unbosque/model/persistance/" + nombre_archivo);
		StringBuilder contenido = new StringBuilder();
		try {
			lector = new Scanner(file);
			while (lector.hasNext()) {
				contenido.append(lector.nextLine());
			}
			lector.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error de lectura: Archivo no encontrado");
			e.printStackTrace();
		} catch (IOException io) {
			System.out.println("Error de lectura: Revise permisos.");
			io.printStackTrace();
		}
		return contenido.toString();
	}

	public static void escribirEnArhivo(String nombre_archivo, String contenido_escribir) {
		file = new File("src/co/eduunbosque/model/persistanccce/ " + nombre_archivo);
		try {
			escritor = new PrintWriter(file);
			escritor.write(contenido_escribir);
			escritor.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error de escritura: Archivo no encontrado.");
			e.printStackTrace();
			try {
				file.createNewFile();
			} catch (IOException io) {
				io.printStackTrace();
			}
		} catch (IOException io) {
			System.out.println("Error de escritura: Revise permisos.");
		}
	}

	public static void escribirSerializado(String nombre_archivo, Object o) {
		//file = new  File("src/co/edu/unbosque/model/persistance/"+ nombre_archivo);
		try {
			oos= new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(o);
			oos.close();
		} catch (FileNotFoundException e) {
			System.out.println("(Serializado/Salida) Error de escritura: Archivo no encontrado.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("(Serializado/Salida) Error de escritura: Revise permisos.");
			e.printStackTrace();
		}
		
	}
	
	public static Object leerSerializado(String nombre_archivo) {
		//file = new File("src/co/edu/unbosque/model/persistance/"+ nombre_archivo);
		try {
		ois = new ObjectInputStream(new FileInputStream(nombre_archivo));
		Object o = ois.readObject();
		ois.close();
		return o;
		} catch (FileNotFoundException e) {
			System.out.println("(Serializado/Entrada) Error de lectura: Archivo no encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("(Serializado/Entrada) Error de lectura: Revise permisos.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("(Serializado/Entrada) Error de lectura: Clase no encontrada.");
			e.printStackTrace();
		}
		return null;
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
