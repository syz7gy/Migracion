package co.edu.unbosque.view;


import java.awt.Color;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelDatos extends JPanel{
	
	private JLabel nom, fech, ed, pais, foto;
	private JTextField cnom, cfech, ced, cpais;
	private JButton sele;

	public PanelDatos() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(new GridLayout(5, 2, 10, 10));
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		initComponents();
	}
	
	private void initComponents() {
		SimpleDateFormat simple = new SimpleDateFormat("dd/mm/yyyy");
		
		nom = new JLabel("Nombre:");
		add(nom);
		
		cnom = new JTextField();
		add(cnom);
		
		fech = new JLabel("Fecha de nacimiento:");
		add(fech);
		
		cfech = new JTextField(simple.toPattern());
		add(cfech);
		
		ed = new JLabel("Edad:");
		add(ed);
		
		ced = new JTextField();
		add(ced);
		
		pais = new JLabel("Pais:");
		add(pais);
		
		cpais = new JTextField();
		add(cpais);
		
		foto = new JLabel("Seleccione la foto");
		add(foto);
		
		sele = new JButton("Seleccionar");
		add(sele);
	}

	public JButton getSele() {
		return sele;
	}

	public void setSele(JButton sele) {
		this.sele = sele;
	}

	public void setCfech(JTextField cfech) {
		this.cfech = cfech;
	}

	public JLabel getNom() {
		return nom;
	}

	public void setNom(JLabel nom) {
		this.nom = nom;
	}

	public JLabel getFech() {
		return fech;
	}

	public void setFech(JLabel fech) {
		this.fech = fech;
	}

	public JLabel getEd() {
		return ed;
	}

	public void setEd(JLabel ed) {
		this.ed = ed;
	}

	public JLabel getPais() {
		return pais;
	}

	public void setPais(JLabel pais) {
		this.pais = pais;
	}

	public JTextField getCnom() {
		return cnom;
	}

	public void setCnom(JTextField cnom) {
		this.cnom = cnom;
	}

	public JTextField getCfech() {
		return cfech;
	}

	public void setCdoc(JTextField cfech) {
		this.cfech = cfech;
	}

	public JTextField getCed() {
		return ced;
	}

	public void setCed(JTextField ced) {
		this.ced = ced;
	}

	public JTextField getCpais() {
		return cpais;
	}

	public void setCpais(JTextField cpais) {
		this.cpais = cpais;
	}

	public JLabel getFoto() {
		return foto;
	}

	public void setFoto(JLabel foto) {
		this.foto = foto;
	}

}
