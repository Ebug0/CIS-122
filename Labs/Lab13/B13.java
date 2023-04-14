package Labs.Lab13;
import java.util.*;
public class B13 {
    public static ArrayList<String> reverseStrings(ArrayList<String> strings) {
        /* add your code here */  
        ArrayList<String> inputStrings = new ArrayList<>();
        
        for (String test : strings){
            String replacement = "";
            for (int i = test.length() -1 ; i >= 0; i--){
                replacement += "" + test.charAt(i);
            }
            inputStrings.add(replacement);
        }
        return inputStrings;
     }
}
