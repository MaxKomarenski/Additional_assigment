public abstract class Weapon {
    protected int powerOfWeapon;
    protected int strength;

    protected abstract void takingOfTheWeapon(Character a);
    protected boolean isUnBroken(){
        return strength > 0;
    }
}
