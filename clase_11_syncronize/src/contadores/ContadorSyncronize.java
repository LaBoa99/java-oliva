package contadores;

public class ContadorSyncronize {
    
    public static int contador = 0;

    public static synchronized void incrementar() {
        contador++;
    }

    public static void start(){
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                incrementar();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                incrementar();
            }
        });

        t1.start();
        t2.start();

        while(
            t1.isAlive() || t2.isAlive()
        ) {
            
        }
    }


}
