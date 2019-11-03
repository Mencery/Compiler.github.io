package memory;

/**
 * @author Denys Plekhanov
 */
public class Memory {

    private final int length = 65535;
    private byte[] array = new byte[length];
    private int ptr;

    public void setPtr(int ptr) {
        if (ptr >= 0) {
            this.ptr = ptr;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }

    }

    public int getPtr() {
        return ptr;
    }
public  void incrementPtr(){
        ptr++;
}
    public  void decrementPtr(){
        if(ptr>0) {
            ptr--;
        }
        else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    public  void incrementValue(){
        array[ptr]++;
    }
    public  void decrementValue(){
        array[ptr]--;
    }
    public byte getValue() {
        return array[ptr];
    }

    public void setValue(byte value) {
        array[ptr] = value;
    }

    public int getLength() {
        return length;
    }
}
