import java.util.Scanner;

public class ReverseOfTwoDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
            int num1 =num/10; //fisrt number 
            int num2 =num%10; // second number
            int rev = num2*10+num1;
            System.out.println(rev);
        }
    }

