package command;

import memory.Memory;
/**
 * @author Denys Plekhanov
 */
public class DecrementValueCommand implements  Command{

    @Override
    public void execute(Memory memory) {
        memory.decrementValue();
    }
}
