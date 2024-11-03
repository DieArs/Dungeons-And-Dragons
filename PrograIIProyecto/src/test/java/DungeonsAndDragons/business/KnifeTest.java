package DungeonsAndDragons.business;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class KnifeTest {
    private Knife knife;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        knife = new Knife();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testUseWeapon() {
        knife.useWeapon();
        assertTrue(out.toString().toLowerCase().contains("stabbing with a knife power 6!"));
    }
    @Test
    public void testGetPower() {
        assertEquals(6, knife.getPower());
    }

    @Test
    public void testToString() {
        String esperado = "knife{}";
        String obtenido = knife.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }


}