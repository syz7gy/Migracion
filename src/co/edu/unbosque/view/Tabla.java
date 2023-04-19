package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tabla extends JPanel{
	
	private JTable tabla;
	private DefaultTableModel model;
	
	public Tabla() {
		propiedadesTabla();
	}
	
	private void propiedadesTabla() {
		setLayout(new FlowLayout());
		String[] titulos = {"Nombre", "Fecha", "Pais", "Foto"};
		model = new DefaultTableModel(titulos, 0);
		
		tabla = new JTable(model) {
			public Class<?> getColumnClass(int column){
				return (column == 3) ? Icon.class : Object.class;
			}
		};
		tabla.setDefaultEditor(Object.class, null);
		JScrollPane scroll = new JScrollPane(tabla);
		scroll.setPreferredSize(new Dimension(tabla.getSize()));
		add(scroll);
		setVisible(true);
		setBounds(5, 5, tabla.getWidth(), tabla.getHeight());
		
	}

	public JTable getTabla() {
		return tabla;
	}

	public void setTabla(JTable tabla) {
		this.tabla = tabla;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}
	
	

}
