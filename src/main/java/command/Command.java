package command;

import memory.Memory;

/**
 * @author Denys Plekhanov
 */
public interface Command {
     void execute(Memory memory);
}
