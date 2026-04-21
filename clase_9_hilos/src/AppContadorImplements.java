import contadorRunnable.Contador;

public class AppContadorImplements {

    public static void main(String[] args) throws Exception {
        Thread contador1 = new Thread(new Contador());
        Thread contador2 = new Thread(new Contador());
        Thread contador3 = new Thread(new Contador());
        Thread contador4 = new Thread(new Contador());

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
