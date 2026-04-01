import java.util.Scanner;
public class fibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int firstNum = 0;
        int secNum = 1;
        for (int i=0;i<=n;i++){
         System.out.println(firstNum+" ");
         int sum = firstNum + secNum;
        firstNum = secNum;
        secNum = sum;
        }
    }
}
