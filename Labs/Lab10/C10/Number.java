package Labs.Lab10.C10;

public class Number {
    private int num;
   
   public Number(int n) {
      num = n;
   }

   /* Type your code here */
   public String toString(){
    return "The value is "+num;
   }

   public int getNum() {
      return num;
   }
   
   public void setNum(int n) {
      num = n;
   }

   public static void main(String [] args) {
      Number yourNum = new Number(723);
      System.out.print(yourNum);
   }
}
