package DungeonsAndDragons.business;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class QueenTest extends TestCase {
    private Queen queen;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        queen = new Queen();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }
    @Test
    public void testQueenInitialization(){
        assertNotNull("Queen should have a weapon", queen.getWeapon());

    }
    @Test
    public void testSetWeaponSword(){
        WeaponBehavior sword = new Sword();
        queen.setWeapon(sword);
        assertEquals("Queen should have a sword", sword, queen.getWeapon());
    }
    @Test
    public void testSetWeaponAxe(){
        WeaponBehavior axe = new Axe();
        queen.setWeapon(axe);
        assertEquals("Queen should have a axe", axe, queen.getWeapon());
    }
    @Test
    public void testSetWeaponKnife(){
        WeaponBehavior knife = new Knife();
        queen.setWeapon(knife);
        assertEquals("Queen should have a knife", knife, queen.getWeapon());
    }
    @Test
    public void testSetWeaponBowAndArrow(){
        WeaponBehavior bowandarrow = new BowAndArrow();
        queen.setWeapon(bowandarrow);
        assertEquals("Queen should have a bow and arrow", bowandarrow, queen.getWeapon());
    }
    @Test
    public void testPerformAttack(){
        queen.performFight();
        assertFalse(out.toString().isEmpty());
    }
    @Test
    public void testDisplay() {
        queen.display();
        assertTrue(out.toString().toLowerCase().contains("i am the queen with power 4"));
    }
    @Test
    public void testGetPower() {
        assertEquals(4, queen.getPower());
    }

    @Test
    public void testTestToString() {
        String esperado = "queen{}";
        String obtenido = queen.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}