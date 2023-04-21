package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
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
		
		ImageIcon escudo = new ImageIcon(getClass().getResource("/co/edu/unbosque/imagenes/Coat_of_arms_of_Colombia.svg.png"));
		ban = new JLabel(escudo);
		ban.setBounds(10, 10, escudo.getIconWidth(), escudo.getIconHeight());
		add(ban, BorderLayout.CENTER);
		
	}

}
