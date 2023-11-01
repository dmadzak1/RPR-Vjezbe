package ba.unsa.etf.rpr;

public class Osoba {
    protected String ime,prezime;
    Osoba(String i,String p){ime=i; prezime=p;}
    public String toString(){return ime+' '+prezime;}
}
