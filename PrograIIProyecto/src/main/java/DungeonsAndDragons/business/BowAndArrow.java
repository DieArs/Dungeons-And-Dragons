package DungeonsAndDragons.business;

public class BowAndArrow implements  WeaponBehavior{
    public BowAndArrow(){
    }
    @Override
    public void useWeapon() {
        System.out.println("Shooting and arrow with a bow with power 7");
    }
    @Override
    public int getPower(){
        return 7;
    }

    @Override
    public String toString() {
        return "BowAndArrow{}";
    }
}
