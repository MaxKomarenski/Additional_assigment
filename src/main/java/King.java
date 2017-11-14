import java.util.Random;

public class King extends Character{
    private static int powerAndHpMax = 15;
    private static int powerAndHpMin = 5;
    Random rand = new Random();

    public King() {
        hp  = rand.nextInt(powerAndHpMax - powerAndHpMin + 1) + powerAndHpMin;
        power = rand.nextInt(powerAndHpMax - powerAndHpMin + 1) + powerAndHpMin;
    }

    protected void kick(Character c){
        c.hp -= rand.nextInt(power + 1);
    }
}
