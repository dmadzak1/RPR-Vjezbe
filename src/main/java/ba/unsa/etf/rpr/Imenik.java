package ba.unsa.etf.rpr;

import java.util.*;

public class Imenik {
    private HashMap<String,TelefonskiBroj> brojevi;
    Imenik(){brojevi=new HashMap<String,TelefonskiBroj>();}
    public void dodaj(String ime,TelefonskiBroj broj){brojevi.put(ime,broj);}
    public String dajBroj(String ime){
        TelefonskiBroj broj=brojevi.get(ime);
        if(broj==null) return null;
        return broj.ispisi();
    }
    public String dajIme(TelefonskiBroj broj){
        for(Map.Entry<String,TelefonskiBroj> m:brojevi.entrySet()){
            if(m.getValue().ispisi().equals(broj.ispisi())) return m.getKey();
        }
        return null;
    }
    public String naSlovo(char s){
        StringBuilder izlaz=new StringBuilder();
        int br=1;
        for(Map.Entry<String,TelefonskiBroj> m:brojevi.entrySet()){
            if(m.getKey().startsWith(String.valueOf(s))){
                izlaz.append(br).append(". ").append(m.getKey()).append(" - ").append(m.getValue().ispisi()).append("\n");
            }
            br++;
        }
        return izlaz.toString();
    }
    public Set<String> izGrada(Grad g){
        Set<String> izlaz=new TreeSet<>();
        for(Map.Entry<String,TelefonskiBroj>m:brojevi.entrySet()){
            if(m.getValue() instanceof FiksniBroj && g.equals(((FiksniBroj) m.getValue()).getGrad())){
                izlaz.add(m.getKey());
            }
        }
        return izlaz;
    }
    public Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        Set<TelefonskiBroj> izlaz=new TreeSet<>(new Comparator<TelefonskiBroj>() {
            @Override
            public int compare(TelefonskiBroj o1, TelefonskiBroj o2) {
                return o1.ispisi().compareTo(o2.ispisi());
            }
        });
        for(Map.Entry<String,TelefonskiBroj> m:brojevi.entrySet()){
            if(m.getValue() instanceof FiksniBroj && g.equals(((FiksniBroj) m.getValue()).getGrad())){
                izlaz.add(m.getValue());
            }
        }
        return izlaz;
    }

}
