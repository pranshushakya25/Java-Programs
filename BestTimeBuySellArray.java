
import java.util.Scanner;

public class BestTimeBuySellArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = {7,1,5,3,6,4};
        int maxprofit = 0;
        for(int buy=0;buy<nums.length;buy++){
            for(int sell=buy+1;sell<nums.length;sell++){
                int profit = nums[sell]-nums[buy];
                if(profit>maxprofit){
                    maxprofit = profit;
                }
            }
        }
        System.out.println("The max profit is: " +maxprofit);
    }
}