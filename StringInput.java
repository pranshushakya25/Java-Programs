
import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // String str = sc. next();
        // System.out.println(str); 
        // System.out.println(str.charAt(0));
        // System.out.println(str.charAt(1));
        // System.out.println(str.charAt(2));
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
        // Reverse print
        // for(int i=str.length()-1;i>=0;i--){
        //     System.out.println(str.charAt(i));
        // }

    }
}