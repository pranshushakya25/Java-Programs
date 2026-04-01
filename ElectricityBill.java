import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        float total_bill = 0;

        if (units<=100){
            total_bill = units*1;
            System.out.println(total_bill);
        }
        else if (units<=200){
            total_bill = (100*1)+((units-100)*2);
            System.out.println(total_bill);
        }
        else {
            total_bill = ((100*1)+(100*2)+((units-200)*3));
            System.out.println(total_bill);
        }
    }
}
