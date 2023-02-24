package Labs.Lab7.B7;
import java.util.Scanner;
public class TriangleArea {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();
    double tri1base = in.nextDouble();
    double tri1height = in.nextDouble();
    double tri2base = in.nextDouble();
    double tri2height = in.nextDouble();

      
      triangle1.setBase(tri1base);
      triangle1.setHeight(tri1height);
     
      triangle2.setBase(tri2base);
      triangle2.setHeight(tri2height);
      
      System.out.println("Triangle with smaller area:");
      
    
      if(triangle1.getArea() < triangle2.getArea())
        triangle1.printInfo();
    else
    triangle2.printInfo();

      
      in.close();
   }
}
