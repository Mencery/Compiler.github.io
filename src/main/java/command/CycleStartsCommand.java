package command;

import memory.Memory;


/**
 * @author Denys Plekhanov
 */
public class CycleStartsCommand implements  Command{
    private Compiler compiler;
    CycleStartsCommand(Compiler compiler) {
        this.compiler = compiler;
    }
    @Override
    public void execute(Memory memory) {
        compiler.i = memory.cycleStarts(compiler.i);

    }
}
