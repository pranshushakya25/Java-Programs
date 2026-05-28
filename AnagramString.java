import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // string s1 = "cat";
        // string s2 = "tac";
        System.out.print("Enter s1 word: ");
        String s1 = sc.nextLine();
        System.out.print("Enter s2 word: ");
        String s2 = sc.nextLine();
        int s1Freq[] = new int[26];
        int s2Freq[] = new int[26];
         if(s1.length() != s2.length()){
            System.out.println("Not Anagram");
            return;
         }
         for(int i=0;i<s1.length();i++){
            s1Freq[s1.charAt(i)-'a']++;
         }
         for(int i=0;i<s2.length();i++){
            s2Freq[s2.charAt(i)-'a']++;
         }
         for(int i=0;i<26;i++){
            if(s1Freq[i] != s2Freq[i]){
                System.out.println("Not Anagram");
                return;
            }
         }
         System.out.println("Anagram");
    }
}
