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
		setBackground(new Color(173, 160, 51));
//		setSize(600, 500);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setAlignmentX(CENTER_ALIGNMENT);
		setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		initComponents();
	}
	
	public void initComponents() {
		Dimension size = new Dimension(100, 30);
		Dimension size2 = new Dimension(200, 30);
		Color color = new Color(241, 242, 192);
		
		agregar = new JButton("Agregar");
		agregar.setAlignmentX(Component.CENTER_ALIGNMENT);
		agregar.setPreferredSize(size);
		agregar.setBackground(color);
		add(agregar);
		add(Box.createVerticalGlue());
		
		
		actualizar = new JButton("Actualizar");
		actualizar.setAlignmentX(Component.CENTER_ALIGNMENT);
		actualizar.setPreferredSize(size);
		actualizar.setBackground(color);
		add(actualizar);
		add(Box.createVerticalGlue());
		
		eliminar = new JButton("Eliminar");
		eliminar.setAlignmentX(Component.CENTER_ALIGNMENT);
		eliminar.setPreferredSize(size);
		eliminar.setBackground(color);
		add(eliminar);
		add(Box.createVerticalGlue());
		
		e_nombre = new JButton("Eliminar por nombre");
		e_nombre.setAlignmentX(Component.CENTER_ALIGNMENT);
		e_nombre.setPreferredSize(size2);
		e_nombre.setBackground(color);
		add(e_nombre);
		add(Box.createVerticalGlue());
		
		mostrar = new JButton("Mostrar todo");
		mostrar.setAlignmentX(Component.CENTER_ALIGNMENT);
		mostrar.setPreferredSize(size2);
		mostrar.setBackground(color);
		add(mostrar);
		add(Box.createVerticalGlue());
		
		m_solo = new JButton("Mostrar individuo");
		m_solo.setAlignmentX(Component.CENTER_ALIGNMENT);
		m_solo.setPreferredSize(size2);
		m_solo.setBackground(color);
		add(m_solo);
		add(Box.createVerticalGlue());
		
		cerrar = new JButton("Cerrar programa");
		cerrar.setAlignmentX(Component.CENTER_ALIGNMENT);
		cerrar.setPreferredSize(size);
		cerrar.setBackground(color);
		add(cerrar);
	}
	
	

}
