package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
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
	private JFileChooser fc;
	
	public VentanaDatos() {
		setSize(800, 500);
		getContentPane().setBackground(Color.black);
		getContentPane().setLayout(new BorderLayout(10, 10));
		setLocationRelativeTo(null);
		
		pbuttons = new JPanel();
		pbuttons.setLayout(new FlowLayout());
		aceptar = new JButton("Aceptar");
		pbuttons.add(aceptar);
		empty = new JLabel("         ");
		pbuttons.add(empty);
		cancelar = new JButton("Cancelar");
		pbuttons.add(cancelar);
		add(pbuttons, BorderLayout.SOUTH);
		
		parchivo = new JPanel();
		fc = new JFileChooser();
		parchivo.setLayout(new BorderLayout(10, 10));
		parchivo.add(fc, BorderLayout.CENTER);
		add(parchivo, BorderLayout.CENTER);
		
		pdatos = new PanelDatos();
		add(pdatos, BorderLayout.WEST);
		
		
		
		setVisible(true);
	}

}
