package poo;

public class Calculadora {
    private boolean esEstandar = true;
    private String Color = "Gris";

    public Calculadora(){

    }

    public Calculadora(boolean esEstandar, String Color){
        this.Color = Color;
        this.esEstandar = esEstandar;
    }

    public boolean isEsEstandar() {
        return this.esEstandar;
    }
    
    public boolean getEsEstandar() {
        return this.esEstandar;
    }
    
    public void setEsEstandar(boolean esEstandar) {
        this.esEstandar = esEstandar;
    }
    
    public String getColor() {
        return this.Color;
    }
    
    public void setColor(String Color) {
        this.Color = Color;
    }
    
    // MÉTODOS SUMAR
    public int sumar(int a, int b) {
        return a + b;
    }
    
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
    
    public float sumar(float a, float b) {
        return a + b;
    }
    
    public float sumar(float a, float b, float c) {
        return a + b + c;
    }
    
    public double sumar(double a, double b) {
        return a + b;
    }
    
    public double sumar(double a, double b, double c) {
        return a + b + c;
    }
    
    // MÉTODOS RESTAR
    public int restar(int a, int b) {
        return a - b;
    }
    
    public int restar(int a, int b, int c) {
        return a - b - c;
    }
    
    public float restar(float a, float b) {
        return a - b;
    }
    
    public float restar(float a, float b, float c) {
        return a - b - c;
    }
    
    public double restar(double a, double b) {
        return a - b;
    }
    
    public double restar(double a, double b, double c) {
        return a - b - c;
    }
    
    // MÉTODOS MULTIPLICAR
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    public int multiplicar(int a, int b, int c) {
        return a * b * c;
    }
    
    public float multiplicar(float a, float b) {
        return a * b;
    }
    
    public float multiplicar(float a, float b, float c) {
        return a * b * c;
    }
    
    public double multiplicar(double a, double b) {
        return a * b;
    }
    
    public double multiplicar(double a, double b, double c) {
        return a * b * c;
    }
    
    // MÉTODOS DIVIDIR
    public int dividir(int a, int b) {
        if (b == 0) throw new ArithmeticException("No se puede dividir entre cero");
        return a / b;
    }
    
    public int dividir(int a, int b, int c) {
        if (b == 0 || c == 0) throw new ArithmeticException("No se puede dividir entre cero");
        return a / b / c;
    }
    
    public float dividir(float a, float b) {
        if (b == 0) throw new ArithmeticException("No se puede dividir entre cero");
        return a / b;
    }
    
    public float dividir(float a, float b, float c) {
        if (b == 0 || c == 0) throw new ArithmeticException("No se puede dividir entre cero");
        return a / b / c;
    }
    
    public double dividir(double a, double b) {
        if (b == 0) throw new ArithmeticException("No se puede dividir entre cero");
        return a / b;
    }
    
    public double dividir(double a, double b, double c) {
        if (b == 0 || c == 0) throw new ArithmeticException("No se puede dividir entre cero");
        return a / b / c;
    }
    

    @Override
    public String toString() {
        return "{" +
            " esEstandar='" + isEsEstandar() + "'" +
            ", Color='" + getColor() + "'" +
            "}";
    }

}

