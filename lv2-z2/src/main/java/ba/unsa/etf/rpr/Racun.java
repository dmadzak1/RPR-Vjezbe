package ba.unsa.etf.rpr;

public class Racun {
    private Long brojRacuna;
    private Osoba korisnikRacuna;
    private boolean odobrenjePrekoracenja;
    private  Double stanjeRacuna;
    Racun(Long broj,Osoba korisnik){
        brojRacuna=broj;
        korisnikRacuna=korisnik;
        odobrenjePrekoracenja=false;
        stanjeRacuna=0.;
    }
    public boolean provjeriOdobrenjePrekoracenja(Double x){return true;}
    public boolean izvrsiUplatu(Double x){
        stanjeRacuna+=x;
        return true;
    }
    public boolean izvrsiIsplatu(Double x){
        if(odobrenjePrekoracenja==false) return false;
        stanjeRacuna-=x;
        return true;
    }
    public void odobriPrekoracenje(Double x){
        if(x<20000) odobrenjePrekoracenja=true;
        else odobrenjePrekoracenja=false;
    }
}
