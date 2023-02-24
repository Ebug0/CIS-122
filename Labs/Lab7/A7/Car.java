package Labs.Lab7.A7;
public class Car {
    private int modelYear; 
    private int purchasePrice;
    private int currentValue;
    
    public void setModelYear(int userYear){
       modelYear = userYear;
    }
    
    public int getModelYear() {
       return modelYear;
    }
    
    public void setPurchasePrice(int newprice){
        purchasePrice = newprice;
    }

    public int getPurchasePrice(){
        return purchasePrice;
    }
    
    public void calcCurrentValue(int currentYear) {
       double depreciationRate = 0.15;
       int carAge = currentYear - modelYear;
       
       // Car depreciation formula
       currentValue = (int) Math.round(purchasePrice * Math.pow((1 - depreciationRate), carAge));
    }
    
    public String printInfo(){
        return "Car's informatin:\n  Model year: "+modelYear+"\n  Purchase price: $"+purchasePrice+"\n  Current value: $"+currentValue;
    }
   
 }