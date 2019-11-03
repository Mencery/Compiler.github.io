package memory;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
    public void getPtr() {
        memory.setPtr(25);

        Assert.assertEquals(25, memory.getPtr());
    }

    @Test
    public void getValue() {
        memory.setValue((byte)5);
        Assert.assertEquals(5, memory.getValue());

    }

    @Test
    public void setPtr() {
        memory.setPtr(25);

        Assert.assertEquals(25, memory.getPtr());
        try {
            memory.setPtr(-1);
        }catch (ArrayIndexOutOfBoundsException ex){
            Assert.assertEquals(25, memory.getPtr());
        }



    }

    @Test
    public void getLength() {
        Assert.assertEquals(65535, memory.getLength());
    }

    @Test
    public void setValue() {
        memory.setValue((byte)10);
        Assert.assertEquals(10, memory.getValue());
        memory.setValue((byte)-1);
        Assert.assertEquals(-1, memory.getValue());
    }


    @Test
    public void incrementPtr() {
        memory.incrementPtr();
        Assert.assertEquals(1, memory.getPtr());
    }

    @Test
    public void decrementPtr() {
        memory.incrementPtr();

        memory.decrementPtr();
        Assert.assertEquals(0, memory.getPtr());
        try {
            memory.decrementPtr();
        }catch (ArrayIndexOutOfBoundsException ex){
            Assert.assertEquals(0, memory.getPtr());
        }


    }

    @Test
    public void incrementValue() {
        memory.incrementValue();
        Assert.assertEquals(1,memory.getValue());

    }

    @Test
    public void decrementValue() {
        memory.decrementValue();
        Assert.assertEquals(-1,memory.getValue());
    }
}
