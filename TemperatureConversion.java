import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in calsius");
        double calsius = sc.nextDouble();

        double fahrenheit = (calsius*9/5)+32;
        System.out.println("Temperature in fahrenheit "+ fahrenheit);
    }
}
