package Labs.Lab9.B8;

public class Course {
   // TODO: Declare private fields
    private String coursenumber, coursetitle;

   // TODO: Define mutator methods - 
   //       setCourseNumber(), setCourseTitle()
    public void setCourseNumber(String newvalue){coursenumber = newvalue;}
    public void setCourseTitle(String newvalue){coursetitle = newvalue;}

   // TODO: Define accessor methods - 
   //       getCourseNumber(), getCourseTitle()
   public String getCourseNumber(){return coursenumber;}
   public String getCourseTitle(){return coursetitle;}

   // TODO: Define printInfo()
    public void printInfo(){
        System.out.printf("Course Information:\n   Course Number: %s\n   Course Title: %s\n",coursenumber, coursetitle);
    }
}
