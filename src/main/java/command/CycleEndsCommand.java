package command;

import memory.Memory;


/**
 * @author Denys Plekhanov
 */
public class CycleEndsCommand implements Command {
    private Compiler compiler;
    CycleEndsCommand(Compiler compiler) {
    this.compiler = compiler;
    }

    @Override
    public void execute(Memory memory) {
        compiler.i = memory.cycleEnds(compiler.i);
    }

}
