package ba.unsa.etf.rpr;

public class Korisnik extends Osoba{
    private Racun racunKorisnika;
    Korisnik(String i,String p){super(i,p);}
    public void dodajRacun(Racun r){racunKorisnika=r;}
}
