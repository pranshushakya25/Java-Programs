
import java.util.Scanner;

public class CountVowelAndConsonantString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = " I am a pranshu ";
        str = str.toLowerCase();
        int countvow = 0;
        int countcon = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    countvow++;
                }
                else{
                    countcon++;
                }
            }
        }
        System.out.println("Total no of vowels "+ countvow);
        System.out.println("Total no of consonants "+countcon);
    }
}
