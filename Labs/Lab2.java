package Labs;
import java.util.Scanner;

public class Lab2 {
    //Part 1
/*     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter in your age: ");
        int age = in.nextInt();
        System.out.println();
        
        System.out.print("Please enter in your Weight: ");
        int weight = in.nextInt();
        System.out.println();
        
        System.out.print("Please enter in your heart rate: ");
        int heartrate = in.nextInt();
        System.out.println();

        System.out.print("Please enter the amount of time spent exercising: ");
        int time = in.nextInt();
        System.out.println();
        
        double cal = ((age * 0.2757) + (weight * 0.03295) + (heartrate * 1.0781) - 75.4991) * (time / 8.368);

        System.out.printf("Calories: %.2f calories\n", cal);

    } */
    
    //part 2
    /* public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String test = in.next();

        if (test.length() == 3)
            System.out.println(test);

        else{
            int chartotakeout = test.length() - 3;
            String newtest = test.substring(chartotakeout/2, test.length() - chartotakeout/2);
            System.out.println(newtest);
        }
    } */

    //part 3
    /* public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double startnote = in.nextDouble();
        System.out.printf("%.2f", startnote);
        System.out.printf("%.2f\n", (startnote * Math.pow(Math.pow(2, 1.0/12.0), 1)));
        System.out.printf("%.2f\n", (startnote * Math.pow(Math.pow(2, 1.0/12.0), 2)));
        System.out.printf("%.2f\n", (startnote * Math.pow(Math.pow(2, 1.0/12.0), 3)));
        System.out.printf("%.2f\n", (startnote * Math.pow(Math.pow(2, 1.0/12.0), 4)));
    } */
    
}
