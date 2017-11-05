public class Elf extends Character {
    protected int hp = 10;
    protected  int power = 10;

    public void kick(Character c) {
        if(c.power <= this.power){
            c.hp = 0;
        } else {
            c.power--;
        }
    }

}
