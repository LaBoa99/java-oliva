package hilosExtends;

public class HiloHolaMundo extends Thread {

    @Override
    public void run() {
        System.out.println("Hola mundo!" + this.getName());
    }
}
