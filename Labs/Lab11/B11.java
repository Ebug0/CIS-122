package Labs.Lab11;

public class B11 {
    public static int reverseInt(int value)
    {
       int reverseofvalue, lastdigit, numofdigit,exponent;

       if (value < 10){
        return value;
       }        
       else{
        lastdigit = value % 10;
        numofdigit = numberOfDigits(value / 10);
        reverseofvalue = reverseInt(value / 10);
        exponent = powerOfTen(numofdigit);
        return reverseofvalue + (lastdigit * exponent);
       }
    }
 
 // uncomment and complete this method
    public static int powerOfTen(int exponent)
    {
       if (exponent <= 0) 
            return 1;
       else 
            return 10 * powerOfTen(exponent - 1);
    }
 
 
 // uncomment and complete this method
    public static int numberOfDigits(int value)
    {
       if (value < 10) 
            return 1;
       else 
            return 1 + numberOfDigits(value / 10);
    }
    
    public static void main(String[] args) {
        System.out.println(reverseInt(3456));
        //System.out.println(powerOfTen(3));
        //System.out.println(numberOfDigits(345));
    }
}
