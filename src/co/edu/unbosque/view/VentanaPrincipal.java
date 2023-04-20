package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
	
	private JButton agregar, actualizar, eliminar, e_nombre, mostrar, m_solo;
	
	public VentanaPrincipal() {
		setSize(1000, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.black);
		initComponents();
		
//		getContentPane().addComponentListener(new ComponentAdapter() {
//			public void componentResized( e) {
//				Component c = (agregar)e.getSource();
//			}
//		});
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void initComponents() {
		agregar = new JButton("Agregar");
		agregar.setBounds(450, 85, 100, 30);
		add(agregar);
		
		actualizar = new JButton("Actualizar");
		actualizar.setBounds(440, 185, 120, 30);
		add(actualizar);
		
		eliminar = new JButton("Eliminar");
		eliminar.setBounds(450, 285, 100, 30);
		add(eliminar);
		
		e_nombre = new JButton("Eliminar por nombre");
		e_nombre.setBounds(400, 385, 200, 30);
		add(e_nombre);
		
		mostrar = new JButton("Mostrar todo");
		mostrar.setBounds(500-(150/2), 485, 150, 30);
		add(mostrar);
		
		m_solo = new JButton("Mostrar individuo");
		m_solo.setBounds(400, 585, 200, 30);
		add(m_solo);
		
	}

}
