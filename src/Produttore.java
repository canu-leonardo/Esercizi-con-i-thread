public class Produttore extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    int tanti = 5;
    final int attesa = 500;
    boolean daRaddoppiare;

    static boolean NonHaFinito;

    public Produttore (Semaforo s1, Semaforo s2, boolean raddoppiare){
        this.pieno = s1;
        this.vuoto = s2;
        this.daRaddoppiare = raddoppiare;
        
        this.NonHaFinito = true;
    }

    public void run(){
        for (int k = 0; k < tanti; k++){
            vuoto.P();

            if (daRaddoppiare){
                App.buffer.raddoppia();
            }else{
                App.buffer.incrementa();
            }
            
            System.out.println("Scrittore: dato scritto: " + App.buffer.getValore());
            pieno.V();
            try { Thread.sleep(attesa); }
            catch(Exception e) { }
        }
        NonHaFinito = false;
        System.out.println("Scrittore: termina scrittura dati.");
    }
}
