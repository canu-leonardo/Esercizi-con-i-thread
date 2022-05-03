public class App {
    public static Contatore buffer = new Contatore(0, 1);
    public static void main(String[] args) throws Exception {
        Semaforo pieno = new Semaforo(0);
        Semaforo vuoto = new Semaforo(1);

        Produttore prod_normale = new Produttore(pieno, vuoto, false);
        Consumatore cons1 = new Consumatore(pieno, vuoto);

        Produttore prod_che_raddoppia = new Produttore(pieno, vuoto, true);
        Consumatore cons2 = new Consumatore(pieno, vuoto);

        prod_normale.start();
        cons1.start();
        prod_che_raddoppia.start();
        cons2.start();

        System.out.println("Main: termina avvio thread");
    }
}
