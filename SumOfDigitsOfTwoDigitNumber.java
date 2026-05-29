import java.util.Scanner;

public class SumOfDigitsOfTwoDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        int digit = num%10;
        num = num/10;
        sum = digit + num;

        System.out.println(sum);
    }
}
