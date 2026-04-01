import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle ");
        double radius = sc.nextDouble();

        double Perimeter  = (2*Math.PI*radius);
        System.out.println("Perimeter of circle is "+ Perimeter);
    }
}