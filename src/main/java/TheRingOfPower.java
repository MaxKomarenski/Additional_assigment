public class TheRingOfPower extends Weapon{
    public TheRingOfPower(){
        powerOfWeapon = 20;
        strength = 1;
    }

    @Override
    protected void takingOfTheWeapon(Character a) {
        if(isUnBroken()){
            a.power += powerOfWeapon;
            a.hp -= 10;
        }
    }
}
