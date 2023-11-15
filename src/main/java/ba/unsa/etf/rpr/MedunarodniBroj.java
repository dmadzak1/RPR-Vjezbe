package ba.unsa.etf.rpr;

import java.util.Objects;

public class MedunarodniBroj extends TelefonskiBroj{
    private String drzava,broj;
    MedunarodniBroj(String drzava,String broj){
        this.drzava=drzava;
        this.broj=broj;
    }
    public String ispisi(){
        return drzava+"/"+broj;
    }
    public int hashCode(){
        return Objects.hash(drzava,broj);
    }
}
