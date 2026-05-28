import java.util.Scanner;

public class ReplaceIndicesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                arr[i] = -1;
            }
            else{
                arr[i] = 1;
            }
        }
        for(int i=0;i<n;i++){
        System.out.println("Updated Array: "+ arr[i] +" ");
        }
        sc.close();
    }
}
