import java.util.Scanner;

public class CharacterIsDigitOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);

        if (ch >= '0' && ch <= '9'){
            System.out.println(ch+ " is a Digit");
        }
        else{
            System.out.println(ch+ " is not a Digit");
        }
    }
}
