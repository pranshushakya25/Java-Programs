
import java.util.Scanner;

public class IdentityMatrix {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
         System.out.print("Enter number of Rows: ");
         int rows = sc.nextInt();
         System.out.print("Enter numbers of columns: ");
         int cols = sc.nextInt();

         int matrix [][] = new int[rows][cols];

         System.out.println("Enter the matrix elements: ");
         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix [i][j] = sc.nextInt();
            }
         }
         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j] +" ");
            } 
            System.out.println();
        }  
         boolean isIdentity = true;
         if(rows != cols){
            isIdentity = false;
         }
         else{
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                  if(i == j && matrix[i][j] != 1){
                    isIdentity = false;
                  }
                  if(i != j && matrix[i][j] != 0){
                    isIdentity = false;
                  }
                }
            }
         }
         if(isIdentity){
            System.out.println( "Matrix is a Identity Matrix");
         }
         else{
            System.out.println( "Matrix is Not a Identity Matrix");
         }
     }    
}
