package command;


import memory.Memory;

/**
 * @author Denys Plekhanov
 */
public class DecrementPointerCommand implements Command {

    @Override
    public void execute(Memory memory) {

        if (memory.getPtr() == 0) { // If the pointer reaches zero

            memory.setPtr( memory.getLength() - 1);
        } else {
            memory.decrementPtr();
        }
    }
}
