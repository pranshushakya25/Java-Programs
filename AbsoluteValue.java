import java.util.Scanner;

public class AbsoluteValue {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int Value = sc.nextInt();
        int AbsoluteValue = 0;

           if (Value < 0){
           AbsoluteValue = -Value;
          System.out.println("Absolute value is " +AbsoluteValue);
     }

    //    int absValue = Math.abs(Value);
    //    System.out.println("AbsoluteValue is " + absValue);
       }
    }
