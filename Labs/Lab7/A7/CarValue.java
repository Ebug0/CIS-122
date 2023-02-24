package Labs.Lab7.A7;
import java.util.Scanner;

public class CarValue {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Car myCar = new Car();
      
      int userYear = scnr.nextInt();
      int userPrice = scnr.nextInt();
      int userCurrentYear = scnr.nextInt();
      
      myCar.setModelYear(userYear);
      myCar.setPurchasePrice(userPrice);
      myCar.calcCurrentValue(userCurrentYear);
      
      System.out.println(myCar.printInfo()); 
      scnr.close();
   }
}
