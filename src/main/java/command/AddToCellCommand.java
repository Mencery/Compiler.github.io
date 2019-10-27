package command;

import memory.Memory;

/**
 * @author Denys Plekhanov
 */
public class AddToCellCommand implements Command {
    @Override
    public void execute(Memory memory) {
        memory.addToCell();
    }
}
