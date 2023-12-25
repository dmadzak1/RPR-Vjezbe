package ba.unsa.etf.rpr;

import java.io.*;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class LaptopDaoJSONFile implements LaptopDao{
    private File file;
    private ArrayList<Laptop> laptopi;

    public LaptopDaoJSONFile(){
        laptopi=new ArrayList<Laptop>();
        file=new File("src/main/resources/laptopi.json");
    }

    @Override
    public void dodajLaptopUListu(Laptop laptop) {
        laptopi.add(laptop);
    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) throws IOException {

    }

    @Override
    public Laptop getLaptop(String procesor) {
        return null;
    }

    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {

    }

    @Override
    public ArrayList<Laptop> vratiPodatkeIzDatoteke() throws IOException, ClassNotFoundException {
        return null;
    }
}
