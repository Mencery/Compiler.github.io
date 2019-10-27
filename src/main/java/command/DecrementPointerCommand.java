package command;

import memory.Memory;

/**
 * @author Denys Plekhanov
 */
public class DecrementPointerCommand implements Command {

    @Override
    public void execute(Memory memory) {
        memory.decrementPointer();
    }
}
