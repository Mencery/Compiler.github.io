package command;

import compiler.Compiler;

import cycle.CycleImplementor;
import memory.Memory;

/**
 * @author Denys Plekhanov
 */
public class CycleCommand implements  Command{
    private Compiler compiler;
    public  CycleCommand(Compiler compiler){
        this.compiler = compiler;
    }
    @Override
    public void execute(Memory memory) {

        compiler.setIndex(new CycleImplementor().execute(memory,compiler));

    }
}
