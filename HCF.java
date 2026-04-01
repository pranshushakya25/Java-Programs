import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;
public class HCF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int min = num1<num2?num1:num2;
        for(int i=min;i>=1;i--){
            if(num1%1==0 && num2%1==0){
                System.out.println(i);
                return;
            }
        }
    }
}
