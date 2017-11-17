import Characters.Elf;
import Characters.Hobbit;
import Weapon.Sword;
import Weapon.TheRingOfPower;
import org.junit.Test;
import static org.junit.Assert.*;

public class RingTester {
    @Test
    public void kickTest(){
        Elf elf = new Elf();
        Hobbit hobbit = new Hobbit();
        TheRingOfPower ring = new TheRingOfPower();
        assertEquals(ring.kick(elf, hobbit) + "", "true");
        hobbit.setHp(0);
        assertEquals(ring.kick(elf, hobbit) + "", "false");

    }
}
