package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaDatos extends JFrame{
	
	private PanelDatos pdatos;
	private JPanel pbuttons, parchivo;
	private JButton aceptar, cancelar;
	private JLabel empty;
	private JLabel imagen;
	private String ruta;
	
	public VentanaDatos() {
		setSize(800, 500);
		getContentPane().setBackground(new Color(0, 14, 151));
		getContentPane().setLayout(new BorderLayout(10, 10));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		pbuttons = new JPanel();
		pbuttons.setLayout(new FlowLayout());
		pbuttons.setBackground(new Color(103, 149, 230));
		aceptar = new JButton("Aceptar");
		aceptar.setActionCommand("ACEPTAR");
		aceptar.setBackground(new Color(161, 212, 249));
		aceptar.setFocusable(false);
		pbuttons.add(aceptar);
		empty = new JLabel("         ");
		pbuttons.add(empty);
		cancelar = new JButton("Cancelar");
		cancelar.setActionCommand("CANCELAR");
		cancelar.setBackground(new Color(161, 212, 249));
		cancelar.setFocusable(false);
		pbuttons.add(cancelar);
		add(pbuttons, BorderLayout.SOUTH);
		
		ImageIcon img = new ImageIcon(ruta);
		imagen = new JLabel(img);
		parchivo = new JPanel();
		parchivo.setLayout(new BorderLayout(10, 10));
		parchivo.add(imagen, BorderLayout.CENTER);
		add(parchivo, BorderLayout.CENTER);
		
		pdatos = new PanelDatos();
		pdatos.setBackground(new Color(103, 149, 230));
		add(pdatos, BorderLayout.WEST);
		
		setVisible(false);
	}

	public JLabel getImagen() {
		return imagen;
	}

	public void setImagen(JLabel imagen) {
		this.imagen = imagen;
	}

	public PanelDatos getPdatos() {
		return pdatos;
	}

	public void setPdatos(PanelDatos pdatos) {
		this.pdatos = pdatos;
	}

	public JPanel getPbuttons() {
		return pbuttons;
	}

	public void setPbuttons(JPanel pbuttons) {
		this.pbuttons = pbuttons;
	}

	public JPanel getParchivo() {
		return parchivo;
	}

	public void setParchivo(JPanel parchivo) {
		this.parchivo = parchivo;
	}

	public JButton getAceptar() {
		return aceptar;
	}

	public void setAceptar(JButton aceptar) {
		this.aceptar = aceptar;
	}

	public JButton getCancelar() {
		return cancelar;
	}

	public void setCancelar(JButton cancelar) {
		this.cancelar = cancelar;
	}

	public JLabel getEmpty() {
		return empty;
	}

	public void setEmpty(JLabel empty) {
		this.empty = empty;
	}


}
