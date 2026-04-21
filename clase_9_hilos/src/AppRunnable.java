import hilosRunnable.HiloRunnableHolaMundo;

public class AppRunnable {
    public static void main(String[] args) throws Exception {
        HiloRunnableHolaMundo HiloRunnable = new HiloRunnableHolaMundo();
        
        Thread Hilo1 = new Thread(HiloRunnable);
        Thread Hilo2 = new Thread(HiloRunnable);
        Thread Hilo3 = new Thread(HiloRunnable);
        Thread Hilo4 = new Thread(HiloRunnable);

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
    }
}
