



import memory.Memory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;


/**
 * @author Denys Plekhanov
 */

public class MemoryTest {
    private Memory memory;

    @Before
    public void setUp() {
        memory = new Memory();
    }

    @Test
    public void getOutputString() {
        for (int i = 0; i < 32; i++) {
            memory.incrementValue();
        }
        memory.print();
        Assert.assertEquals(memory.getOutputString(), " ");
    }

    @Test
    public void getValue() {
        for (int i = 0; i < 32; i++) {
            memory.incrementValue();
        }
        Assert.assertEquals(32, memory.getValue());

    }

    @Test
    public void getPtr() {
        for (int i = 0; i < 32; i++) {
            memory.incrementPointer();
        }
        memory.decrementPointer();
        Assert.assertEquals(31, memory.getPtr());
    }

    @Test
    public void incrementPointer() {

        memory.incrementPointer();

        Assert.assertEquals(memory.getPtr(), 1);


    }

    @Test
    public void decrementPointer() {
        Memory memory = new Memory();
        memory.incrementPointer();
        memory.incrementPointer();
        memory.incrementPointer();
        memory.decrementPointer();
        Assert.assertEquals(memory.getPtr(), 2);
    }

    @Test
    public void incrementValue() {
        Memory memory = new Memory();
        memory.incrementPointer();
        memory.incrementValue();
        memory.incrementValue();
        Assert.assertEquals(memory.getValue(), 2);
    }

    @Test
    public void decrementValue() {
        Memory memory = new Memory();
        memory.incrementPointer();
        memory.incrementValue();
        memory.incrementValue();
        memory.decrementValue();
        Assert.assertEquals(memory.getValue(), 1);
    }

    @Test
    public void print() {
        Memory memory = new Memory();
        for (int i = 0; i < 32; i++) {
            memory.incrementValue();
        }

        memory.print();
        String result = " ";
        memory.getOutputString();
        Assert.assertEquals(result, memory.getOutputString());
    }


    @Test
    public void cycleStarts() {
        String  code = "[>+++++++>++++++++++>+++>+<<<<-]";
        memory = new Memory(code);
        for (int i = 0; i <= 9; i++) {
            memory.incrementValue();
        }
        memory.incrementPointer();
        int i = memory.cycleStarts(0);

        Assert.assertEquals(i, 31);

    }

    @Test
    public void cycleEnds() {
        String  code = "[>+++++++>++++++++++>+++>+<<<<-]";
        memory = new Memory(code);
        for (int i = 0; i <= 9; i++) {
            memory.incrementValue();
        }

        int i = memory.cycleEnds(code.length()-1);

        Assert.assertEquals(i, -1);
    }
    @Test
    public void addToCell() {

        ByteArrayInputStream in = new ByteArrayInputStream("My string".getBytes());
        System.setIn(in);
        memory.addToCell();
        Assert.assertEquals((char)memory.getValue(),'M');
    }
}
