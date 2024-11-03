package DungeonsAndDragons.business;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class AxeTest {
    private Axe axe;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        axe = new Axe();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testUseWeapon() {
        axe.useWeapon();
        assertTrue(out.toString().toLowerCase().contains("chopping with an axe power 8!"));
    }
    @Test
    public void testGetPower() {
        assertEquals(8, axe.getPower());
    }

    @Test
    public void testToString() {
        String esperado = "axe{}";
        String obtenido = axe.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}

