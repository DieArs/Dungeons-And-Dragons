package DungeonsAndDragons.business;
import DungeonsAndDragons.business.WeaponBehavior;

public class Knight extends Character {
    public Knight(){
        super();
    }
    public Knight(WeaponBehavior weapon) {
        super(weapon);
    }
    @Override
    public void display() {
        System.out.println("I am the Knight with power 3");
    }
    @Override
    public int getPower(){
        return 3;
    }


    @Override
    public String toString() {
        return "Knight{}";
    }
}
