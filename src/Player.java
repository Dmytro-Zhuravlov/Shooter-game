import Weapon.*;

public class Player {
    Weapon[] weapons;

    public Player() {
        weapons = new Weapon[] {
                new Automaton(),
                new Pistol(),
                new RPG(),
                new Slingshot(),
                new WaterGun()
        };
    }

    public int getSlotsCount() {
        return weapons.length;
    }

    public void shotWithWeapon(int slot) {
        try {
            Weapon weapon = weapons[slot];
            weapon.shot();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Does not have such a weapon");
        }
    }
}
