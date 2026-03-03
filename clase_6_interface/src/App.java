import poo.Circulo;
import poo.Cuadrado;
import poo.Figura;
import poo.Humano;
import poo.Rectangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Cuadrado cuadrado = new Cuadrado(5);
        Rectangulo rectangulo = new Rectangulo(5, 15);
        Circulo circulo = new Circulo(5);
        Humano mary = new Humano();

        Figura[] figuras = {cuadrado, rectangulo, circulo};
        for(Figura figura : figuras){
            mary.calcular(figura);
        }
    }
}
