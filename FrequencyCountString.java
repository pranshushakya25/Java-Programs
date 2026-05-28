import java.util.Scanner;

public class FrequencyCountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Pranshu";
        str = str.toLowerCase();
        int arr [] = new int[26];
        
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']++;
        }
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)-'a']!=1){
                System.out.println(str.charAt(i)+" count/frequecy is " + arr[str.charAt(i)-'a']);
                arr[str.charAt(i)-'a']= -1;
            }
        }
    }
}
