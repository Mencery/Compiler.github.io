package compiler;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;


/**
 * @author Denys Plekhanov
 */

public class CompilerTest {
  private Compiler compiler;
    @Before
    public void setUp() {
        String code = ">+++++++++[<++++++++>-]<.>+++++++[<++++>-]<+.+++++++..+++.>>>++++++++[<++++>-]<.>>>++++++++++[<+++++++++>-]<---.<<<<.+++.------.--------.>>+.>++++++++++.";

        compiler = new Compiler(code);
    }

    @Test
    public void interpret() {

        String result =  compiler.interpret();
        Assert.assertEquals("Hello World!\n",result);

         compiler = new Compiler(",.");
        ByteArrayInputStream in = new ByteArrayInputStream("My string".getBytes());
        System.setIn(in);
        String result2 =  compiler.interpret();


        Assert.assertEquals("M",result2);
    }

    @Test
    public void executeCommand() {
        compiler.setIndex(compiler.getCode().length());
        for(int i = 0; i<65;i++) {
            compiler.executeCommand('+');
        }
       compiler.executeCommand('.');
        Assert.assertEquals("A", compiler.interpret());

    }

    @Test
    public void getIndex() {
        compiler.setIndex(25);
        Assert.assertEquals(25, compiler.getIndex());
    }

    @Test
    public void setIndex() {
        compiler.setIndex(25);
        Assert.assertEquals(25, compiler.getIndex());

    }

    @Test
    public void getCode() {
        Assert.assertEquals(">+++++++++[<++++++++>-]<.>+++++++[<++++>-]<+.+++++++..+++.>>>++++++++[<++++>-]<.>>>++++++++++[<+++++++++>-]<---.<<<<.+++.------.--------.>>+.>++++++++++."
                ,compiler.getCode());
    }

    @Test
    public void addToOutputString() {
        compiler.setIndex(compiler.getCode().length());
      compiler.addToOutputString('B');
        Assert.assertEquals("B", compiler.interpret());
    }
}
