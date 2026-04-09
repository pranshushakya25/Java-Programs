
import java.util.Scanner;

public class SparseMatrix2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of cols: ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];
         
        int zeroCount = 0;
        int totalElements = rows*cols;

        System.out.println("Enter the elements of matrix");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();

                if(matrix[i][j] == 0){
                    zeroCount++;
                } 
            }
        }
        if(zeroCount >= totalElements/2){
            System.out.println("The matrix is a Sparse matrix");
        }
        else{
            System.out.println("The matrix is Not a sparse matrix");
        }
    }
}
