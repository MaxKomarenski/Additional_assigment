package Weapon;

import Characters.Character;

public class TheRingOfPower implements WeaponBehaviour {
    public void kick(Character a, Character b){
        int powerOfWeapon = 20;
        b.setHp(b.getHp() - powerOfWeapon);
        a.setHp(a.getHp() - 10);
    }
}
