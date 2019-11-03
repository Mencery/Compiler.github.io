package compiler.interpreter;

import compiler.Compiler;
import memory.Memory;

/**
 * @author Denys Plekhanov
 */
public interface DAOInterpreter  {
    void interpret(String code, Compiler compiler, Memory memory);
}
