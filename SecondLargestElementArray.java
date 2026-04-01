
public class SecondLargestElementArray {
    public static void main(String[] args) {
        int nums[] = {23,456,67,89,655,887,5456,223,-22,-56,-788};
        int Firstmax = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for (int i=0;i<nums.length;i++){
            if(nums[i]>Firstmax){
                Firstmax = nums[i];
            }
        }
        for (int i=0;i<nums.length;i++){
            if(nums[i]>secondmax && nums[i]!= Firstmax){
                secondmax = nums[i];
            }
        }
        System.out.println(secondmax);
    }
}
