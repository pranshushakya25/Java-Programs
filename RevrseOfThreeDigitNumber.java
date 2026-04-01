import java.util.Scanner;

public class RevrseOfThreeDigitNumber {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int rev = 0;
     
        int num1 = num/100; // first number 
        int num2 = (num/10)%10; // second number 
        int num3 = num%10; // third number 
        rev = num3*100+num2*10+num1;
        System.out.println(rev); 
    }
}
