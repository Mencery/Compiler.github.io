



import command.Compiler;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;


/**
 * @author Denys Plekhanov
 */

public class CompilerTest {

    @Test
    public void interpret() {
        String code =">+++++++++[<++++++++>-]<.>+++++++[<++++>-]<+.+++++++..+++.>>>++++++++[<++++>-]<.>>>++++++++++[<+++++++++>-]<---.<<<<.+++.------.--------.>>+.>++++++++++.";

        Compiler compiler = new Compiler(code);
        String result =  compiler.interpret();
        Assert.assertEquals("Hello World!\n",result);

        Compiler compiler2 = new Compiler(",.");
        ByteArrayInputStream in = new ByteArrayInputStream("My string".getBytes());
        System.setIn(in);
        String result2 =  compiler2.interpret();


        Assert.assertEquals("M",result2);
    }
}
