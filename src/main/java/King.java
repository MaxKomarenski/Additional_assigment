import java.util.Random;

public class King extends Character{
    private static int powerAndHpMax = 15;
    private static int powerAndHpMin = 5;
    Random hp_random = new Random();

    protected int hp = hp_random.nextInt(powerAndHpMax - powerAndHpMin + 1) + powerAndHpMin;

    Random damage = new Random();

    protected int power = damage.nextInt(powerAndHpMax - powerAndHpMin + 1) + powerAndHpMin;

    public void kick(Character c){

        c.hp -= power;
    }
}
