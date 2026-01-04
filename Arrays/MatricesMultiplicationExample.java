import java.io.*;
import java.util.*;

public class MatricesMultiplicationExample {
    public static int[][] M1 = new int[3][3];
    public static int[][] M2 = new int[3][3];
    public static void display(int[][] matrix){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter Element:");
                M1[i][j] = scanner.nextInt();
            }
        } 
        System.out.print("\n");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter Element:");
                M2[i][j] = scanner.nextInt();
            }
        }
        System.out.print("\n\nThe Marix1 are:\n");
        display(M1);
        System.out.print("\n\nThe Marix2 are:\n");
        display(M2);
        int[][] result = new int[3][3];
        System.out.print("\nMultiplication Of Two Matrices Are:\n");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    result[i][j]+=M1[i][k]*M2[k][j];
                }
            }
        }
        display(result);
    }
}
