package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import poo.ContadorLabel;


public class ContadorVista extends JPanel {
    public JLabel labelContador;
    public JButton botonIniciar;
    private ContadorLabel hiloContador;

    public ContadorVista() {
        labelContador = new JLabel("Contador: 0");
        botonIniciar = new JButton("Iniciar Contador");
        // centrar en vertical y horizontal respecto al padre
        setLayout(getLayout());
        add(labelContador);
        add(botonIniciar);

        this.hiloContador = new ContadorLabel(labelContador);
    }

    public void actualizarContador(int valor) {
        labelContador.setText("Contador: " + valor);
    }

    public void iniciarContador() {
        // iniciar hilo para contador
        

        if(hiloContador.isAlive()){
            System.out.println("El contador ya está en ejecución.");
        } else {
            this.actualizarContador(0);
            hiloContador = new ContadorLabel(labelContador);
            hiloContador.start();
        }
    }


}
