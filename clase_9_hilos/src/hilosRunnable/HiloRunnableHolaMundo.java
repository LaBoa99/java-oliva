package hilosRunnable;

public class HiloRunnableHolaMundo implements Runnable {

    @Override
    public void run() {
        System.out.println("Hola mundo desde Runnable!!!!!! " + Thread.currentThread().getName());
    }

}
