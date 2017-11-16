package Characters;

import Characters.Character;
import Weapon.WeaponBehaviour;
import Weapon.WeaponFactory;

public class Elf extends Character {
    private WeaponFactory weapon = new WeaponFactory();
    private WeaponBehaviour weaponBehaviour = weapon.randomWeapon();

    public Elf(){
        hp = 50;
        power = 15;
        nameOfWeapon = weaponBehaviour.getClass().toString().substring(13);
    }

    public void kick(Character c) {
        if(c.power <= this.power){
            c.hp = 0;
        } else {
            c.power--;
            weaponBehaviour.kick(this, c);
        }
    }

}