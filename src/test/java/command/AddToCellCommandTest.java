package command;


import memory.Memory;
import org.junit.Assert;
import org.junit.Test;


import java.io.ByteArrayInputStream;



/**
 * @author Denys Plekhanov
 */

public class AddToCellCommandTest {


    @Test
    public void execute() {
        Command command = new AddToCellCommand();
        Memory memory = new Memory();
        ByteArrayInputStream in = new ByteArrayInputStream("M".getBytes());
        System.setIn(in);
        command.execute(memory);

        Assert.assertEquals((char)memory.getValue(),'M');
    }
}
