
import java.util.Scanner;

public class NumberOfPositiveAndNegativeElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size  = sc.nextInt();
        int nums[] = new int[size];
        int ncount = 0;
        int pcount =0;
        for(int i=0;i<nums.length;i++){
        nums[i] = sc.nextInt();
        }
        for(int i=0;i<nums.length;i++){
            if (nums[i]>0){
                pcount++;
            }
            else{
                ncount++;
            }
        }       
        System.out.println("Number of Positive Elements " +pcount); 
        System.out.println("Number of Negative Elements" +ncount);
    }
}
