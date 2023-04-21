package Labs.Lab14;

public class B14 {
    private String firstName;
   private String lastName;

   public B14(String fn, String ln) {
	   firstName = fn;
	   lastName = ln; 
   }

   public String toString()
   {
      return lastName + ", " + firstName;
   }

   public int hashCode()
   {
   	// TODO: change this to return a combined hash code of the instance variables
      return firstName.hashCode() + lastName.hashCode();
   }

   public boolean equals(Object object)
   {
      // TODO: change this to test whether two Person objects are equal 
      if(this.hashCode() == object.hashCode()){
        return true;
      }
      else{
        return false;
      }
   }
}
