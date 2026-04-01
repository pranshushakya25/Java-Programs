
import java.util.Scanner;

public class MaximumAndMinimumElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        int nums[] = new int[size];
        for(int i=0;i<nums.length;i++){
          nums[i] = sc.nextInt();
        }
        int max = 0;
        int min = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                max = nums[i];
            }
            if(nums[i]<0){
                min = nums[i];
            }
        }
        System.out.println("Maximum value is " +max);
        System.out.println("Minimum Value is " +min);
    }
}
