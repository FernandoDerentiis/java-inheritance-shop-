public class prodotto {
    private int codice;
    private string nome ;
    private string marca;
    private double prezzo;
    private double iva;

    // costruttore
    public prodotto (int codice, string,nome ,string marca,double prezzo,double iva){


        this.codice=codice;
        this.nome=nome;
        this.marca=marca;
        this.prezzo=prezzo;
        this.iva=iva;
        

    }

    //metodi

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public String toString() {
        return "Prodotto [codice=" + codice + ", nome=" + nome + ", marca=" + marca + ", prezzo=" + prezzo + ", iva=" + iva + "]";
    }

}
