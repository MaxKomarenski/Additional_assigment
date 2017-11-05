public abstract class Character {
    protected int hp;
    protected int power;

    protected abstract void kick(Character c);
    protected boolean isAlive(){
        return hp > 0;

    }

}

