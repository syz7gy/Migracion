package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class VentanaPrincipal extends JFrame {
	
	private JLabel img;
	private PanelBotones pnlBotones;
	private PanelDerecho pnlDerecho;
	
	public VentanaPrincipal() {
		setSize(1000, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		getContentPane().setLayout(new BorderLayout(10, 10));
		
		ImageIcon logo = new ImageIcon(getClass().getResource("/co/edu/unbosque/imagenes/migracion-logo (2).png"));
		img = new JLabel(logo);
		img.setBounds(10, 10, logo.getIconWidth(), logo.getIconHeight());
		add(img, BorderLayout.NORTH);
		
		pnlBotones = new PanelBotones();
		add(pnlBotones, BorderLayout.WEST);
		
		pnlDerecho = new PanelDerecho();
		add(pnlDerecho, BorderLayout.CENTER);
		
		getContentPane().setBackground(new Color(146, 131, 8));

		setLocationRelativeTo(null);
		setVisible(true);
		
		
		
	}
	

	
	
	
	

}
