package poo;

import javax.swing.JLabel;

public class ContadorLabel extends Thread {
    private JLabel labelContador;

    public ContadorLabel(JLabel labelContador) {
        this.labelContador = labelContador;
    }

    @Override
    public void run() {
        int contador = 0;
        while (contador < 10) {
            try {
                System.out.println("Contador: " + contador);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            contador++;
            actualizarContador(contador);
        }
    }

    public void actualizarContador(int valor) {
        labelContador.setText("Contador: " + valor);
    }
}
