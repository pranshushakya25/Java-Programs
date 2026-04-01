import java.util.Scanner;

public class NumberIsTwoDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num>=10 && num<=99){
            System.out.println("Given number is two digit number");
        }
        else {
            System.out.println("Given number is Not a two digit number");
        }
    }
}
