import Characters.Elf;
import Characters.Hobbit;
import org.junit.Test;
import static org.junit.Assert.*;

public class ElfTester {
    @Test
    public void kickTester(){
        Elf elf = new Elf();
        Hobbit hobbit = new Hobbit();
        elf.kick(hobbit);
        assertEquals(hobbit.isAlive() + "" , "false" );
    }
}
