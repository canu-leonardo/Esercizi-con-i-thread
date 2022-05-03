public class ProduciDato extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    int tanti = 5;
    final int attesa = 500;

    public ProduciDato (Semaforo s1, Semaforo s2){
        this.pieno = s1;
        this.vuoto = s2;
    }

    public void run(){
        for (int k = 0; k < tanti; k++){
            vuoto.P();
            App.buffer = k;
            System.out.println("Scrittore: dato scritto: " + k);
            pieno.V();
            try { Thread.sleep(attesa); }
            catch(Exception e) { }
        }
        System.out.println("Scrittore: termina scrittura dati.");
    }
}