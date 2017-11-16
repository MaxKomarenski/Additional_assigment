package Main;

import Characters.Character;
import Characters.CharacterFactory;

import java.util.Objects;

public class GameManager extends CharacterFactory {

    private static void showWarriors(Character wa1, Character wa2){
        System.out.println(wa1.getClass().getSimpleName()+"(HP:"+ wa1.getHp()  +". Power:" + wa1.getPower() + ") with "
                + wa1.getNameOfWeapon() + " kicks " + wa2.getClass().getSimpleName()+"(HP:"+ wa2.getHp()
                + ". Power:" + wa2.getPower() + ")");
    }

    private static void showWhoIsDead(Character wa1, Character wa2){
        System.out.println(wa2.getClass().getSimpleName() + " is dead. The "
                + wa1.getClass().getSimpleName() + " is the winner.");
    }


    protected void fight(Character warrior1, Character warrior2){
        while (true) {
            if (Objects.equals(warrior1.getClass().getSimpleName(), "Elf") && Objects.equals(warrior2.getClass().getSimpleName(), "Elf")
                    || Objects.equals(warrior1.getClass().getSimpleName(), "Hobbit") && Objects.equals(warrior2.getClass().getSimpleName(), "Hobbit")){
                System.out.println("They both are dead.");
                break;
            }

            showWarriors(warrior1, warrior2);

            warrior1.kick(warrior2);
            if(!warrior2.isAlive()){
                showWhoIsDead(warrior1, warrior2);
                break;
            }
            System.out.println("---------------------------------------------------------------------------");

            showWarriors(warrior2, warrior1);

            warrior2.kick(warrior1);
            if(!warrior1.isAlive()){
                showWhoIsDead(warrior2, warrior1);
                break;
            }
            System.out.println("---------------------------------------------------------------------------");
        }

    }
}

