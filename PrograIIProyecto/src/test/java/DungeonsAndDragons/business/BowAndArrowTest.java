package DungeonsAndDragons.business;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BowAndArrowTest {
    private BowAndArrow bowandarrow;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        bowandarrow = new BowAndArrow();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testUseWeapon() {
        bowandarrow.useWeapon();
        assertTrue(out.toString().toLowerCase().contains("shooting and arrow with a bow with power 7"));
    }@Test
    public void testGetPower() {
        assertEquals(7, bowandarrow.getPower());
    }
    @Test
    public void testToString() {
        String esperado = "bowandarrow{}";
        String obtenido = bowandarrow.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }

}