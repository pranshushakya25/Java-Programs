import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrInt[] = new int[5];
        // arrInt[0] = 21;
        // arrInt[1] = 34;
        // arrInt[2] = 78;
        // arrInt[3] = 89;
        // arrInt[4] = 456;

        for(int index=0;index<arrInt.length;index++){
            arrInt[index] = sc.nextInt();
        }
        for(int index=0;index<arrInt.length;index++){
             System.out.println(arrInt[index]+" ");
         }
    }
}
