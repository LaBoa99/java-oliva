package controlador;

import vista.VistaVentana;

public class ControladorVistaVentana {
    VistaVentana VistaVentana;

    public ControladorVistaVentana(){

    }


    public ControladorVistaVentana(VistaVentana VistaVentana) {
        this.VistaVentana = VistaVentana;
        this.VistaVentana.setVisible(true);
    }

}
