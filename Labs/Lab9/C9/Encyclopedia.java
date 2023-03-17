package Labs.Lab9.C9;

public class Encyclopedia extends Book {
    // TODO: Declare private fields
  private String edition;
  private int pages;
   
   // TODO: Define mutator methods - 
   //       setEdition(), setNumPages()
   public void setEdition(String newvalue){edition = newvalue;}
   public void setNumPages(int newvalue){pages = newvalue;}
   // TODO: Define accessor methods -
   //       getEdition(), getNumPages()
   public String getEdition(){return edition;}
   public int getNumPages(){return pages;}
   
   // TODO: Define a printInfo() method that overrides 
   //       the printInfo in Book class 
   public void printInfo(){
    super.printInfo();
    System.out.printf("   Edition: %s\n   Number of Pages: %s\n", edition, pages);
   }
}
