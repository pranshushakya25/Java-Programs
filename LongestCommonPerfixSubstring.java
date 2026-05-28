
import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPerfixSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String arr[] = {"flower","flow","fight"};
        String arr[] = {"Hello","Hei","Hey"};
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length-1];
        int minlength = Math.min(first.length(),last.length());
        int count = 0;
        for(int i=0;i<minlength;i++){
            if(first.charAt(i)==last.charAt(i)){
                count++;
            }
            else{
                break;
            }
        }
        System.out.println(first.substring(0,count));
    }
}
