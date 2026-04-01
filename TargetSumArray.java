import java.util.Scanner;

public class TargetSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int len = sc.nextInt();
        int nums[] = new int[len];
        for(int i=0;i<len;i++){
             nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int Targetsum = sc.nextInt();
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if (nums[i]+nums[j]==Targetsum){
                    System.out.println("The two Numbers are " +nums[i]+" and "+nums[j]);
                }
            }
        }
    }
}
