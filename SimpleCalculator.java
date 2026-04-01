import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        char op = sc.next().charAt(0); // why we don't use "nextline"
        double num2 = sc.nextDouble();
         
        if (op == '+'){
            System.out.println("Result " + (num1+num2));
        }
        else if (op == '-'){
            System.out.println("result " + (num1-num2));
        }
        else if (op == '*'){
            System.out.println("Result " + (num1*num2));
        }
        else if (op == '/'){
            System.out.println("Result " + (num1/num2));
        }
        else {
            System.out.println("Invalid operator");
        }
    }
}
