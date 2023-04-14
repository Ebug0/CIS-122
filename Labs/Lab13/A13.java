package Labs.Lab13;
import java.util.*;
public class A13 {
    public static ArrayList<Integer> extractEvenNumbers(ArrayList<Integer> numbers) {
        /* add your code here */  
        ArrayList<Integer> newnumbers = new ArrayList<>();

        for (int number : numbers){
            if (number%2 == 0){
                newnumbers.add(number);
            }
        }
        return newnumbers;
    
     }
}
