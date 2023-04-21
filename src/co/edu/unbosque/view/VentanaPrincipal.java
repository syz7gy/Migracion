package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class VentanaPrincipal extends JFrame {
	
	private JLabel img;
	private PanelBotones pnlBotones;
	
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
		
		getContentPane().setBackground(new Color(146, 131, 8));

		setLocationRelativeTo(null);
		setVisible(true);
		
		
		
	}
	
//	private void initialize() {
////		frame = new JFrame();
////		frame.setBounds(100, 100, 450, 300);
////		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//		agregar = new JButton("Tiene Padre");
//		agregar.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		GroupLayout groupLayout = new GroupLayout(getContentPane());
//		groupLayout.setHorizontalGroup(
//			groupLayout.createParallelGroup(Alignment.LEADING)
//				.addGroup(groupLayout.createSequentialGroup()
//					.addGap(244)
//					.addComponent(agregar))
//		);
//		groupLayout.setVerticalGroup(
//			groupLayout.createParallelGroup(Alignment.LEADING)
//				.addGroup(groupLayout.createSequentialGroup()
//					.addGap(91)
//					.addComponent(agregar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//					.addGap(151))
//		);
////		getContentPane().setLayout(groupLayout)
//	}
	
	
	
	

}
