package Labs.Lab13;
import java.util.*;
public class C13 {
    public static ArrayList<Integer> findIntersection(ArrayList<Integer> a, ArrayList<Integer> b) {
        /* add your code here */
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int number1 : a){
            for (int number2 : b){
                if (number1 == number2){
                    list1.add(number1);
                }
            }
        }
        return list1;
     }
}
