package Labs.Lab9.A9;
import java.util.Scanner;

public class Petinformation {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    Pet myPet = new Pet();
    Cat myCat = new Cat();
    
    String petName = in.nextLine();
    int petAge = in.nextInt();
    String catName = in.nextLine();
    int catAge = in.nextInt();
    String catBreed = in.nextLine();

      // TODO: Create generic pet (using petName, petAge) and then call printInfo       
      myPet.setAge(petAge);
      myPet.setName(petName);
      myPet.printInfo();
      // TODO: Create cat pet (using catName, catAge, catBreed) and then call printInfo
      myCat.setBreed(catBreed);
      myCat.setAge(catAge);
      myCat.setName(catName);
      myCat.printInfo();
      // TODO: Use getBreed(), to output the breed of the cat
      System.out.println("   Breed: "+myCat.getBreed()); 
      in.close();
}}
