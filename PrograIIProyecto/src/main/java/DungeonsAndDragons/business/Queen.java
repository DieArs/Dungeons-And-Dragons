package DungeonsAndDragons.business;
import DungeonsAndDragons.business.WeaponBehavior;

public class Queen extends Character {
    public Queen(){
        super();
    }
    public Queen(WeaponBehavior weapon) {
        super(weapon);
    }
    @Override
    public void display() {
        System.out.println("I am the Queen with power 4");
    }
    @Override
    public int getPower(){
        return 4;
    }

    @Override
    public String toString() {
        return "Queen{}";
    }
}
