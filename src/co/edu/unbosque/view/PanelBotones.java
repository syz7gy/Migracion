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
		agregar.setActionCommand("AGREGAR");
		agregar.setFocusable(false);
		agregar.setAlignmentX(Component.CENTER_ALIGNMENT);
		agregar.setPreferredSize(size);
		agregar.setBackground(color);
		add(agregar);
		add(Box.createVerticalGlue());
		
		
		actualizar = new JButton("Actualizar");
		actualizar.setActionCommand("ACTUALIZAR");
		actualizar.setFocusable(false);
		actualizar.setAlignmentX(Component.CENTER_ALIGNMENT);
		actualizar.setPreferredSize(size);
		actualizar.setBackground(color);
		add(actualizar);
		add(Box.createVerticalGlue());
		
		eliminar = new JButton("Eliminar");
		eliminar.setActionCommand("ELIMINAR");
		eliminar.setFocusable(false);
		eliminar.setAlignmentX(Component.CENTER_ALIGNMENT);
		eliminar.setPreferredSize(size);
		eliminar.setBackground(color);
		add(eliminar);
		add(Box.createVerticalGlue());
		
		e_nombre = new JButton("Eliminar por nombre");
		e_nombre.setActionCommand("E_NOMBRE");
		e_nombre.setFocusable(false);
		e_nombre.setAlignmentX(Component.CENTER_ALIGNMENT);
		e_nombre.setPreferredSize(size2);
		e_nombre.setBackground(color);
		add(e_nombre);
		add(Box.createVerticalGlue());
		
		mostrar = new JButton("Mostrar todo");
		mostrar.setActionCommand("M_TODO");
		mostrar.setFocusable(false);
		mostrar.setAlignmentX(Component.CENTER_ALIGNMENT);
		mostrar.setPreferredSize(size2);
		mostrar.setBackground(color);
		add(mostrar);
		add(Box.createVerticalGlue());
		
		m_solo = new JButton("Mostrar individuo");
		m_solo.setActionCommand("M_SOLO");
		m_solo.setFocusable(false);
		m_solo.setAlignmentX(Component.CENTER_ALIGNMENT);
		m_solo.setPreferredSize(size2);
		m_solo.setBackground(color);
		add(m_solo);
		add(Box.createVerticalGlue());
		
		cerrar = new JButton("Cerrar programa");
		cerrar.setActionCommand("CERRAR");
		cerrar.setFocusable(false);
		cerrar.setAlignmentX(Component.CENTER_ALIGNMENT);
		cerrar.setPreferredSize(size);
		cerrar.setBackground(color);
		add(cerrar);
	}

	public JButton getAgregar() {
		return agregar;
	}

	public void setAgregar(JButton agregar) {
		this.agregar = agregar;
	}

	public JButton getActualizar() {
		return actualizar;
	}

	public void setActualizar(JButton actualizar) {
		this.actualizar = actualizar;
	}

	public JButton getEliminar() {
		return eliminar;
	}

	public void setEliminar(JButton eliminar) {
		this.eliminar = eliminar;
	}

	public JButton getE_nombre() {
		return e_nombre;
	}

	public void setE_nombre(JButton e_nombre) {
		this.e_nombre = e_nombre;
	}

	public JButton getMostrar() {
		return mostrar;
	}

	public void setMostrar(JButton mostrar) {
		this.mostrar = mostrar;
	}

	public JButton getM_solo() {
		return m_solo;
	}

	public void setM_solo(JButton m_solo) {
		this.m_solo = m_solo;
	}

	public JButton getCerrar() {
		return cerrar;
	}

	public void setCerrar(JButton cerrar) {
		this.cerrar = cerrar;
	}
	
	

}
