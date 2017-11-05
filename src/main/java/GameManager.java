import java.util.Objects;

public class GameManager extends CharacterFactory {
    static CharacterFactory randomWarrior = new CharacterFactory();
    static Character warrior1 = randomWarrior.randomCharacter();
    static Character warrior2 = randomWarrior.randomCharacter();

    private static void fight(){
        while (true) {
            if (Objects.equals(warrior1.getClass().getSimpleName(), "Elf") && Objects.equals(warrior2.getClass().getSimpleName(), "Elf")){
                System.out.println("They both are dead.");
                break;
            }

            warrior1.kick(warrior2);
            if(!warrior2.isAlive()){
                System.out.println(warrior2.getClass().getSimpleName() + " is dead. The " + warrior1.getClass().getSimpleName() + " is the winner");
                break;
            }
            warrior2.kick(warrior1);
            if(!warrior1.isAlive()){
                System.out.println(warrior1.getClass().getSimpleName() + " is dead. The " + warrior2.getClass().getSimpleName() + " is the winner");
                break;
            }
        }

    }

    public static void main(String[] args){
        fight();

    }

}
