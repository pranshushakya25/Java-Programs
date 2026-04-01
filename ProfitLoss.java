import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the cost price:");
        int costprice = sc.nextInt();
        System.out.println("Give the selling price:");
        int sellingprice = sc.nextInt();

        if (sellingprice > costprice){
            System.out.println("They are in Profit");
        }
        else if (sellingprice < costprice){
            System.out.println("They are in Loss");
        }
        else {
            System.out.println("No, Profit or Loss");
        }
    }
}
