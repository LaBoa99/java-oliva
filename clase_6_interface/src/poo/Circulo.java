package poo;

public class Circulo extends Constantes implements Figura {

    private double radio;


    public Circulo(double radio) {
        this.radio = radio;
    }
    

    @Override
    public double getArea() {
        return PI * (this.radio * this.radio);
    }

    @Override
    public double getPerimetro() {
        return 2 * PI * this.radio;
    }

    

}
