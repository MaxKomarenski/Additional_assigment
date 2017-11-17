package Weapon;

import Characters.Character;

public class GandalfsStaffs implements WeaponBehaviour {
    private int strenth = 6;

    public boolean kick(Character a, Character b){
        int powerOfWeapon = 9;
        if(b.isAlive()){
            if(strenth > 0) {
                b.setHp(b.getHp() - powerOfWeapon);
                a.setHp(a.getHp() + 5);
                strenth -= 1;

            }
            return true;
        }
        return false;
    }

}
