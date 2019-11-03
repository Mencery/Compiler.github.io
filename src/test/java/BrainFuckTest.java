
import org.junit.Test;


import java.io.ByteArrayInputStream;



/**
 * @author Denys Plekhanov
 */

public class BrainFuckTest {


    @Test
    public void main() {
        String code =">+++++++++[<++++++++>-]<.>+++++++[<++++>-]<+.+++++++..+++.>>>++++++++[<++++>-]<.>>>++++++++++[<+++++++++>-]<---.<<<<.+++.------.--------.>>+.>++++++++++.";


        ByteArrayInputStream in = new ByteArrayInputStream(code.getBytes());
        System.setIn(in);
        BrainFuck.main(new String[]{});
    }
}
