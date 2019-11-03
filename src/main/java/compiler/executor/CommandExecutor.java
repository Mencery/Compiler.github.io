package compiler.executor;

import command.*;
import compiler.Compiler;
import memory.Memory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Denys Plekhanov
 */
public class CommandExecutor implements  DAOExecutor {
    private final int capacity = 6;
    private Map<Character, Command> commands = new HashMap<>(capacity);
    private Memory memory;

    public CommandExecutor(Memory memory, Compiler compiler) {
        this.memory =  memory;
        Command incrementPointer = new IncrementPointerCommand();

        Command decrementPointer = new DecrementPointerCommand();
        Command incrementValue = new IncrementValueCommand();

        Command decrementValue = new DecrementValueCommand();
        Command print = new PrintCommand(compiler);
        Command addToCell = new AddToCellCommand();
        Command cycle = new CycleCommand(compiler);
        commands.put('>', incrementPointer);
        commands.put('<', decrementPointer);
        commands.put('+', incrementValue);
        commands.put('-', decrementValue);

        commands.put('.', print);
        commands.put(',', addToCell);
        commands.put('[', cycle);

    }

   public void executeCommand(char c) {

        commands.get(c).execute(memory);
    }
}
