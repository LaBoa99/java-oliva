import poo.Animal;

public class App {


    private static void init(){
        System.out.println("Iniciando la aplicacion...");
        System.out.println("Instanciando 3 Animales...");

        // Animales
        Animal animal1 = new Animal("Firulais", 5, 20.5f, true, 'M');
        Animal animal2 = new Animal("Mishi", 3, 5.0f, false, 'F');
        Animal animal3 = new Animal(); // Valores por defecto

        Animal[] animales = {animal1, animal2, animal3};

        System.out.println("\n--- Informacion de los Animales ---\n");
        for(Animal animal : animales){
            animal.getInfo();
            System.out.println("IMC: " + animal.calcularIMC());
            System.out.println("--------------");
            animal.setPeso(30);
            System.out.println("IMC: " + animal.calcularIMC());
            System.out.println();
        }

    }

    public static void main(String[] args) throws Exception {
        App.init();
    }
}
