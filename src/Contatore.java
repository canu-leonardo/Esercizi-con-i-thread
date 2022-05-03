public class Contatore {
    private int valore;
    private int passo;

    Contatore ( int valore, int passo ){
        this.valore = valore;
        this.passo = passo;
    }

    public void incrementa(){
        valore += passo;
    }

    public void decrementa(){
        valore -= passo;
    }

    public int getValore(){
        return valore;
    }
}
