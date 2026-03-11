package vista;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class VistaVentana extends JFrame {

	// Botones
	public JButton BtnSalir = new JButton("Salir");
	public JButton BtnVerde = new JButton("Verde");
	public JButton BtnRojo = new JButton("Rojo");
	public JButton BtnVer = new JButton("Ver");
	public JButton BtnOcultar = new JButton("Ocultar");

	public ImageIcon Calabazin = new ImageIcon("calabazin.png");
	public JLabel CalabazinContainer = new JLabel();

	public JMenuBar BarraDeMenu = new JMenuBar();

	public JMenu MenuArchivo = new JMenu("Archivo");
	public JMenuItem ItemGuardar = new JMenuItem("Guardar Como");
	public JMenuItem ItemSalir = new JMenuItem("Salir");

	public JMenuItem MenuCalabazin = new JMenu("Calabazin");
	public JMenuItem ItemMatar = new JMenuItem("Matarlo...");
	public JMenuItem ItemCambiarPosicion = new JMenuItem("Cambiar Posicion");

	public JMenuItem MenuAyuda = new JMenu("Ayuda");
	public JMenuItem ItemAyuda = new JMenuItem("Ayuda...");
	public JMenuItem ItemOpciones = new JMenuItem("Opciones");

	public JMenuItem MenuEditar = new JMenu("Editar");
	public JMenuItem ItemVerde = new JMenuItem("Verde...");
	public JMenuItem ItemRojo = new JMenuItem("Rojo");

	// Menus
 	final int W = 640;
	final int H = 480;

	
	public VistaVentana() {
		// Configuración de la ventana
		this.setTitle("Mi Ventana");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(W, H);
		
		this.getContentPane().setBackground(new Color(255, 192, 203));
		this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.setResizable(false);
        this.setAlwaysOnTop(true);
        this.setEnabled(true);
		this.setLayout(null);
		
		this.CalabazinContainer.setIcon(Calabazin); 
		this.CalabazinContainer.setBounds(300, 300, 64, 64);
		this.add(this.CalabazinContainer);

		botones();
		menus();
	}

	private void botones(){
		
		this.BtnVerde.setBounds(30, 30, 120, 30);
		this.BtnRojo.setBounds(W - 120 - 30, 30, 120, 30);
		this.BtnSalir.setBounds(W / 2 - 60, H / 2 - 30, 120, 30);
		this.BtnVer.setBounds(30, H - 60 - 30, 120, 30);
		this.BtnOcultar.setBounds(W - 120 - 30, H - 60 - 30, 120, 30);

		this.add(BtnVerde);
		this.add(BtnRojo);
		this.add(BtnSalir);
		this.add(BtnVer);
		this.add(BtnOcultar);
	}

	private void menus(){
		this.MenuArchivo.add(this.ItemGuardar);
		this.MenuArchivo.add(this.ItemSalir);

		this.MenuCalabazin.add(this.ItemMatar);
		this.MenuCalabazin.add(this.ItemCambiarPosicion);

		this.MenuAyuda.add(this.ItemAyuda);
		this.MenuAyuda.add(this.ItemOpciones);

		this.MenuEditar.add(this.ItemVerde);
		this.MenuEditar.add(this.ItemRojo);

		this.BarraDeMenu.add(this.MenuArchivo);
		this.BarraDeMenu.add(this.MenuCalabazin);
		this.BarraDeMenu.add(this.MenuAyuda);
		this.BarraDeMenu.add(this.MenuEditar);

		this.ItemSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));

		this.setJMenuBar(this.BarraDeMenu);
	}
}
