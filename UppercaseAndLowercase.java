import java.util.Scanner;

public class UppercaseAndLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        if (ch >= 'A' && ch <= 'Z'){
            System.out.println(ch+ " Uppercase");
        }
        else if (ch >= 'a' && ch <= 'z'){
            System.out.println(ch+ " Lowercase");
        }
        else {
            System.out.println("Not a alphabet");
        }
    }
}
