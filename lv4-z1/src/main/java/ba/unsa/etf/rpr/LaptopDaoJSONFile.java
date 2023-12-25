package ba.unsa.etf.rpr;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.json.JsonMapper;

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
        laptopi.add(laptop);
        JsonMapper mapper=new JsonMapper();
        String l=mapper.writeValueAsString(laptop);
        FileOutputStream tok=new FileOutputStream(file);
        tok.write(l.getBytes());
        tok.close();
    }

    @Override
    public Laptop getLaptop(String procesor) {
        for(Laptop l:laptopi){
            if(l.getProcesor().equals(procesor)) return l;
        }
        throw new NemaProcesoraException("Ne postoji laptop sa ovim procesorom!");
    }

    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {
        this.laptopi.addAll(laptopi);
    }

    @Override
    public ArrayList<Laptop> vratiPodatkeIzDatoteke() throws IOException, ClassNotFoundException {
        JsonMapper mapper=new JsonMapper();
        return mapper.readValue(file, new TypeReference<ArrayList<Laptop>>() {
        });
    }
}
