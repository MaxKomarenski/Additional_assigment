public class Elf extends Character {
    public Elf(){
        hp = 10;
        power =10;
    }

    protected void kick(Character c) {
        if(c.power <= this.power){
            c.hp = 0;
        } else {
            c.power--;
        }
    }

}
