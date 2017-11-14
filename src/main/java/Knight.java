import java.util.Random;

public class Knight extends Character {
    private Random rand = new Random();

    public Knight(){
        int powerAndHpMin = 2;
        int hpMax = 21;
        hp = rand.nextInt(hpMax - powerAndHpMin + 1) + powerAndHpMin;
        int powerMax = 12;
        power = rand.nextInt(powerMax - powerAndHpMin + 1) + powerAndHpMin;
    }

    protected void kick(Character c){
        c.hp -= rand.nextInt(power + 1);
    }
}
