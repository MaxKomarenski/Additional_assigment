import java.util.Random;

public class Knight extends Character {
    private static int powerMax = 12;
    private static int hpMax = 21;
    private static int powerAndHpMin = 2;
    Random hp_random = new Random();
    protected int hp = hp_random.nextInt(hpMax - powerAndHpMin + 1) + powerAndHpMin;
    Random damage = new Random();
    protected int power = damage.nextInt(powerMax - powerAndHpMin + 1) + powerAndHpMin;

    public void kick(Character c){

        c.hp -= power;
    }
}
