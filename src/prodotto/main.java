package prodotto;

public class main {


    public static void main(String[] args) throws Exception {

        // creo prodotto
        Prodotto prodotto = new Prodotto(1, "Prodotto Generico", "Marca Generica", 100.0, 22.0);
        System.out.println("Codice: " + prodotto.getCodice());
        System.out.println("Prezzo finale: " + prodotto.calcolaPrezzoFinale());

        // Creo smartphone
        Smartphone smartphone = new Smartphone(2, " X", "iphone", 500.0, 22.0, "IMEI12345", 128);
        System.out.println("Smartphone - Nome: " + smartphone.getNome() + ", Memoria: " + smartphone.getMemoria() + "GB");

        Televisore televisore = new Televisore(3, "TV Ultra HD", "Marca Z", 800.0, 22.0, 55.0, true);
        System.out.println("Televisore - Dimensioni: " + televisore.getDimensioni() + " pollici, Smart: " + televisore.isSmart());

        // creo cuffie

        Cuffie cuffie = new Cuffie(4, "Cuffie Wireless", "Marca W", 120.0, 22.0, "Nero", true);
        System.out.println("Cuffie - Colore: " + cuffie.getColore() + ", Wireless: " + cuffie.isWireless());



}

}