import java.util.Objects;

public class GameManager extends CharacterFactory {

    private static void showWarriorsAndWeapons(Character wa1, Character wa2, Weapon we1, Weapon we2){
        System.out.println(wa1.getClass().getSimpleName()+"(HP:"+ wa1.hp  +". Power:" + wa1.power + ")"
                + " with " + we1.getClass().getSimpleName() + "(PowerOfWeapon:" + we1.powerOfWeapon + ", Strenth:"
                + we1.strength + ")"
                + " kicks " + wa2.getClass().getSimpleName()+"(HP:"+ wa2.hp  +". Power:" + wa2.power + ")"
                + " with " + we2.getClass().getSimpleName() + "(PowerOfWeapon:" + we2.powerOfWeapon + ", Strenth:"
                + we1.strength + ")");
    }

    private static void showWhoIsDead(Character wa1, Character wa2){
        System.out.println(wa2.getClass().getSimpleName() + " is dead. The "
                + wa1.getClass().getSimpleName() + " is the winner.");
    }


    protected void fight(Character warrior1, Character warrior2, Weapon weapon1, Weapon weapon2){
        while (true) {
            if (Objects.equals(warrior1.getClass().getSimpleName(), "Elf") && Objects.equals(warrior2.getClass().getSimpleName(), "Elf")
                    || Objects.equals(warrior1.getClass().getSimpleName(), "Hobbit") && Objects.equals(warrior2.getClass().getSimpleName(), "Hobbit")){
                System.out.println("They both are dead.");
                break;
            }

            showWarriorsAndWeapons(warrior1, warrior2, weapon1, weapon2);

            weapon1.takingOfTheWeapon(warrior1);
            warrior1.kick(warrior2);
            if(!warrior2.isAlive()){
                showWhoIsDead(warrior1, warrior2);
                break;
            }
            System.out.println("-------------------------");

            showWarriorsAndWeapons(warrior2, warrior1, weapon2, weapon1);

            weapon2.takingOfTheWeapon(warrior2);
            warrior2.kick(warrior1);
            if(!warrior1.isAlive()){
                showWhoIsDead(warrior2, warrior1);
                break;
            }
            System.out.println("-------------------------");
        }

    }
}

