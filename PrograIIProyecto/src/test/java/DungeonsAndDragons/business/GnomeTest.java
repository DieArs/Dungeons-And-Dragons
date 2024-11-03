package DungeonsAndDragons.business;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class GnomeTest {
    private Gnome gnome;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        gnome = new Gnome();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testKingInitialization() {
        assertNotNull("Gnome should have a weapon", gnome.getWeapon());

    }

    @Test
    public void testSetWeaponSword() {
        WeaponBehavior sword = new Sword();
        gnome.setWeapon(sword);
        assertEquals("Gnome should have a sword", sword, gnome.getWeapon());
    }

    @Test
    public void testSetWeaponAxe() {
        WeaponBehavior axe = new Axe();
        gnome.setWeapon(axe);
        assertEquals("Gnome should have a axe", axe, gnome.getWeapon());
    }

    @Test
    public void testSetWeaponKnife() {
        WeaponBehavior knife = new Knife();
        gnome.setWeapon(knife);
        assertEquals("Gnome should have a sword", knife, gnome.getWeapon());
    }

    @Test
    public void testSetWeaponBowAndArrow() {
        WeaponBehavior bowandarrow = new BowAndArrow();
        gnome.setWeapon(bowandarrow);
        assertEquals("Knight should have a bow and arrow", bowandarrow, gnome.getWeapon());
    }

    @Test
    public void testPerformAttack() {
        gnome.performFight();
        assertFalse(out.toString().isEmpty());
    }

    @Test
    public void testDisplay() {
        gnome.display();
        assertTrue(out.toString().toLowerCase().contains("i am the gnome with power 2"));
    }
    @Test
    public void testGetPower() {
        assertEquals(2, gnome.getPower());
    }
    @Test
    public void testTestToString() {
        String esperado = "gnome{}";
        String obtenido = gnome.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}