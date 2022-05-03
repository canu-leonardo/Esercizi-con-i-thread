public class Consumatore extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    int dato;

    public Consumatore(Semaforo s1, Semaforo s2){
        this.pieno = s1;
        this.vuoto = s2;
    }

    public void run(){
        while(Produttore.NonHaFinito){
            pieno.P();
            dato = App.buffer.getValore();
            System.out.println("Lettore: dato letto: " + dato);
            vuoto.V();
        }
    }
}
