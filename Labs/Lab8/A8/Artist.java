package Labs.Lab8.A8;

public class Artist {
    // TODO: Declare private fields - artistName, birthYear, deathYear
    private String artistname;
    private int birthyear, deathyear;
   // TODO: Define default constructor
    public Artist(){
        artistname = "unknown";
        birthyear = -1;
        deathyear = -1;
    }
   // TODO: Define second constructor to initialize 
   //       private fields (artistName, birthYear, deathYear)
   public Artist(String name, int birthyear, int deathyear){
    this.artistname = name;
    this.birthyear = birthyear;
    this.deathyear = deathyear;
   }
   // TODO: Define get methods: getName(), getBirthYear(), getDeathYear()
   public String getName(){
    return this.artistname;
   }
   public int getBirthYear(){
    return this.birthyear;
   }
   public int getDeathYear(){
    return this.deathyear;
   }
   // TODO: Define printInfo() method
   //       If deathYear is entered as -1, only print birthYear
   public void printInfo(){
    if (this.deathyear == -1){
        if(this.birthyear == -1){
            System.out.printf("Artist: %s (unknown)",this.artistname);
        }
        else{
            System.out.printf("Artist: %s (%s to present)", this.artistname, this.birthyear);
        }
    }
    else{
        System.out.printf("Artist: %s (%s to %s)",this.artistname, this.birthyear, this.deathyear);
    }
   }
}
