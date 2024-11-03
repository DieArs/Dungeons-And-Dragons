package DungeonsAndDragons.business;

public class Sword implements WeaponBehavior{

    public Sword(){
    }
    @Override
    public void useWeapon() {
        System.out.println("Swinging a sword with power 10!");
    }
    @Override
    public int getPower(){
        return 10;
    }
    @Override
    public String toString() {
        return "Sword{}";
    }
}
