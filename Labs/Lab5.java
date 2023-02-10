package Labs;
import java.util.*;
public class Lab5 {

    public static String intToReversBinary(int x){
        //part 2

        String output = "";
        while (x>0){
            output += x % 2;
            x /= 2;
        }
        return output;
    }

    public static String stringReverse(String input){
        //part 2
        String out = "";
        for (int i = input.length() - 1; i >= 0; i--){
            out += input.charAt(i);
        }
        return out;
    }

    public static String coinFlip(Random rand){
        //part 3
        int chance = rand.nextInt(2);
        if (chance == 1)
        return "Heads";
        else
        return "Tails";
    }

    public static void main(String[] args) {
        //Part 1
        // nothing of note

        //part 2
        System.out.println(stringReverse(intToReversBinary(6)));

        //part 3
        int count = 3;
        Random rand = new Random(2);
        for(int i = 0; i < count; i++)
        System.out.println(coinFlip(rand));
    }
}
