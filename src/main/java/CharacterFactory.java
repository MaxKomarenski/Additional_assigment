import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CharacterFactory {
    public CharacterFactory() {
        addToList();
    }

    private List<Character> listCharacters = new ArrayList<>();
    private List<Weapon> listWeapons = new ArrayList<>();

    protected Character randomCharacter(){
        Random character = new Random();
        int characterRandom = character.nextInt((listCharacters.size() - 1) + 1);
        return listCharacters.get(characterRandom);
    }

    protected Weapon randomWeapon(){
        Random weapon = new Random();
        int weaponRandom = weapon.nextInt((listWeapons.size() - 1) + 1);
        return listWeapons.get(weaponRandom);
    }

    private void addToList(){
        listCharacters.add(new Hobbit());
        listCharacters.add(new Elf());
        listCharacters.add(new Knight());
        listCharacters.add(new King());

        listWeapons.add(new Sword());
        listWeapons.add(new BowoftheGaladhrim());
        listWeapons.add(new GandalfsStaffs());
        listWeapons.add(new TheRingOfPower());
    }



}
