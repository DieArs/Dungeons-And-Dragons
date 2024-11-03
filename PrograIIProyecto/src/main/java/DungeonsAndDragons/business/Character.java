package DungeonsAndDragons.business;

import lombok.Setter;
@Setter

public abstract class Character {
    protected WeaponBehavior weapon;
    public Character() {
        this.weapon = WeaponFactory.getRandomWeapon();
    }
    public Character(WeaponBehavior weapon){
        this.weapon = WeaponFactory.getRandomWeapon();
    }

    public WeaponBehavior getWeapon() {
        return weapon;
    }

    public void performFight() {
        if (weapon != null) {
            weapon.useWeapon();
        } else {
            System.out.println("No weapon assigned to character");
        }
    }
    public abstract void display();
    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
    public abstract int getPower();

    @Override
    public String toString() {
        return "Character{" +
                "weapon=" + weapon +
                '}';
    }
}
