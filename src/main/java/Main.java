public class Main{
    private static CharacterFactory randomWarriorAndWeapon = new CharacterFactory();
    private static Character warrior1 = randomWarriorAndWeapon.randomCharacter();
    private static Character warrior2 = randomWarriorAndWeapon.randomCharacter();
    private static Weapon weapon1 = randomWarriorAndWeapon.randomWeapon();
    private static Weapon weapon2 = randomWarriorAndWeapon.randomWeapon();

    public static void main(String[] args){
        GameManager game = new GameManager();
        game.fight(warrior1, warrior2, weapon1, weapon2);
    }
}
