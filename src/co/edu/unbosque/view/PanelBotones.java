package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotones extends JPanel{
	
	private JButton agregar, actualizar, eliminar, e_nombre, mostrar, m_solo, cerrar;
	
	public PanelBotones() {
		setBackground(Color.white);
		setSize(600, 500);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setAlignmentX(CENTER_ALIGNMENT);
		setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		initComponents();
	}
	
	public void initComponents() {
		agregar = new JButton("Agregar");
		agregar.setAlignmentX(Component.CENTER_ALIGNMENT);
//		agregar.setBounds(450, 150, 100, 30);
		add(agregar);
		add(Box.createVerticalGlue());
		
		
		actualizar = new JButton("Actualizar");
		actualizar.setAlignmentX(Component.CENTER_ALIGNMENT);
//		actualizar.setBounds(440, 200, 120, 30);
		add(actualizar);
		add(Box.createVerticalGlue());
		
		eliminar = new JButton("Eliminar");
		eliminar.setAlignmentX(Component.CENTER_ALIGNMENT);
//		eliminar.setBounds(450, 250, 100, 30);
		add(eliminar);
		add(Box.createVerticalGlue());
		
		e_nombre = new JButton("Eliminar por nombre");
		e_nombre.setAlignmentX(Component.CENTER_ALIGNMENT);
//		e_nombre.setBounds(400, 300, 200, 30);
		add(e_nombre);
		add(Box.createVerticalGlue());
		
		mostrar = new JButton("Mostrar todo");
		mostrar.setAlignmentX(Component.CENTER_ALIGNMENT);
//		mostrar.setBounds(500-(150/2), 350, 150, 30);
		add(mostrar);
		add(Box.createVerticalGlue());
		
		m_solo = new JButton("Mostrar individuo");
		m_solo.setAlignmentX(Component.CENTER_ALIGNMENT);
//		m_solo.setBounds(400, 400, 200, 30);
		add(m_solo);
		add(Box.createVerticalGlue());
		
		cerrar = new JButton("Cerrar programa");
		cerrar.setAlignmentX(Component.CENTER_ALIGNMENT);
//		cerrar.setBounds(400, 450, 200, 30);
		add(cerrar);
	}
	
	

}
