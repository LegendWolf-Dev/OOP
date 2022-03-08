package Week2.Opdracht4B.AutoHuurTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Week2.Opdracht4B.*;
//Maak een lijst met logische testgevallen voor het testen van de AutoHuur klasse. Je hebt natuurlijk een paar gevallen die voor de hand liggen: er is een Huurder (met en zonder korting) en een gehuurdeAuto en klopt dan de totaalPrijs() en de toString() output?
//
//Maar denk ook aan de gevallen dat er nog geen huurder en/of gehuurdeAuto is. Dat zijn 3  opties:
//
//geen huurder, geen auto
//geen huurder, wel auto
//wel huurder, geen auto
public class AutohuurTest {
    @Test
    void geenHuurderGeenAuto(){
        AutoHuur Test1 = new AutoHuur();
        assertEquals(
                "  er is geen auto bekend\n" +
                "  er is geen huurder bekend\n" +
                "  aantal dagen: 0 en dat kost 0.0", Test1.toString());
    }
    @Test
    void geenHuurderMetAuto(){
        AutoHuur Test2 = new AutoHuur();
        Auto a1 = new Auto("Peugeot 207", 50);
        Test2.setGehuurdeAuto(a1);
        assertEquals(
                "  autotype: Peugeot 207 met prijs per dag: 50.0\n"+
                "  er is geen huurder bekend\n" +
                "  aantal dagen: 0 en dat kost 0.0",Test2.toString());
    }
    @Test
    void HuurderGeenAuto(){
        AutoHuur Test3 = new AutoHuur();
        Klant k1 = new Klant("Henk van Gracht");
        Test3.setAantalDagen(5);
        Test3.setHuurder(k1);
        assertEquals(
                "  er is geen auto bekend\n" +
                "  op naam van: Henk van Gracht (korting:0.0%)\n" +
                "  aantal dagen: 5 en dat kost 0.0",Test3.toString());

    }
    @Test
    void HuurderGeenAutoZonderKorting(){
        AutoHuur Test4 = new AutoHuur();
        Klant k2 = new Klant("Henk van Gracht");
        Test4.setAantalDagen(5);
        Test4.setHuurder(k2);
        assertEquals(
                "  er is geen auto bekend\n" +
                "  op naam van: Henk van Gracht (korting:0.0%)\n" +
                "  aantal dagen: 5 en dat kost 0.0",Test4.toString());

    }
    @Test
    void HuurderGeenAutoMetKorting(){
        AutoHuur Test5 = new AutoHuur();
        Klant k3 = new Klant("Max van Gracht");
        k3.setKorting(5.0);
        Test5.setAantalDagen(5);
        Test5.setHuurder(k3);
        assertEquals(
                         "  er is geen auto bekend\n" +
                         "  op naam van: Max van Gracht (korting:5.0%)\n" +
                         "  aantal dagen: 5 en dat kost 0.0",Test5.toString());}

    }

