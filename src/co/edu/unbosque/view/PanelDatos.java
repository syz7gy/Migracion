package co.edu.unbosque.view;


import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelDatos extends JPanel{
	
	private JLabel nom, doc, ed, pais;
	private JTextField cnom, cdoc, ced, cpais;

	public PanelDatos() {

		setBackground(Color.LIGHT_GRAY);
		setLayout(new GridLayout(5, 2, 10, 10));
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		initComponents();
	}
	
	private void initComponents() {
		
		nom = new JLabel("Nombre:");
		add(nom);
		
		cnom = new JTextField();
		add(cnom);
		
		doc = new JLabel("Documento:");
		add(doc);
		
		cdoc = new JTextField();
		add(cdoc);
		
		ed = new JLabel("Edad:");
		add(ed);
		
		ced = new JTextField();
		add(ced);
		
		pais = new JLabel("Pais:");
		add(pais);
		
		cpais = new JTextField();
		add(cpais);
		
	}

}
