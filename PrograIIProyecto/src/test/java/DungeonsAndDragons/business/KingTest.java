package DungeonsAndDragons.business;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class KingTest {
    private King king;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        king = new King();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testKingInitialization() {
        assertNotNull("King should have a weapon", king.getWeapon());

    }

    @Test
    public void testSetWeaponSword() {
        WeaponBehavior sword = new Sword();
        king.setWeapon(sword);
        assertEquals("King should have a sword", sword, king.getWeapon());
    }

    @Test
    public void testSetWeaponAxe() {
        WeaponBehavior axe = new Axe();
        king.setWeapon(axe);
        assertEquals("King should have a axe", axe, king.getWeapon());
    }

    @Test
    public void testSetWeaponKnife() {
        WeaponBehavior knife = new Knife();
        king.setWeapon(knife);
        assertEquals("King should have a knife", knife, king.getWeapon());
    }

    @Test
    public void testSetWeaponBowAndArrow() {
        WeaponBehavior bowandarrow = new BowAndArrow();
        king.setWeapon(bowandarrow);
        assertEquals("King should have a bow and arrow", bowandarrow, king.getWeapon());
    }

    @Test
    public void testPerformAttack() {
        king.performFight();
        assertFalse(out.toString().isEmpty());
    }

    @Test
    public void testDisplay() {
        king.display();
        assertTrue(out.toString().toLowerCase().contains("i am the king with power 5"));
    }

    @Test
    public void testGetPower() {
        assertEquals(5, king.getPower());
    }
    @Test
    public void testTestToString () {
        String esperado = "king{}";
        String obtenido = king.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}