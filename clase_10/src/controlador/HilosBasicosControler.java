package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.HilosBasicosVista;

public class HilosBasicosControler implements ActionListener {

    HilosBasicosVista vista;

    public HilosBasicosControler() {
        vista = new HilosBasicosVista();
        vista.setVisible(true);
        this.listeners();
    }

    public void listeners(){
        vista.contadorVista.botonIniciar.addActionListener(this);
        vista.contadorVista2.botonIniciar.addActionListener(this);
        vista.contadorVista3.botonIniciar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.contadorVista.botonIniciar){
            vista.contadorVista.iniciarContador();
        } else if(e.getSource() == vista.contadorVista2.botonIniciar){
            vista.contadorVista2.iniciarContador();
        } else if(e.getSource() == vista.contadorVista3.botonIniciar){
            vista.contadorVista3.iniciarContador();
        }
    }
    
}
