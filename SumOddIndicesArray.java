
import java.util.Scanner;

public class SumOddIndicesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<n;i+=2){
            sum += arr[i];
        }
        System.out.println("The odd indices is: "+ sum);
    }
}
