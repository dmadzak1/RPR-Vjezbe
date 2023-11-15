package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class ImenikMockTest {
    private static Imenik testniImenik=new Imenik();
    @BeforeAll
    public static void staviPodatke(){
        testniImenik.dodaj("Giorgio",new MobilniBroj(61,"628-659"));
        testniImenik.dodaj("Nermin",new FiksniBroj(Grad.MOSTAR,"958-840"));
        testniImenik.dodaj("Brandao",new MedunarodniBroj("+381","415-167"));
        testniImenik.dodaj("Denis",new FiksniBroj(Grad.MOSTAR,"512-168"));
    }
    @Test
    public void mockingTestPrvi(){
        Imenik p=Mockito.mock(Imenik.class);
        Mockito.when(p.dajBroj("Brandao")).thenReturn("Nema");
        String test=p.dajBroj("Brandao");
        assertEquals(test,"Nema");
    }
    @Test
    public void mockingTestDrugi(){
        Map<String,TelefonskiBroj> mapa=Mockito.mock(Map.class);
        Mockito.when(mapa.get("Brandao")).thenReturn(new MedunarodniBroj("+381","415-167"));
        String test=testniImenik.dajBroj("Brandao");
        assertNotEquals(test,"+387/415-167");
        assertEquals(test,"+381/415-167");
    }
}
