package DungeonsAndDragons.business;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class KnightTest {
    private Knight knight;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        knight = new Knight();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }
    @Test
    public void testKingInitialization(){
        assertNotNull("Knight should have a weapon", knight.getWeapon());

    }
    @Test
    public void testSetWeaponSword(){
        WeaponBehavior sword = new Sword();
        knight.setWeapon(sword);
        assertEquals("Knight should have a sword", sword, knight.getWeapon());
    }
    @Test
    public void testSetWeaponAxe(){
        WeaponBehavior axe = new Axe();
        knight.setWeapon(axe);
        assertEquals("Knight should have a axe", axe, knight.getWeapon());
    }
    @Test
    public void testSetWeaponKnife(){
        WeaponBehavior knife = new Knife();
        knight.setWeapon(knife);
        assertEquals("Knight should have a sword", knife, knight.getWeapon());
    }
    @Test
    public void testSetWeaponBowAndArrow(){
        WeaponBehavior bowandarrow = new BowAndArrow();
        knight.setWeapon(bowandarrow);
        assertEquals("Knight should have a bow and arrow", bowandarrow, knight.getWeapon());
    }
    @Test
    public void testPerformAttack(){
        knight.performFight();
        assertFalse(out.toString().isEmpty());
    }
    @Test
    public void testDisplay() {
        knight.display();
        assertTrue(out.toString().toLowerCase().contains("i am the knight with power 3"));
    }
    @Test
    public void testGetPower() {
        assertEquals(3, knight.getPower());
    }
    @Test
    public void testTestToString() {
        String esperado = "knight{}";
        String obtenido = knight.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}

