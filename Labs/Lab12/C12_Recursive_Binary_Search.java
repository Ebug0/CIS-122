package Labs.Lab12;
import java.util.*;

public class C12_Recursive_Binary_Search {
       // Read and return an ArrayList of integers.
    static int comparisons = 0;
    static int recursions = 1;
   private static ArrayList<Integer> readNums(Scanner scnr) {
    int size = scnr.nextInt();                // Read size of ArrayList
    ArrayList<Integer> nums = new ArrayList<Integer>();
    for (int i = 0; i < size; ++i) {          // Read the numbers
       nums.add(scnr.nextInt());
    }
    return nums;
 }

 static public int binarySearch(int target, ArrayList<Integer> integers,
                                  int lower, int upper) {
    /* Type your code here. */
    int mid = (lower + upper) / 2;
    comparisons ++;
    if (target == integers.get(mid)){
        return mid;
    }
    if (lower == upper) {
        return -1;
    }
    if (integers.get(mid) < target){
        recursions ++;
        comparisons ++;
        return binarySearch(target, integers, mid + 1, upper);
    }
    if (integers.get(mid) > target){
        recursions ++;
        comparisons ++;
        return binarySearch(target, integers, lower, mid -1);
    }
    return -3;
 }

 public static void main(String [] args) {
    Scanner scnr = new Scanner(System.in);
    // Input a list of integers
    ArrayList<Integer> integers = readNums(scnr);

    // Input a target value for the search
    int target = scnr.nextInt();

    int index = binarySearch(target, integers, 0, integers.size() - 1);

    System.out.printf("index: %d, recursions: %d, comparisons: %d\n",
                      index, recursions, comparisons);
 }
}
