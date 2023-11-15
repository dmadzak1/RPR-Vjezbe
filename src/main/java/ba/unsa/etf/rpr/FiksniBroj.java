package ba.unsa.etf.rpr;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj{
    private Grad grad;
    private String broj;
    FiksniBroj(Grad grad,String broj){
        if(grad==null) throw new TelefonskiBrojIzuzetak("Neispravan pozivni broj");
        this.grad=grad;
        this.broj=broj;
    }
    public String ispisi(){
        return "0"+grad.getBroj()+"/"+broj;
    }
    public int hashCode(){
        return Objects.hash(grad,broj);
    }
    public Grad getGrad(){return grad;}
}
