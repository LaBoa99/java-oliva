package poo;

public class Piano extends Instrumento {

    public Piano(
        String nombre
    ) {
        super.Nombre = nombre;
    }

    @Override
    public void tocar() {
        System.out.println(super.Nombre + ": Tun tun tun tun");
    }

    @Override
    public void afinar() {
        System.out.println(super.Nombre + ": Do do do do");
    }


}
