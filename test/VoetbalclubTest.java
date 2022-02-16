import org.junit.jupiter.api.Test;
import week1.opdracht7.Voetbalclub;

import static org.junit.jupiter.api.Assertions.*;

public class VoetbalclubTest {

    @Test
    void isClubNaamFilled(){
        Voetbalclub v = new Voetbalclub("");
        assertEquals("FC", v.toString().substring(0,2));
    }
    @Test
    void isResultCorrectlyHandled(){
        Voetbalclub w = new Voetbalclub("winners");
        w.verwerkResultaat('w');
        assertEquals(3, w.aantalPunten());

        Voetbalclub g = new Voetbalclub("equalizers");
        g.verwerkResultaat('g');
        assertEquals(1, g.aantalPunten());

        Voetbalclub v = new Voetbalclub("losers");
        v.verwerkResultaat('v');
        assertEquals(0, v.aantalPunten());

        Voetbalclub x = new Voetbalclub("crossplayers");
        x.verwerkResultaat('x');
        assertEquals(0, x.aantalGespeeld());
        assertEquals(0, x.aantalPunten());
    }

    @Test
    void isStringCorrect(){
        Voetbalclub stringTest = new Voetbalclub("singy Stringers");
        stringTest.verwerkResultaat('w');
        stringTest.verwerkResultaat('w');
        stringTest.verwerkResultaat('w');
        stringTest.verwerkResultaat('g');
        stringTest.verwerkResultaat('g');
        stringTest.verwerkResultaat('v');

        assertEquals("singy Stringers   6 3 2 1 11", stringTest.toString());
    }
}
