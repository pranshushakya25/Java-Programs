import java.util.Scanner;

public class SumAndAverageOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int nums []= new int[size];
        int sum =0;
        double avg = 0;
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        sum += nums[i];
        avg = (double)sum/size;
        }
        System.out.println("The sum is "+ sum);
        System.out.println("The avg is "+ avg);
    }
}
