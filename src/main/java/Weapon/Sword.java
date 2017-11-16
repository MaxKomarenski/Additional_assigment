package Weapon;

import Characters.Character;

public class Sword implements WeaponBehaviour {
    private int strenth = 2;

    public void kick(Character a, Character b){
        int powerOfWeapon = 1;
        if(strenth > 0){
            b.setHp(b.getHp() - powerOfWeapon);
            strenth -= 1;
        }
    }
}

