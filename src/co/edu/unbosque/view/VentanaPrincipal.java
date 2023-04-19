package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
	
	private JButton agregar, actualizar, eliminar, e_nombre;
	
	public VentanaPrincipal() {
		setSize(1000, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.black);
		initComponents();
		
		getContentPane().addComponentListener(new ComponentAdapter() {
			public void componentResized( e) {
				Component c = (agregar)e.getSource();
			}
		});
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void initComponents() {
		agregar = new JButton("Agregar");
		agregar.setBounds(450, 385, 100, 30);
		add(agregar);
		
	}

}
