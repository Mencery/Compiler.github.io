package command;

import memory.Memory;

/**
 * @author Denys Plekhanov
 */
public class PrintCommand implements Command {
    @Override
    public void execute(Memory memory) {
        memory.print();
    }
}
