package Labs.Lab11.A11;

public class Animals {
     /**
      Describes the given animal.
      @param pet an animal
      @return a string with the animal's name, a space, and 
      either the trick that the animal knows (if it is a dog) or a 
      string "has no tricks"
   */
   public static String describe(Animal pet)
   {
      // TODO: Complete this method
      if (pet instanceof Dog){
        Dog newpet = (Dog) pet;
        return "" + newpet.getName() + " " + newpet.getTrick() +"";
      }
      else{
        return "" + pet.getName() + " has no tricks";
      }
   }

   // This method is used to check your work
   public static String check(String name, String trick) 
   { 
      Animal pet;
      if (trick == null) pet = new Cat(name);
      else pet = new Dog(name, trick);
      return describe(pet); 
   }      
}
