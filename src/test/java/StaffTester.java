import Characters.Elf;
import Characters.Hobbit;
import Weapon.BowOfTheGaladhrim;
import Weapon.GandalfsStaffs;
import org.junit.Test;

import static org.junit.Assert.*;

public class StaffTester {
    @Test
    public void kickTest(){
        Elf elf = new Elf();
        Hobbit hobbit = new Hobbit();
        GandalfsStaffs bow = new GandalfsStaffs();
        assertEquals(bow.kick(elf, hobbit) + "", "true");
        hobbit.setHp(0);
        assertEquals(bow.kick(elf, hobbit) + "", "false");

    }
}