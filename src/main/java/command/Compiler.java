package command;


import memory.Memory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Denys Plekhanov
 */
public class Compiler {
     int i = 0;
    private  final int  capacity = 8;

    private Memory memory;
    private Map<Character, Command> commands = new HashMap<Character, Command>(capacity);
    private  String code;

    public Compiler(String code) {


        memory = new Memory(code);
       init(code);
    }

    private void init(String code){
        Command incrementPointer = new IncrementPointerCommand();

        Command decrementPointer = new DecrementPointerCommand();
        Command incrementValue = new IncrementValueCommand();

        Command decrementValue = new DecrementValueCommand();
        Command print = new PrintCommand();
        Command addToCell = new AddToCellCommand();
        Command cycleStarts = new CycleStartsCommand(this);
        Command cycleEnds = new CycleEndsCommand(this);
        this.code = code;
        commands.put('>', incrementPointer);
        commands.put('<', decrementPointer);
        commands.put('+', incrementValue);
        commands.put('-', decrementValue);

        commands.put('.', print);
        commands.put(',', addToCell);
        commands.put('[', cycleStarts);
        commands.put(']', cycleEnds);
    }
    /**
     *
     * @return Return Interpreted Brainfuck string
     */
    public  String interpret() {
        for (i = 0; i < code.length(); i++){
            executeCommand(code.charAt(i));
        }
        return  memory.getOutputString();
    }

    private void executeCommand(char c) {

        commands.get(c).execute(memory);
    }

}
