package Mavpass;

public class Nestedloops {
    public static void main(String[] args) {
        int count = 1;
        int run = 0;
        boolean increaseing = true;
        
        while(run < 100){
            
            for (int i = 0; i < count; i ++){
                System.out.print("L");
            }
            System.out.println();
            if (increaseing == true)
            count ++;
            else
            count --;

            if (count> 6)
            increaseing = false;
            if(count == 1)
            increaseing = true;
            

            run++;
        }

    }
}
