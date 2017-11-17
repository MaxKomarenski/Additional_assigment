import Characters.Elf;
import Characters.Hobbit;
import Weapon.BowOfTheGaladhrim;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class BowTester {
    @Test
    public void kickTest(){
        Elf elf = new Elf();
        Hobbit hobbit = new Hobbit();
        BowOfTheGaladhrim bow = new BowOfTheGaladhrim();
        assertEquals(bow.kick(elf, hobbit) + "", "true");
        hobbit.setHp(0);
        assertEquals(bow.kick(elf, hobbit) + "", "false");

    }
}