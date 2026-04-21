import contadorExtends.Contador;

public class AppContadorExtends {

    public static void main(String[] args) throws Exception {
        Contador contador1 = new Contador();
        Contador contador2 = new Contador();
        Contador contador3 = new Contador();
        Contador contador4 = new Contador();

        contador1.start();
        contador2.start();
        contador3.start();
        contador4.start();

        while(
            contador1.isAlive() ||
            contador2.isAlive() || 
            contador3.isAlive() ||
            contador4.isAlive() 
        ) {
    
        }

        
        System.out.println("Adios!");
    }
}
