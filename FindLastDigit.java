import java.util.Scanner;

public class FindLastDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
    

        int Lastdigit = num%10; 
        System.out.println(Lastdigit);
    }
}
