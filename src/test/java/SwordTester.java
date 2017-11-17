import Characters.Elf;
import Characters.Hobbit;
import Weapon.GandalfsStaffs;
import Weapon.Sword;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwordTester {
    @Test
    public void kickTest(){
        Elf elf = new Elf();
        Hobbit hobbit = new Hobbit();
        Sword bow = new Sword();
        assertEquals(bow.kick(elf, hobbit) + "", "true");
        hobbit.setHp(0);
        assertEquals(bow.kick(elf, hobbit) + "", "false");

    }
}