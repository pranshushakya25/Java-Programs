import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // size of Array;
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int arr [] = new int[size];

        // Input elements;
        System.out.print("Enter "+ size +" elements: ");  
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        // print elements
        for(int i=0;i<size;i++){
            System.out.println("Array elements are: "+ arr[i]);
        }
    }
}
