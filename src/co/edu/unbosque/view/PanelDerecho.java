package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelDerecho extends JPanel{
	
	private JLabel ban;
	
	public PanelDerecho() {
		setBackground(new Color(146, 131, 8));
		setLayout(new BorderLayout(10, 10));
		
		initComponents();
	}
	
	public void initComponents() {
		
		ImageIcon bandera = new ImageIcon(getClass().getResource("/co/edu/unbosque/imagenes/Coat_of_arms_of_Colombia.svg.png"));
		ban = new JLabel(bandera);
		ban.setBounds(10, 10, bandera.getIconWidth(), bandera.getIconHeight());
		add(ban, BorderLayout.CENTER);
		
	}

}
