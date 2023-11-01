package ba.unsa.etf.rpr;

public abstract class Osoba {
    String ime;
    String prezime;
    Osoba(String i,String p){ime=i; prezime=p;}

    public abstract String toString();
}
