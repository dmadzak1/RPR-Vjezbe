package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class ImenikTest {
    private static Imenik testniImenik=new Imenik();
    @BeforeAll
    public static void staviPodatke(){
        testniImenik.dodaj("Giorgio",new MobilniBroj(61,"628-659"));
        testniImenik.dodaj("Nermin",new FiksniBroj(Grad.MOSTAR,"958-840"));
        testniImenik.dodaj("Brandao",new MedunarodniBroj("+381","415-167"));
        testniImenik.dodaj("Denis",new FiksniBroj(Grad.MOSTAR,"512-168"));
    }

    @Test
    public void dajBrojValja(){
        String broj=testniImenik.dajBroj("Brandao");
        assertEquals(broj,"+381/415-167");
    }

    @Test
    public void dajBrojNeValja(){
        String broj=testniImenik.dajBroj("Bruno");
        assertNull(broj);
    }

    @Test
    public void dajImeValja(){
        String ime= testniImenik.dajIme(new FiksniBroj(Grad.MOSTAR,"958-840"));
        assertEquals(ime,"Nermin");
    }

    @Test
    public void dajImeNeValja(){
        String ime= testniImenik.dajIme(new FiksniBroj(Grad.MOSTAR,"958-850"));
        assertNull(ime);
    }
    @Test
    public void dodajFiksniException(){
        assertThrows(TelefonskiBrojIzuzetak.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                new FiksniBroj(null,"123-123");
            }
        });
        assertThrows(TelefonskiBrojIzuzetak.class,()->new FiksniBroj(null,"123,123"));
    }
}
