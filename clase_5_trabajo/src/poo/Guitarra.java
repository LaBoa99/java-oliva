package poo;

public class Guitarra extends Instrumento {

    public Guitarra(
        String nombre
    ) {
        super.Nombre = nombre;
    }

    @Override
    public void tocar() {
        System.out.println(super.Nombre + ": Taran Taran");
    }

    @Override
    public void afinar() {
        System.out.println(super.Nombre + ": Girg Girg .... Girg");
    }

}
