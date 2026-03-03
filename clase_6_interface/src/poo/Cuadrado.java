package poo;

public class Cuadrado implements Figura {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }    


    @Override
    public double getArea() {
        return this.lado * this.lado;
    }

    @Override
    public double getPerimetro() {
        return this.lado * 4;
    }

}
