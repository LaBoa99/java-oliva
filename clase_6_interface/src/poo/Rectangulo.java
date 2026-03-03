package poo;

public class Rectangulo implements Figura {

    private double base, altura;


    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double getArea() {
        return this.base * this.altura;
    }

    @Override
    public double getPerimetro() {
        return (this.base * 2 ) + (this.altura * 2);
    }

}
