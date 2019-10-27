package memory;

import java.util.Scanner;

/**
 * @author Denys Plekhanov
 */
public class Memory {

    private int length = 65535;
    private byte[] array = new byte[length];


    private int ptr;
    private int c = 0;
    private String code;


    private StringBuilder outputString;

    public Memory() {
        outputString = new StringBuilder();
    }

    public Memory(String code) {
        outputString = new StringBuilder();
        this.code = code;
    }

    public String getOutputString() {
        return outputString.toString();
    }

    public void incrementPointer() {
        if (ptr == length - 1)//If memory is full
            ptr = 0;//pointer is returned to zero
        else
            ptr++;

    }

    public void decrementPointer() {
        if (ptr == 0) { // If the pointer reaches zero

            ptr = length - 1;
        } else {
            ptr--;
        }

    }

    public void incrementValue() {
        array[ptr]++;

    }

    public void decrementValue() {
        array[ptr]--;

    }

    public void print() {

        outputString.append((char) (array[ptr]));
    }

    public void addToCell() {

        Scanner ob = new Scanner(System.in);
        array[ptr] = (byte)(ob.next().charAt(0));
    }

    public int cycleStarts(int i) {

        if (array[ptr] == 0) {
            i++;

            while (c > 0 || code.charAt(i) != ']') {
                if (code.charAt(i) == '[')
                    c++;
                else if (code.charAt(i) == ']')
                    c--;
                i++;
            }

        }
        return i;
    }

    public int cycleEnds(int i) {
        if (array[ptr] != 0) {
            i--;
            while (c > 0 || code.charAt(i) != '[') {
                if (code.charAt(i) == ']')
                    c++;
                else if (code.charAt(i) == '[')
                    c--;
                i--;
            }
            i--;
        }
        return i;
    }

    public byte getValue() {
        return array[ptr];
    }

    public int getPtr() {
        return ptr;
    }

}
