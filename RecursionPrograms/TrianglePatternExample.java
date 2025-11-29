import java.io.*;
import java.util.*;

public class TrianglePatternExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter The Size Of Triangle:");
        int n = scanner.nextInt();
        System.out.print("\n");
        triangle(n);
    }
    static int count = 0;
    static void triangle(int n){
        count++;
        if(n == count){
            System.out.print("\n\n\n\t\t\t****Program Completed****\n\n\n");
        }
        else{
            for(int i = 0;i<n-count;i++){
                System.out.print(" ");
            }
            for(int i = 0;i<2*count-1;i++){
                if(i%2==1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.print("\n");
            triangle(n);
        }
    }
}


/*

OUTPUT:

Enter The Size Of Triangle:10

         *
        * *
       * * *
      * * * *
     * * * * *
    * * * * * *
   * * * * * * *
  * * * * * * * *
 * * * * * * * * *



                        ****Program Completed****

*/
