
import java.util.Scanner;

public class SumOfDigitsOfThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;

        while(num > 0){
            int digit = num%10; // get last digit
            sum = sum + digit; // add digit to sum
            num = num/10;     // remove last digit
        }
        System.out.println(sum);
    }
}
