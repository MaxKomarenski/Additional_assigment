package Characters;

import Characters.Character;
import Characters.Elf;
import Characters.King;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CharacterFactory {
    public CharacterFactory() {
        addToList();
    }

    private List<Character> listCharacters = new ArrayList<>();

    public Character randomCharacter(){
        Random character = new Random();
        int characterRandom = character.nextInt((listCharacters.size() - 1) + 1);
        return listCharacters.get(characterRandom);
    }

    private void addToList(){
        listCharacters.add(new Hobbit());
        listCharacters.add(new Elf());
        listCharacters.add(new Knight());
        listCharacters.add(new King());
    }



}
