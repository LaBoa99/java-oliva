package poo;

public class Ave extends Animal {
    private String Tamano;
    private String Genero;

    public Ave(){

    }


    public Ave(String Tamano, String Genero) {
        this.Tamano = Tamano;
        this.Genero = Genero;
    }


    @Override
    public void ladrar(){
        System.out.println("Pio pio");
    }
}
