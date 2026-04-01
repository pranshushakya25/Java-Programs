public class LargestElementArray {
    public static void main(String[] args) {
        int nums[] = {-2 ,12 , 234, 666,567,2657,12};
        int Element = Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            if (nums[i]>Element){
                Element = nums[i];
            }
        }
        System.out.println(Element);
    }
}
