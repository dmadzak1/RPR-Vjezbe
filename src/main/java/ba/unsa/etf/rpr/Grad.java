package ba.unsa.etf.rpr;

public enum Grad {
    BIHAC("037"),ORASJE("031"),TUZLA("035"),ZENICA("032"),GORAZDE("038"),TRAVNIK("030"),
    MOSTAR("036"),LJUBUSKI("039"),SARAJEVO("033"),LIVNO("034");

    private String broj;

    Grad(String broj) {
        this.broj=broj;
    }
    public static Grad izBroja(String broj){
        for(Grad g:Grad.values()){
            if(g.getBroj().equals(broj)) return g;
        }
        return null;
    }
    public String getBroj(){return broj;}
}
