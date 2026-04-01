import java.util.Scanner;

public class PivotIndexArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[]={1,7,3,6,5,6};
        int totalsum = 0;
        for (int i=0;i<nums.length;i++){
            totalsum=nums[i];
        }
        int leftsum=0;
        int rightsum=0;
        for(int pi=0;pi<nums.length;pi++){
            rightsum = totalsum-leftsum-nums[pi];
            if(leftsum==rightsum){
                System.out.println("Povit Index " +pi);
            }
            else{
                System.out.println("Pivot Index Not found ");
            }
        }
    }
}
