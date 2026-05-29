import java.util.Scanner;

public class TriangleValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // a,b,c are angles.
        System.out.println("Enter all sides of triangles");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a+b+c==180){
            System.out.println("Triangle is valid");
        }
        else{
            System.out.println("Triangle is not valid");
        }
    }
}
