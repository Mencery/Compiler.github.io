package cycle;


import compiler.Compiler;
import cycle.CycleImplementor;
import memory.Memory;
import org.junit.Assert;
import org.junit.Test;


/**
 * @author Denys Plekhanov
 */

public class CycleImplementorTest {

    @Test
    public void execute() {
        CycleImplementor cycleImplementor = new CycleImplementor();
        String code = "[<++++++++>-]";
        Memory memory = new Memory();
        Compiler compiler = new Compiler(code,memory);

        memory.incrementPtr();
        memory.setValue((byte) 3);

        Assert.assertEquals(12, cycleImplementor.execute(memory,compiler));
    }
}
