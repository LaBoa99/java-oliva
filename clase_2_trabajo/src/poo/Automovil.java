package poo;

public class Automovil {

    // atributos
    private String Marca = "Corolla";
    private String Color;
    private float precio;
    private int modelo;

    public Automovil() {
    }

    public Automovil(
        String Marca,
        String Color,
        float precio,
        int modelo
    ) {
        this.Marca = Marca;
        this.Color = Color;
        this.modelo = modelo;
        setPrecio(precio);
    }

    // metodos
    public void encender() {
        System.out.println(genLog(Marca) + "Pippp pip pip!");
    }

    public void apagar() {
        System.out.println(genLog(Marca) + "Clac clac clac!");
    }

    public void acelerar() {
        System.out.println(genLog(Marca) + "Brum brum brum!");
    }

    public void frenar() {
        System.out.println(genLog(Marca) + "Chrrrrrrrrrrrrrrrrr!");
    }

    private String genLog(String str) {
        return "[" + str + "]: ";
    }

    // Getters
    public String getMarca() {
        return Marca;
    }

    public String getColor() {
        return Color;
    }

    public float getPrecio() {
        return precio;
    }
    public int getModelo() {
        return modelo;
    }

    // Setters
    public void setMarca(String marca) {
        Marca = marca;
    }
    public void setColor(String color) {
        Color = color;
    }

    public void setPrecio(float precio) {
        if(precio < 1000) {
            System.out.println("El precio no puede ser menor a 1000");
            this.precio = 200000f;
            return;
        }
        this.precio = precio;
    }
    
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }


    @Override
    public String toString() {
        return "Automovil [Marca=" + Marca + ", Color=" + Color + ", precio=" + precio + ", modelo=" + modelo + "]";
    }
}
