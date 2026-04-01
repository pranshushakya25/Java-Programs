import java.util.Scanner;

public class FindFirstDigit {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int FirstDigit = num/100;
        System.out.println(FirstDigit);
     }
}