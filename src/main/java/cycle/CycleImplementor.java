package cycle;

import compiler.Compiler;
import memory.Memory;

/**
 * @author Denys Plekhanov
 */
public class CycleImplementor implements Cycle {

@Override
    public int execute(Memory memory, Compiler compiler) {

        int i = compiler.getIndex();
        String code = compiler.getCode();

        if (memory.getValue() != 0) {
            i++;
            int indexOfCycleStart = i;
            while (true) {
                compiler.executeCommand(code.charAt(i));
                i++;
                if (code.charAt(i) == ']') {
                    if (memory.getValue() != 0) {
                        i = indexOfCycleStart;
                    } else {
                        break;
                    }

                }

            }

        }

        return i;
    }
}
