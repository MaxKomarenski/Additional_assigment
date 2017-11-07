import java.util.Random;

public class Knight extends Character {
    private static int powerMax = 12;
    private static int hpMax = 21;
    private static int powerAndHpMin = 2;
    Random rand = new Random();

    public Knight(){
        hp = rand.nextInt(hpMax - powerAndHpMin + 1) + powerAndHpMin;
        power = rand.nextInt(powerMax - powerAndHpMin + 1) + powerAndHpMin;

    }

    public void kick(Character c){

        c.hp -= rand.nextInt(power + 1);
    }
}
