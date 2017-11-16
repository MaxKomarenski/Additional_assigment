package Characters;

import Characters.Character;
import Weapon.WeaponBehaviour;
import Weapon.WeaponFactory;

import java.util.Random;

public class Knight extends Character {
    private Random rand = new Random();
    private WeaponFactory weapon = new WeaponFactory();
    private WeaponBehaviour weaponBehaviour = weapon.randomWeapon();


    public Knight(){
        int powerMax = 20;
        int powerMin = 10;
        int hpMax = 80;
        int hpMin = 40;
        hp = rand.nextInt(hpMax - hpMin + 1) + hpMin;
        power = rand.nextInt(powerMax - powerMin + 1) + powerMin;

        nameOfWeapon = weaponBehaviour.getClass().toString().substring(13);
    }

    public void kick(Character c)
    {
        c.hp -= rand.nextInt(power + 1);
        weaponBehaviour.kick(this,c);

    }
}
