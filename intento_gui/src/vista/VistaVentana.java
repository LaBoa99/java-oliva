package vista;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JButton;

public class VistaVentana extends JFrame {
	
	public VistaVentana() {
		// Configuración de la ventana
		this.setTitle("Mi Ventana");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(640, 480);
		
		this.getContentPane().setBackground(new Color(255, 192, 203));
		this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.setResizable(false);
        this.setAlwaysOnTop(true);
        this.setEnabled(false);
	}
}
