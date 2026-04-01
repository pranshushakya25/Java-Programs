import java.util.Scanner;

public class CheckDivisibility {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();
              
            if (num%3==0 && num%7==0){
                System.out.println("Number is divible by 3 & 7");
            }
            else {
                System.out.println("Number is not divisible");
            }
    }
}
