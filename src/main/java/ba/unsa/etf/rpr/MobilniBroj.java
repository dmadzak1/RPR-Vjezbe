package ba.unsa.etf.rpr;

import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj{
    private int mobilnaMreza;
    private String broj;
    MobilniBroj(int mobilnaMreza,String broj){
        this.mobilnaMreza=mobilnaMreza;
        this.broj=broj;
    }
    public String ispisi(){
        return "0"+mobilnaMreza+"/"+broj;
    }
    public int hashCode(){
        return Objects.hash(mobilnaMreza,broj);
    }
}
