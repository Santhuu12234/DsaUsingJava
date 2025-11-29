import java.io.*;
import java.util.*;

public class NumbersExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter The Up To:");
        int n = scanner.nextInt();
        System.out.print("\nThe Numbers Are:\n");
        findNumbers(n);
        System.out.print("\n\n\n\t\t\t\t****Program Completed****\n\n\n");
    }
    static void findNumbers(int n){
        if(n<=0){
            return; //Base Condition
        }
        else{
            findNumbers(n-1);
        }
        System.out.print("\n"+n);
    }
}


/*

OUTPUT:

The Numbers Are:

1
2
3
4
5
6
7
8
9
10


                                ****Program Completed****
                                
*/