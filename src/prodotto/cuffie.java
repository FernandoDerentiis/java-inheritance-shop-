package prodotto;


public class cuffie extends prodotto {
    private String colore ;
    boolean wireless;


    // costruttore 

    public cuffie (int codice,String nome,String marca,double prezzo ,double iva, String colore,boolean wireless){
        super(codice,nome,marca,prezzo,iva);
        this.colore=colore ;
        this.wireless=wireless;
    }   
        public String getColore() {
            return colore;
        }
    
        public void setColore(String colore) {
            this.colore = colore;
        }
    
        public boolean isWireless() {
            return wireless;
        }
    
        public void setWireless(boolean wireless) {
            this.wireless = wireless;
        }
    }
    
}
