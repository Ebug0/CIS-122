package Labs;
import java.util.*;
public class Lab6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       //part 1
        double count[] = new double[10];
        int countsize = 0;
        String input = in.nextLine();
        String number = "";
        double max = 0;
        boolean intfound = false;
        for (int i = 0; i<input.length(); i++){
            if(input.charAt(i) == ' ' || i == input.length()-1){
                
                if (i == input.length()-1){
                number += input.charAt(i);
                }
                if (intfound == false){
                    number = "";
                    intfound = true;
                }
                else{
                count[countsize] = Double.parseDouble(number);
                countsize ++;
                number = "";
            }}
            else{
            number += input.charAt(i);
            }
        }
        for(int i = 0; i < countsize; i++){
            if (count[i] > max)
            max = count[i];
        }
        for(int i = 0; i < countsize; i++){
            count[i] = count[i] / max;
        }
        for (int i = 0; i < countsize; i++){
            System.out.printf("%.2f ", count[i]);
            if (i == countsize - 1)
            System.out.println();
        } 

         //part 2
        number = "";
        String idk = in.nextLine();
        System.out.println(idk);
        input = in.nextLine();

        for (int i = input.length()-1; i >= 0; i--){
            number += input.charAt(i);
        }
        if (number.equalsIgnoreCase(input))
        System.out.println("yes");
        else
        System.out.println("no"); 

        //part 3
        boolean firstfound = false;
        int userinput[] = new int[20];
        int userinputcopy[] = new int[20];
        int userinputsize = 0;
        String input2 = in.nextLine();
        String number2 = "";
        for (int i = 0; i < input2.length(); i++){
            if(input2.charAt(i) == ' ' || i == input2.length()-1){
                
                if (i == input2.length()-1){
                number2 += input2.charAt(i);
                }
                if (firstfound == false){
                    number2 = "";
                    firstfound = true;
                }
                else{
                userinput[userinputsize] = Integer.parseInt(number2);
                userinputsize ++;
                number2 = "";
                }
            }
            else
                number2 += input.charAt(i);
        }
        
        for(int i = 0; i < userinputsize; i ++){
            userinputcopy[i] = userinput[i];
        }

        for (int i = 0; i < userinputsize; i ++){

            if(i == userinputsize -1){
                userinput[0] = userinputcopy[i];
            }
            else
            userinput[i+1] = userinputcopy[i];
        }
        for (int i = 0; i < userinputsize; i++){
            System.out.print(userinput[i]+ " ");
        }
        System.out.println();

        in.close();
    }
}
