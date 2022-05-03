public class Consumadato extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    int dato;

    public Consumadato(Semaforo s1, Semaforo s2){
        this.pieno = s1;
        this.vuoto = s2;
    }

    public void run(){
        while(ProduciDato.NonHaFinito){
            pieno.P();
            dato = App.buffer;
            System.out.println("Lettore: dato letto: " + dato);
            vuoto.V();
        }
    }
}
