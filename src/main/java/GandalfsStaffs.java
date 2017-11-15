public class GandalfsStaffs extends Weapon {
    public GandalfsStaffs(){
        powerOfWeapon = 9;
        strength = 6;
    }

    @Override
    protected void takingOfTheWeapon(Character a) {
        if(isUnBroken()){
            a.power += powerOfWeapon;
            a.hp += 2;
            strength -= 1;
        }
    }
}
