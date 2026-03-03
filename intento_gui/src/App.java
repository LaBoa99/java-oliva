import controlador.ControladorVistaVentana;
import vista.VistaVentana;

public class App {
    public static void main(String[] args) throws Exception {
        ControladorVistaVentana CV = new ControladorVistaVentana(
            new VistaVentana()
        );
    }
}
