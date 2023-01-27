package Labs;
import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/*         //Part 1
        System.out.print("Enter in the red value: ");
        int red = in.nextInt();
        System.out.print("\nEnter in the green value: ");
        int green = in.nextInt();
        System.out.print("\nEnter in the blue value: ");
        int blue = in.nextInt();
        int removecolor = 0;
        
        if(red <= green && red <= blue)
        removecolor = red;
        if(green <= red && green <= blue)
        removecolor = green;
        if(blue <= green && blue <= red)
        removecolor = blue;

        red -= removecolor;
        green -= removecolor;
        blue -= removecolor;

        System.out.printf("%d %d %d\n", red, green, blue); */

        //part 2
/*         int testleap = in.nextInt();

        if(testleap % 4 == 0){
            if(testleap % 100 == 0){
                if(testleap % 400 == 0){
                    System.out.println(testleap + " - leap year");
                }
                else
                System.out.println(testleap+ " - not a leap year");
            }
            else
            System.out.println(testleap + " - leap year");
        }
        else
        System.out.println(testleap + " - not a leap year"); */

        // part 3

/*         int highway = in.nextInt();
        
        if(highway<100 && highway != 0){
            if(highway % 2 == 0)
            System.out.printf("I-%d is primary, going east/west.\n",highway);
            else
            System.out.printf("I-%d is primary, going north/south.\n",highway);
        }
        else {
            if(highway % 100 == 0){
            System.out.println(highway+ " is not a valid interstate highway number.");
            return;
        }
        int hundered = highway % 100; 
        if(hundered % 2 == 0)
        System.out.printf("I-%d is auxiliary, serving I-%d, going east/west.\n",highway, hundered);
        else
        System.out.printf("I-%d is auxiliary, serving I-%d, going north/south.\n",highway, hundered);
    } */
    }
}

