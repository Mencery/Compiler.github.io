package cycle;

import compiler.Compiler;
import memory.Memory;

/**
 * @author Denys Plekhanov
 */
public interface Cycle {
    int execute(Memory memory, Compiler compiler);
}
