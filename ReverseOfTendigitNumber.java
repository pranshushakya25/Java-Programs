import java.util.Scanner;

public class ReverseOfTendigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        long reverse = 0;

        while(num!=0){
            long digit = num%10; // Get the last digit 
            reverse = reverse*10+digit; // add digit to reverse
             num = num/10; // remove last digit
        }
             System.out.println("Reverse no is " + reverse);
             sc.close();
        }
    }

