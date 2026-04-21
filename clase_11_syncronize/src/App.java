public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        System.out.println("Contador con sincronización:");
        contadores.ContadorSyncronize.start();
        System.out.println(contadores.ContadorSyncronize.contador);

        System.out.println("Contador sin sincronización:");
        contadores.ContadorSinSynchronize.start();
        System.out.println(contadores.ContadorSinSynchronize.contador);
    }
}
