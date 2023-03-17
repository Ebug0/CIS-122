package Labs.Lab9.B8;

public class OfferedCourse extends Course {
   // TODO: Declare private fields
private String professorname, location, classtime;

      // TODO: Define mutator methods -
   //      setInstructorName(), setLocation(), setClassTime()
    public void setInstructorName(String newvalue){professorname = newvalue;}
    public void setLocation(String newvalue){location = newvalue;}
    public void setClassTime(String newvalue){classtime = newvalue;}

   // TODO: Define accessor methods -
   //      getInstructorName(), getLocation(), getClassTime()
   public String getInstructorName(){return professorname;}
   public String getLocation(){return location;}
   public String getClassTime(){return classtime;}
}
