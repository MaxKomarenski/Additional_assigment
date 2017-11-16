package Characters;

import Characters.Character;
import Weapon.WeaponBehaviour;
import Weapon.WeaponFactory;

import java.util.Random;

public class King extends Character {
    private Random rand = new Random();
    private WeaponFactory weapon = new WeaponFactory();
    private WeaponBehaviour weaponBehaviour = weapon.randomWeapon();


    public King() {
        int hpMax = 100;
        int hpMin = 50;
        int powerMin = 10;
        int powerMax = 30;

        hp  = rand.nextInt(hpMax - hpMin + 1) + hpMin;
        power = rand.nextInt(powerMax - powerMin + 1) + powerMin;

        nameOfWeapon = weaponBehaviour.getClass().toString().substring(13);
    }

    public void kick(Character c){
        c.hp -= rand.nextInt(power + 1);
        weaponBehaviour.kick(this,c);
    }
}
