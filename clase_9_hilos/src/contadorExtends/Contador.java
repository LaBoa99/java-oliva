package contadorExtends;

public class Contador extends Thread {
    
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println("Contador: " + i + " - " + this.getName());
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
