package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import co.edu.unbosque.model.AdmitidosDAO;
import co.edu.unbosque.model.NoAdmitidosDAO;
import co.edu.unbosque.model.PersonaDAO;
import co.edu.unbosque.model.PersonaDTO;
import co.edu.unbosque.view.VentanaDatos;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controlador implements ActionListener{
	
	private VentanaPrincipal principal;
	private VentanaDatos vdatos;
	private PersonaDAO pdao;
	private AdmitidosDAO adao;
	private NoAdmitidosDAO ndao;
	private String ruta_foto;
	
	public Controlador() {
		principal = new VentanaPrincipal();
		vdatos = new VentanaDatos();
		pdao = new PersonaDAO();
		adao = new AdmitidosDAO();
		ndao = new NoAdmitidosDAO();
		
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		principal.getPnlBotones().getAgregar().addActionListener(this);
		principal.getPnlBotones().getActualizar().addActionListener(this);
		principal.getPnlBotones().getEliminar().addActionListener(this);
		principal.getPnlBotones().getE_nombre().addActionListener(this);
		principal.getPnlBotones().getMostrar().addActionListener(this);
		principal.getPnlBotones().getM_solo().addActionListener(this);
		principal.getPnlBotones().getCerrar().addActionListener(this);
		vdatos.getAceptar().addActionListener(this);
		vdatos.getCancelar().addActionListener(this);
		
		vdatos.getPdatos().getSele().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				fc.setCurrentDirectory(new File(System.getProperty("user.home")));
				int resultado = fc.showOpenDialog(vdatos);
				if(resultado == JFileChooser.APPROVE_OPTION) {
					File seleccionado = fc.getSelectedFile();
					String ruta = seleccionado.getAbsolutePath();
					ruta_foto = ruta;
					JOptionPane.showMessageDialog(null, "Foto seleccionada con exito");
				}
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		System.out.println(comando);
		
		if(comando.equals("AGREGAR")) {
			principal.setVisible(false);
			vdatos.setVisible(true);
		}else if(comando.equals("ACEPTAR")) {
				
		}else if(comando.equals("CANCELAR")) {
			principal.setVisible(true);
			vdatos.setVisible(false);
		}else if(comando.equals("CERRAR")) {
			System.exit(0);
		}
		
	}
	
	public void agregar() {
		String nombre = vdatos.getPdatos().getCnom().getText();
		String[] fecha = vdatos.getPdatos().getCfech().getText().split("/");
//		int dia = Integer.parseInt(fecha[0]);
//		int mes = Integer.parseInt(fecha[1]);
//		int año = Integer.parseInt(fecha[2]);
		@SuppressWarnings("deprecation")
		Date nacimiento = new Date();
		String pais = vdatos.getPdatos().getCpais().getText();
		
//		ImageIcon imagen = new ImageIcon(getClass().getResource(vdatos.getFc().getSelectedFile()));
	}

}
