package ba.unsa.etf.rpr;

import java.util.Scanner;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Funkcije {
    public static double min(List<Double> lista){
        double min=lista.get(0);
        for(double broj:lista){
            if(broj<min) min=broj;
        }
        return min;
    }
    public static double max(List<Double> lista){
        double max=lista.get(0);
        for(double broj:lista){
            if(broj>max) max=broj;
        }
        return max;
    }
    public static double mean(List<Double> lista){
        double suma=0;
        for(double broj: lista) suma+=broj;
        return suma/lista.size();
    }
    public static double standardnaDevijacija(List<Double> lista){
        double mean=mean(lista);
        double sumaKvadrata=0;
        for(double broj:lista) sumaKvadrata+=Math.pow(broj-mean,2);
        return Math.sqrt(sumaKvadrata/lista.size());
    }
}
