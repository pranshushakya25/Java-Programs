import java.util.Scanner;

public class LeftShiftArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        } 

        // store first element
        int first = 0;

        // left shift by 1 position;
        for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        //  put first element at the End;
        arr[n-1] = first;

        System.out.println("Array after left shift by one position: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
