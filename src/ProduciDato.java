public class ProduciDato extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    int tanti = 5;
    final int attesa = 500;

    static boolean NonHaFinito;

    public ProduciDato (Semaforo s1, Semaforo s2){
        this.pieno = s1;
        this.vuoto = s2;
        
        this.NonHaFinito = true;
    }

    public void run(){
        for (int k = 0; k < tanti; k++){
            vuoto.P();
            App.buffer.incrementa();
            System.out.println("Scrittore: dato scritto: " + App.buffer.getValore());
            pieno.V();
            try { Thread.sleep(attesa); }
            catch(Exception e) { }
        }
        NonHaFinito = false;
        System.out.println("Scrittore: termina scrittura dati.");
    }
}
