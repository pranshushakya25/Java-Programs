import java.util.Scanner;
public class PatternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for (int row=0;row<n;row++){
            for (int colspace=0;colspace<n-1-row;colspace++){
            System.out.println("  ");
            }
            for (int colStar=0;colStar<=row;colStar++){
                System.out.println("*");
            }
                System.out.println();
            }
        }

    }
    

