import hilosExtends.HiloHolaMundo;

public class App {
    public static void main(String[] args) throws Exception {
        HiloHolaMundo Hilo1 = new HiloHolaMundo();
        HiloHolaMundo Hilo2 = new HiloHolaMundo();
        HiloHolaMundo Hilo3 = new HiloHolaMundo();
        HiloHolaMundo Hilo4 = new HiloHolaMundo();

        Hilo1.start();
        // Hilo1.join();
        
        Hilo2.start();
        // Hilo2.join();
        
        Hilo3.start();
        // Hilo3.join();
        
        Hilo4.start();
        // Hilo4.join();
        while(
            Hilo1.isAlive() ||
            Hilo2.isAlive() || 
            Hilo3.isAlive() ||
            Hilo4.isAlive() 
        ) {
    
        }
        
        System.out.println("Adios!");

        // Contadores 
        
    }
}
