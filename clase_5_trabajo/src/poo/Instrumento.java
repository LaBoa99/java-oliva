package poo;

public abstract class Instrumento {

    protected String Nombre;

    public Instrumento(){

    }

    public Instrumento(String nombre){
        this.Nombre = nombre;
    }

    
    protected String getNombre(){
        return this.Nombre;
    }
    
    protected abstract void tocar();
    protected abstract void afinar();
}
