package command;

import memory.Memory;

/**
 * @author Denys Plekhanov
 */
public class IncrementValueCommand implements  Command{

    @Override
    public void execute(Memory memory) {

     memory.incrementValue();

    }
}
