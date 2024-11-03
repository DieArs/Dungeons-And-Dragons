package DungeonsAndDragons.business;

public class Knife implements WeaponBehavior{
    public Knife(){
    }
    public void useWeapon(){
        System.out.println("Stabbing with a knife power 6!");
    }
    @Override
    public int getPower(){
        return 6;
    }

    @Override
    public String toString() {
        return "Knife{}";
    }
}
