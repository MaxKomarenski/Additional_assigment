import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CharacterFactory {
    public CharacterFactory() {
        addtoList();
    }

    List<Character> list = new ArrayList<>();

    public Character randomCharacter(){
        Random character = new Random();
        int characterRandom = character.nextInt((list.size() - 1) + 1);
        return list.get(characterRandom);
    }

    private void  addtoList(){
        list.add(new Hobbit());
        list.add(new Elf());
        list.add(new Knight());
        list.add(new King());
    }



}
