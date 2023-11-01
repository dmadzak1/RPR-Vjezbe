package ba.unsa.etf.rpr;

public class Funkcije {
    public static int faktorijel(int x){
        int f=1;
        for(int i=1;i<=x;i++) f*=i;
        return f;
    }
    public static double sinus(double x){
       return Math.sin(x);
    }
}
