
import java.util.Scanner;

public class VowelCountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sentence: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int countvow = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    countvow++;
                }
            }
        }
        System.out.println("Number of vowels are " + countvow);
    }
}
