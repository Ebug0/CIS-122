package Labs.Lab10.C10;
import java.util.Scanner;

public class LabProgram {
    public static void main(String [] args){
        Scanner scnr = new Scanner(System.in);
        int inputNum = scnr.nextInt();
        Number yourNum = new Number(inputNum);
        System.out.print(yourNum);

        scnr.close();
     }
}
