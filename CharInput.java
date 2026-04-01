import java.util.Scanner;

public class CharInput {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    // int number = sc.nextInt();
    // System.out.println(number);
    char characterInput = sc.nextLine().charAt(0);
    System.out.println(" user given character is "+ characterInput);
}
}
