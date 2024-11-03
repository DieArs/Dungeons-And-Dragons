package DungeonsAndDragons.business;
import DungeonsAndDragons.business.WeaponBehavior;

public class Gnome extends Character {
    public Gnome(){
        super();
    }
    public Gnome(WeaponBehavior weapon) {
        super(weapon);
    }
    @Override
    public void display() {
        System.out.println("I am the Gnome with power 2");
    }
    @Override
    public int getPower(){
        return 2;
    }

    @Override
    public String toString() {
        return "Gnome{}";
    }
}
