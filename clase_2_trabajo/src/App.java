import poo.Automovil;

public class App {
    public static void main(String[] args) throws Exception {
        // ( ¬_¬) 
        Automovil Carro1 = new Automovil("Jetta", "Gris", 12f, 2009);
        Automovil Carro2 = new Automovil("Mustang", "Rojo", 85000f, 2020);
        Automovil Carro3 = new Automovil("Camaro", "Amarillo", 90000f, 2021) ;
        
        System.out.println("Preparados...");
        System.out.println(Carro1);
        System.out.println(Carro2);
        System.out.println(Carro3);

        System.out.println("En sus marcas...");
        Carro1.encender();
        Carro2.encender();
        Carro3.encender();

        System.out.println("Listos...");
        System.out.println("Fueraaa!!!!!!!!!!!!!!!!!!!!");
        Carro1.acelerar();
        Carro2.acelerar();
        Carro3.acelerar();


    } 
}