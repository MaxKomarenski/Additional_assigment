public class BowoftheGaladhrim extends Weapon{
    public BowoftheGaladhrim(){
        powerOfWeapon = 10;
        strength = 5;
    }

    @Override
    protected void takingOfTheWeapon(Character a) {
        if(isUnBroken()){
            a.power += powerOfWeapon;
            strength -= 1;
        }
    }
}
