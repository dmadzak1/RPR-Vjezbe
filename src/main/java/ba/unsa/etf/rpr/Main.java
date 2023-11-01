package ba.unsa.etf.rpr;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ulaz=new Scanner(System.in);
        List<Double> lista=new ArrayList<>();
        while(true){
            System.out.println("Unesi broj ili stop: ");
            String s=ulaz.nextLine();
            if(s.equals("stop")) break;
            double broj=Double.parseDouble(s);
            lista.add(broj);
        }
        System.out.println("Max vrijednost: "+Funkcije.max(lista));
        System.out.println("Min vrijednost: "+Funkcije.min(lista));
        System.out.println("Mean vrijednost: "+Funkcije.mean(lista));
        System.out.println("Standardna devijacija: "+Funkcije.standardnaDevijacija(lista));
    }
}