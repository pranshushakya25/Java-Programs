
import java.util.Scanner;

public class PrimeNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int nums[] = new int[size];
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt(); 
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
            if (nums[i]%1==0 && nums[i]%nums[i]==0 && nums[i]%nums[j]!=0){
            System.out.println(nums[i]+ " is a prime number");
           }
            else{
            System.out.println(nums[i]+ " is not a prime number");
              }
           }
        }
    }
}
