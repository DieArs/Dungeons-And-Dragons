package DungeonsAndDragons.business;

public class Axe implements WeaponBehavior{
    public Axe(){
    }
    @Override
    public void useWeapon() {
        System.out.println("Chopping with an axe power 8!");
    }
    @Override
    public int getPower(){
        return 8;
    }

    @Override
    public String toString() {
        return "Axe{}";
    }
}
