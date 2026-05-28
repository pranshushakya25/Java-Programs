
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the Array elements: ");
        for(int i=0;i<n;i++){
         arr[i] = sc.nextInt();
        }

        // print Array in reverse order;
        for(int i=n-1;i>=0;i--){
            System.out.println("Array in reverse "+ arr[i]);
        }
    }
}
