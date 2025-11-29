import java.io.*;
import java.util.*;

class FactorialExample{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter The Number To Find Factorial:");
        int n = scanner.nextInt();
        System.out.print("\nThe Factorial Of A Given Number Are:"+findFact(n));
        System.out.print("\n\n\n\t\t\t\t****Program Completed****\n\n\n");
    }
    static int findFact(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
            return n*findFact(n-1);
        }
    }
}

/*

Enter The Number To Find Factorial:10

The Factorial Of A Given Number Are:3628800


                                ****Program Completed****

*/