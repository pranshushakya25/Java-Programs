import java.util.Scanner;

public class NumberIsThreeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num>=100 && num<=1000){
            System.out.println(num+ " is a three digit number");
        }
        else{
            System.out.println(num+ " is not a three digit number");
        }
    }
}
