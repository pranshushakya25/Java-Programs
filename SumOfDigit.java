import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();//456(4+5+6)
        int SumOfDigit=0;
        while (number>0){
            int digit = number%10;//6 //5
            number = number/10;//45 //4
            SumOfDigit = SumOfDigit+digit;//6 //5 (6+5)
        }
            System.out.println(SumOfDigit);
    }
}
