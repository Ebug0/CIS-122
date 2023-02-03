package Labs;
import java.util.*;
public class Lab4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //Part 1

        String input = in.nextLine();
        int count3 = 0;
        for (int i = 0; i <input.length();i++){
            if(!(input.charAt(i) == ' ' || input.charAt(i) == '.' ||input.charAt(i) == '!'|| input.charAt(i) == ','))
            count3 ++;
        }
        System.out.println(count3); 

        //Part 2
         
        int n = in.nextInt();
        int count = 1;
        if (n == 1)
        System.out.println(n);
        else
        System.out.print(n+"\t");
        while (n > 1){
            if (n%2 == 0)
            n /= 2;
            else
                n = 3*n + 1;
            if (n == 1){
                if (count == 10)
                System.out.println("\n" + n);
                else
                System.out.println(n);
            }
            else if (count != 10){
                System.out.print(n + "\t");
                count ++;
            }
            else{
                System.out.print("\n"+ n + "\t");
                count = 1;
            }} 

            //Part 3

            int number = in.nextInt();
            int sum = 0;
            int count2 = 0;
            int max = 0;

            while (number >= 0){
                if (number > max)
                max = number;
                sum += number;
                count2 ++;
                number = in.nextInt();
            }
            double average = (double) sum / count2;
            System.out.printf("%d %.2f\n", max, average);

            in.close();
    }
}
