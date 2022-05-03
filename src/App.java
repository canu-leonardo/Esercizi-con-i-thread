public class App {
    public static int buffer;
    public static void main(String[] args) throws Exception {
        Semaforo pieno = new Semaforo(0);
        Semaforo vuoto = new Semaforo(1);

        ProduciDato prod = new ProduciDato(pieno, vuoto);
        Consumadato cons = new Consumadato(pieno, vuoto);

        prod.start();
        cons.start();

        System.out.println("Main: termina avvio thread");
    }
}
