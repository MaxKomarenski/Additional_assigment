package Characters;

import Characters.Character;
import Weapon.WeaponBehaviour;
import Weapon.WeaponFactory;

public class Hobbit extends Character {
    private WeaponFactory weapon = new WeaponFactory();
    private WeaponBehaviour weaponBehaviour = weapon.randomWeapon();

    public Hobbit(){
        power = 0;
        hp = 30;
        nameOfWeapon = weaponBehaviour.getClass().toString().substring(13);
    }

    public void kick(Character c){
        toCry();
        weaponBehaviour.kick(this, c);
    }

    private void toCry(){
        System.out.println("AAAAAAAAAAAAAAa");
    }
}
