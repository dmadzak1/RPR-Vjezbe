package ba.unsa.etf.rpr;

import java.io.*;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class LaptopDaoSerializableFile implements LaptopDao{
    private File file;
    private ArrayList<Laptop> laptopi;

    public LaptopDaoSerializableFile(){
        file=new File("src/main/resources/laptopi.txt");
        laptopi=new ArrayList<Laptop>();
    }

    @Override
    public void dodajLaptopUListu(Laptop laptop){
        laptopi.add(laptop);
    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) throws IOException{
        FileOutputStream tok=new FileOutputStream(file);
        ObjectOutputStream objekatTok=new ObjectOutputStream(tok);
        laptopi.add(laptop);
        objekatTok.writeObject(laptopi);
        objekatTok.close();
        tok.close();
    }

    @Override
    public Laptop getLaptop(String procesor) throws NemaProcesoraException {
        for(Laptop el : laptopi){
            if(el.getProcesor().equals(procesor)) return el;
        }
        throw new NemaProcesoraException("Ne postoji laptop sa ovim procesorom!");
    }

    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {
        this.laptopi.addAll(laptopi);
    }

    @Override
    public ArrayList<Laptop> vratiPodatkeIzDatoteke() throws IOException, ClassNotFoundException {
        FileInputStream tok=new FileInputStream(file);
        ObjectInputStream objekatTok= new ObjectInputStream(tok);
        return (ArrayList<Laptop>) objekatTok.readObject();
    }


}
