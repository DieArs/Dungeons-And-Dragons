package DungeonsAndDragons.business;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SwordTest {
    private Sword sword;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        sword = new Sword();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testUseWeapon() {
        sword.useWeapon();
        assertTrue(out.toString().toLowerCase().contains("swinging a sword with power 10"));
    }
    @Test
    public void testGetPower() {
        assertEquals(10, sword.getPower());
    }
    @Test
    public void testToString() {
        String esperado = "sword{}";
        String obtenido = sword.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}

