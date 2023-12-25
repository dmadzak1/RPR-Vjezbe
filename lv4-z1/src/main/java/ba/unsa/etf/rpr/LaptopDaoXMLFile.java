package ba.unsa.etf.rpr;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class LaptopDaoXMLFile implements LaptopDao{
    private File file;
    ArrayList<Laptop> laptopi;

    public LaptopDaoXMLFile(){
        file=new File("src/main/resources/laptopi.xml");
        laptopi=new ArrayList<Laptop>();
    }

    @Override
    public void dodajLaptopUListu(Laptop laptop) {
        laptopi.add(laptop);
    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) throws IOException {
        laptopi.add(laptop);
        XmlMapper mapper=new XmlMapper();
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
        XmlMapper mapper=new XmlMapper();
        return mapper.readValue(file, new TypeReference<ArrayList<Laptop>>() {
        });
    }
}
