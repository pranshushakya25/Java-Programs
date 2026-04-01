
import java.util.Scanner;

public class UsingAscllCheckUppercaseAndLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int ascll = (int)ch;

        if (ascll>=65 && ascll<=90){
            System.out.println("The Character is Uppercase");
        }
        else if (ascll>=97 && ascll<=122){
            System.out.println("The Character is Lowercase");
        }
        else {
            System.out.println("Not a Alphabet");
        }
    }
}
