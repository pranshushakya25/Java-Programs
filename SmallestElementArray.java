
import java.util.Scanner;

public class SmallestElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size  = sc.nextInt();
        int nums[] = new int[size];
        for(int i=0;i<nums.length;i++){
          nums[i] = sc.nextInt();
        }
        int Element = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
        if(nums[i]<Element){
            Element = nums[i];
           }
        }
        System.out.println("The smallest Element is : " +Element);
    }
}
