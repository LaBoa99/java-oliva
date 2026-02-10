package poo;

public class Animal {
    protected String Nombre;
    protected String Raza;
    protected String Color;

    public Animal(){
        
    }

    public Animal(
        String nombre,
        String raza,
        String color
    ){
        this.Nombre = nombre;
        this.Raza = raza;
        this.Color = color;
    }

    public void ladrar(){
        System.out.println("bark!");
    }
}
