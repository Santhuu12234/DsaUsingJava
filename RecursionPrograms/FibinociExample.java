import java.io.*;
import java.util.*;

public class FibinociExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Up To:");
        int n = scanner.nextInt();
        System.out.print("\nThe Febinoci Numbers Are:");
        int n1 = 0;
        int n2 = 1;
        System.out.print("\n"+"0"+"\t"+"1");
        findFebinoci(n,n1,n2);
        System.out.print("\n\n\n\t\t\t\t****Program Completed****\n\n\n");
    }
    static void findFebinoci(int n,int n1,int n2){
        if(n2 > n){
            return;
        }
        else{
            int temp = n1;
            n1 = n2;
            n2 = temp + n2;
            System.out.print("\t"+n2);
            findFebinoci(n, n1, n2);
        }
    }
}


/*

OUTPUT:


Enter Up To:100

The Febinoci Numbers Are:
0       1       1       2       3       5       8       13      21      34 55       89      144


                                ****Program Completed****


*/