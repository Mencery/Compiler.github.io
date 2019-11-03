package command;

import memory.Memory;

import java.util.Scanner;

/**
 * @author Denys Plekhanov
 */
public class AddToCellCommand implements Command {

    @Override
    public void execute(Memory memory) {
        Scanner ob = new Scanner(System.in);
        memory.setValue ((byte) (ob.next().charAt(0)));
    }
}
