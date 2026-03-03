import poo.Humano;
import poo.SerVivo;

public class App {
    public static void main(String[] args) throws Exception {
        SerVivo Juana = new Humano();
        Juana.accionSerVivo();

        Humano MismaJuana = (Humano) Juana;
        MismaJuana.accionHumano();
        MismaJuana.accionSerVivo();
    }
}
