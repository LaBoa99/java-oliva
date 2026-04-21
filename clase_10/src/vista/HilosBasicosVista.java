package vista;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class HilosBasicosVista extends JFrame {

    public ContadorVista contadorVista;
    public ContadorVista contadorVista2;
    public ContadorVista contadorVista3;
    
    public HilosBasicosVista(){
        setTitle("Hilos Básicos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        // una columna
        this.setLayout(new GridLayout(1, 0));

        // agregar contadores a la vista
        contadorVista = new ContadorVista();
        contadorVista2 = new ContadorVista();
        contadorVista3 = new ContadorVista();


        add(contadorVista);
        add(contadorVista2);
        add(contadorVista3);

    }


}



