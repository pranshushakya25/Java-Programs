import java.util.Scanner;

public class CheckTheMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();

        if (num%10 == 0){
            System.out.println("multiple of 10");
        }
        else{
            System.out.println("Not a multiple of 10");
        }
    }
}
