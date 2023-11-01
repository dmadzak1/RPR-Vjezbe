package ba.unsa.etf.rpr;

public class Main {
    public static void main(String[] args) {
        int f=Funkcije.faktorijel(Integer.valueOf(args[0]));
        double s=Funkcije.sinus(Double.valueOf(args[1]));
        System.out.println("Faktorijel: "+f+" Sinus: "+s);
    }
}