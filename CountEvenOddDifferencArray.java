
import java.util.Scanner;

public class CountEvenOddDifferencArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int Evencount = 0;
        int Oddcount = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                Evencount++;
            }
            else{
                Oddcount++;
            }
        }
        int AbosulteDiffernce = Math.abs(Evencount - Oddcount);
        System.out.println("The number of Even elements is: "+ Evencount);
        System.out.println("The number of Odd elements is: "+ Oddcount);
        System.out.println("The Absolute Difference is: "+ AbosulteDiffernce);
    }
}
