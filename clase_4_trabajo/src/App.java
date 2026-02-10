import poo.Animal;
import poo.Ave;
import poo.Canino;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Zoologico!");

        Canino Perro = new Canino();
        Ave Cotorro = new Ave();

        Animal[] animals = { Perro, Cotorro };

        for(Animal animal : animals){
            animal.ladrar();
        }
    }
}
