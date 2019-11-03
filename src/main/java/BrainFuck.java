
import compiler.Compiler;

import java.util.Scanner;


/**
 * @author Denys Plekhanov
 */
public class BrainFuck {
    private static Scanner ob = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Enter the code:");
        String code = ob.nextLine();
        System.out.println("Output:");


        Compiler compiler = new Compiler(code);
        System.out.println(compiler.interpret());



    }


}
