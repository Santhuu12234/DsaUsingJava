import java.io.*;
import java.util.*;

public class RightAngleTriangleExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter The Size Of Triangle:");
        int size = scanner.nextInt();
        printTriangle(0,size);
    }
    static void printTriangle(int i,int n){
        
        if(n!=0){
            if(i<n){
                System.out.print("*");
                printTriangle(i+1,n);
            }
            else{
                System.out.print("\n");
                printTriangle(0,n-1);
            }
        }
    }
}


/*

OUTPUT:

Enter The Size Of Triangle:10
**********
*********
********
*******
******
*****
****
***
**
*


*/