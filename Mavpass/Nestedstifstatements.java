package Mavpass;
import java.util.Scanner;
public class Nestedstifstatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter in your age: ");
        int age = in.nextInt();
        System.out.print("Enter in your gendera: ");
        String gender = in.next();
        gender = gender.toLowerCase();
        System.out.print("Please enter in your hair color: ");
        String haircolor = in.next();
        haircolor = haircolor.toLowerCase();

        //70 female grey = granny
        //70 female notgrey = grandma

        if (age >= 70 && gender.equals("female")){
            if(haircolor.equals("grey") == true)
            System.out.println("You're a granny");
            else
            System.out.println("You're a Grandma");
        }
        else
        System.out.println("You are not a Granny or Grandma");
    in.close();
    }
}
