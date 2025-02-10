package prodotto;


public class televisore extends prodotto {
    private double dimensioni;
    private boolean smart ;

    // costruttore

    public televisore(int codice, String nome, String marca, double prezzo, double iva, double dimensioni, boolean smart) {
        super(codice, nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;

    }

    public double getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(double dimensioni) {
        this.dimensioni = dimensioni;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    
}
