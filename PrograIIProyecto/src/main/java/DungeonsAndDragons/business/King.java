package DungeonsAndDragons.business;
import DungeonsAndDragons.business.WeaponBehavior;

public class King extends Character {
    public King(){
        super();
    }
    public King(WeaponBehavior weapon) {
        super(weapon);
    }
    @Override
    public void display(){
        System.out.println("I am the King with power 5");
    }
    @Override
    public int getPower(){
        return 5;
    }

    @Override
    public String toString() {
        return "King{}";
    }
}
