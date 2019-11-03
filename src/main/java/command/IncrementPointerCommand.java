package command;


import memory.Memory;

/**
 * @author Denys Plekhanov
 */
public class IncrementPointerCommand implements Command {


    @Override
    public void execute(Memory memory) {

        if (memory.getPtr() == memory.getLength() - 1) {//If memory is full
            memory.setPtr(0);//pointer is returned to zero

        }
        else {
          memory.incrementPtr();
        }


    }

}
