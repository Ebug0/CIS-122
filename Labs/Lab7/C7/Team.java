package Labs.Lab7.C7;
public class Team {
    private String name = "";
    private int wins = 0;
    private int losses = 0;
    

    public void setName(String newname){
        name = newname;
    }
    public void setWins(int newvalue){
        wins = newvalue;
    }
    public void setLosses(int newvalue){
        losses = newvalue;
    }
    

    public String getName(){
        return name;
    }
    public int getWins(){
        return wins;
    }
    public int getLosses(){
        return losses;
    }
    

    public double getWinPercentage(){
        double totalmatch = wins + losses;
        double output = (wins/totalmatch);
        return output;
    }
    
   
    public void printStanding(){
        System.out.printf("Win percentage: %.2f\n",getWinPercentage());
        if (getWinPercentage() < 0.5)
        System.out.printf("Team %s has a losing average.",name);
        else
        System.out.printf("Congratulations, Team %s has a winning average!",name);
    }
 }