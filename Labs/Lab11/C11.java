package Labs.Lab11;

public class C11 {
    public static int reverseInt(int value)
    {   
       return reverseIntHelper(value, 0);
    }
 
    public static int reverseIntHelper(int partialValue, int partialReversedValue)
    {
    if (partialValue <= 0){
        return partialReversedValue;
    }
    else{
       int lastdigit = partialValue % 10;
       return reverseIntHelper(partialValue / 10, (partialReversedValue * 10) + lastdigit);
    }
    }
    public static void main(String[] args) {
        System.out.println(reverseInt(3456));
    }
}
