package DungeonsAndDragons.business;
import java.util.Random;

public class WeaponFactory {
    private static final WeaponBehavior[] weapons = {
            new Sword(),
            new Axe(),
            new BowAndArrow(),
            new Knife()
    };

    public static WeaponBehavior getRandomWeapon() {
        Random random = new Random();
        return weapons[random.nextInt(weapons.length)];
    }
}