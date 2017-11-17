package Weapon;

import Characters.Character;

public class TheRingOfPower implements WeaponBehaviour {
    public boolean kick(Character a, Character b){
        if (b.isAlive()){
            if(b.isAlive()){
                int powerOfWeapon = 20;
                b.setHp(b.getHp() - powerOfWeapon);
                a.setHp(a.getHp() - 10);
                return true;
            }
            return true;
        }
        return false;
    }
}
