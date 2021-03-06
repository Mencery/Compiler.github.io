package command;
import compiler.Compiler;
import memory.Memory;

/**
 * @author Denys Plekhanov
 */
public class PrintCommand implements Command {
    private Compiler compiler;
    public  PrintCommand(Compiler compiler){
        this.compiler = compiler;
    }
    @Override
    public void execute(Memory memory) {
        compiler.addToOutputString((char)memory.getValue());

    }
}
