package Main;

import Characters.Character;
import Characters.CharacterFactory;

public class Main{
    private static CharacterFactory randomWarrior = new CharacterFactory();
    private static Character warrior1 = randomWarrior.randomCharacter();
    private static Character warrior2 = randomWarrior.randomCharacter();


    public static void main(String[] args){
        GameManager game = new GameManager();
        game.fight(warrior1, warrior2);
    }
}
