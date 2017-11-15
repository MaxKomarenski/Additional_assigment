public class Sword extends Weapon {
    public Sword(){
        powerOfWeapon = 1;
        strength = 2;
    }


    protected void takingOfTheWeapon(Character a) {
        if(isUnBroken()){
            a.power += powerOfWeapon;
            strength -= 1;
        }
    }
}
