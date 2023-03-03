package Labs.Lab8.A8;

public class Artwork {
       // TODO: Declare private fields - title, yearCreated
   private String title;
   private int yearcreated;
   // TODO: Declare private field artist of type Artist 
   private Artist artist;
   // TODO: Define default constructor
   public Artwork(){
    this.title = "unknown";
    this.yearcreated = -1;
   }
   // TODO: Define get methods: getTitle(), getYearCreated()
public String getTitle(){
    return this.title;
}
public int getYearCreated(){
    return this.yearcreated;
}
   // TODO: Define second constructor to initialize 
   //       private fields (title, yearCreated, artist)
public Artwork(String title, int yearCreatet, Artist artist){
    this.title = title;
    this.yearcreated = yearCreatet;
    this.artist = artist;
}
   // TODO: Define printInfo() method
   //       Call the printInfo() method in Artist.java to print an artist's information                                                                                          
    public void printInfo(){
        this.artist.printInfo();
        if(yearcreated == -1){
            System.out.printf("\nTitle: %s, unknown\n", this.title);
        }
        else{
            System.out.printf("\nTitle: %s, %s\n", this.title, this.yearcreated);
        }
    }
}
