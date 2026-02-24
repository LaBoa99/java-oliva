import poo.Guitarra;
import poo.Instrumento;
import poo.Piano;

public class App {
    public static void main(String[] args) throws Exception {

        Guitarra Guitarra = new Guitarra("Guitarra");
        Piano Piano = new Piano("Piano");

        Instrumento[] Instrumentos = { Guitarra, Piano };

        for(Instrumento instrumento : Instrumentos){
            // Aqui no es posible  llamar tocar o afinar por el upcasting 
        }

        Guitarra.afinar();
        Guitarra.tocar();

        Piano.afinar();
        Piano.tocar();
    }
}
