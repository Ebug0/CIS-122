package Labs.Lab14;
import java.util.*;
public class A14 {
    public Set<String> makeLetterSet(String str)
    {
       // TODO: Complete method
       TreeSet ts = new TreeSet();
       for (int i = 0; i< str.length(); i++){
        String temp = "" + str.charAt(i);
        ts.add(temp);
       }
       return ts;
    } 
}
