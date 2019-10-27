package command;

import memory.Memory;

/**
 * @author Denys Plekhanov
 */
public class IncrementPointerCommand implements Command {


    @Override
    public void execute(Memory memory) {
        memory.incrementPointer();

    }

}
