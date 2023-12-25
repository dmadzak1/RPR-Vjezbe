import ba.unsa.etf.rpr.Laptop;
import ba.unsa.etf.rpr.LaptopDaoSerializableFile;
import ba.unsa.etf.rpr.NemaProcesoraException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class LaptopTest {

    @Test
    void Test1(){
        LaptopDaoSerializableFile dao=new LaptopDaoSerializableFile();
        ArrayList<Laptop> laptopi=new ArrayList<>();
        laptopi.add(new Laptop("Lenovo","IP3",1300,16,0,512,"Intel","Nvidia",14));
        laptopi.add(new Laptop("Lemovo","IP3",1300,16,0,512,"Intel","Nvidia",14));
        laptopi.add(new Laptop("Lomio","IP3",1300,16,0,512,"Intel","Nvidia",14));
        dao.napuniListu(laptopi);
        Assertions.assertThrows(NemaProcesoraException.class,()->{
            Laptop l=dao.getLaptop("AMD");
        });
    }
}
