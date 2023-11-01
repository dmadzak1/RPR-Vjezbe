package ba.unsa.etf.rpr;

import java.util.*;
import java.util.random.RandomGenerator;

public class Banka {
    private Long brojRacuna;
    private List<Korisnik> korisnici;
    private List<Uposlenik> uposlenici;
    Banka(){
        brojRacuna = 0L;
        korisnici = new ArrayList<>();
        uposlenici=new ArrayList<>(git );
    }
    public Korisnik kreirajNovogKorisnika(String i,String p){
        Korisnik k=new Korisnik(i,p);
        korisnici.add(k);
        return k;
    }
    public Uposlenik kreirajNovogUposlenika(String i,String p){
        Uposlenik u=new Uposlenik(i,p);
        uposlenici.add(u);
        return u;
    }
    public Racun kreirajRacunZaKorisnika(Korisnik k){
        Racun r=new Racun(1254522L,k);
        return r;
    }
}
