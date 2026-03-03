package poo;

public class Humano {

    public void calcular(Figura figura) {
        System.out.println("Estoy calculando:\t" + figura);
        System.out.println("Area: " + figura.getArea());
        System.out.println("Perimetro: " + figura.getPerimetro());
    }
}
