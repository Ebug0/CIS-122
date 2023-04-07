package Labs.Lab12;
import java.util.Scanner;

public class A12_Descending_Selection_Sort {
    // TODO: Write a void method selectionSortDescendTrace() that takes 
   //       an integer array and the number of elements in the array as arguments, 
   //       and sorts the array into descending order.
   public static void selectionSortDescendTrace(int [] numbers, int numElements) {
    int mergepos = 0, maxpos = 0;
  
    while (mergepos < numElements-1){
        int max = numbers[mergepos];
        maxpos = mergepos;

        for (int i = mergepos; i <= numElements-1; i++){
            if (max < numbers[i]){
                max = numbers[i];
                maxpos = i;
            }
            if (i == numElements-1){

                int temp = numbers[mergepos];
                numbers[mergepos] = max;
                numbers[maxpos] = temp;
          
                
                for(int o = 0; o < numElements; o++){
                     
                    System.out.printf("%s ", numbers[o]);
                }
                
                System.out.println();
            
            }
        }
        mergepos++;
    }
    for(int i = 0; i<numElements; i++){
        
    }

   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] numbers = new int[10];
      int count = 0;
      int numtoadd = scnr.nextInt();
      
      while(numtoadd != -1 && count < 10 ){
        numbers[count] = numtoadd;
        count ++;
        numtoadd = scnr.nextInt();
        
      }
      selectionSortDescendTrace(numbers, count);
      // TODO: Read in a list of up to 10 positive integers; stop when
      //       -1 is read. Then call selectionSortDescendTrace() method.
      scnr.close();
   } 
}
