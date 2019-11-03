package compiler;


import compiler.executor.CommandExecutor;
import compiler.executor.DAOExecutor;
import compiler.interpreter.DAOInterpreter;
import compiler.interpreter.Interpreter;
import memory.Memory;

/**
 * @author Denys Plekhanov
 */
public class Compiler {


    private StringBuilder outputString = new StringBuilder();
    private int index;
    private String code;
    private DAOExecutor commandExecutor;
    private DAOInterpreter interpreter;
    private Memory memory;

    public Compiler(String stringForCompiling) {


         memory = new Memory();
        init( stringForCompiling);




    }
    public Compiler(String stringForCompiling, Memory memory){
        this.memory = memory;
        init( stringForCompiling);
    }
    private void init(String stringForCompiling){
        code = stringForCompiling;
        interpreter = new Interpreter( );
        commandExecutor = new CommandExecutor(memory, this);
    }
    public int getIndex() {
        return index;
    }

     public void setIndex(int value) {
        index = value;
    }

    public void addToOutputString(char c) {
        outputString.append(c);
    }


    public String interpret() {
        interpreter.interpret(code,this,memory);
        return outputString.toString();
    }
     public void  incrementIndex(){
        index++;
    }

    public void executeCommand(char c) {
        commandExecutor.executeCommand(c);
    }

    public String getCode() {
        return code;
    }
}







