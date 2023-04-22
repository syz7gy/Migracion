package co.edu.unbosque.util.exception;

import java.util.NoSuchElementException;

public class NonExistentCountry extends NoSuchElementException{
	
	public NonExistentCountry() {
		super("El pais no existe. Intentelo de nuevo");
	}

}
