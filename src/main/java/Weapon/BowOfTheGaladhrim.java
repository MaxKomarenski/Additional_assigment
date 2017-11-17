package Weapon;

import Characters.Character;

public class BowOfTheGaladhrim implements WeaponBehaviour {
    private int strenth = 5;

    public boolean kick(Character a, Character b){
        int powerOfWeapon = 5;
        if (b.isAlive()){
            if(strenth > 0) {
                b.setHp(b.getHp() - powerOfWeapon);
                a.setHp(a.getHp() + 2);
                strenth -= 1;
            }
            return true;
        }
        return false;
    }

}
