package principal;

public class HiloContador implements Runnable {
    private String NombreHilo;
    private Thread T;
    private boolean suspendido = false;

    public HiloContador(String NombreHilo) {
        this.NombreHilo = NombreHilo;
    }

    @Override
    public void run() {
        System.out.println("\nESTADO RUNNING: hilo " + NombreHilo);
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println("Hilo: " + NombreHilo + " " + i);
                Thread.sleep(600);

                // Sincronización para manejar la suspensión
                synchronized(this) {
                    while (suspendido) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Hilo " + NombreHilo + " interrumpido");
        }
        System.out.println("\nESTADO TERMINADO: Hilo " + NombreHilo + " Terminado...");
    }

    // Método para iniciar el hilo
    public void iniciar() {
        System.out.println("\nESTADO NUEVO: Creando el hilo " + NombreHilo);
        if (T == null) {
            T = new Thread(this, NombreHilo);
            T.start();
        }
    }

    // Método para cambiar la bandera a suspendido
    public void suspender() {
        System.out.println("\nESTADO SUSPENDIDO: " + NombreHilo);
        suspendido = true;
    }

    // Método sincronizado para reanudar el hilo
    synchronized public void resumir() {
        System.out.println("\nESTADO RESUMIENDO: " + NombreHilo);
        suspendido = false;
        notify();
    }
}