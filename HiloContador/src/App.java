import principal.HiloContador;

public class App {
    public static void main(String[] args) {
        // Creación de instancias
        HiloContador T1 = new HiloContador("Hilo-1");
        T1.iniciar();
        
        HiloContador T2 = new HiloContador("Hilo-2");
        T2.iniciar();

        try {
            // Control de tiempos y estados
            Thread.sleep(1000);
            T1.suspender();
            
            Thread.sleep(2000);
            T1.resumir();
            
            Thread.sleep(1000);
            T2.suspender();
            
            Thread.sleep(2000);
            T2.resumir();
            
        } catch (InterruptedException e) {
            System.out.println("Hilo main principal Interrumpido");
        }
        
        System.out.println("Terminando el Hilo del Main principal");
    }
}