import java.util.Scanner;

public class CheckEligibleForVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age>=18){
            System.out.println("Eligible for Vote");
        }
        else {
            System.out.println("Not Eligible for Vote");
        }
    }
}
