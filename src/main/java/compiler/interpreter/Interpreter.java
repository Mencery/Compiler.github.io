package compiler.interpreter;


import compiler.Compiler;
import compiler.executor.CommandExecutor;

import memory.Memory;


/**
 * @author Denys Plekhanov
 */
public class Interpreter implements DAOInterpreter {


    public void interpret(String code, Compiler compiler, Memory memory) {

        CommandExecutor commandExecutor = new CommandExecutor(memory, compiler);

        for (; compiler.getIndex() < code.length(); compiler.incrementIndex()) {


                commandExecutor.executeCommand(code.charAt(compiler.getIndex()));



        }
    }


}