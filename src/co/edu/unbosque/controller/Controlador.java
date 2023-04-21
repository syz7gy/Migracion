package co.edu.unbosque.controller;

import co.edu.unbosque.view.VentanaDatos;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controlador {
	
	public VentanaPrincipal principal;
	public VentanaDatos vdatos;
	
	public Controlador() {
		principal = new VentanaPrincipal();
		vdatos = new VentanaDatos();
	}

}
