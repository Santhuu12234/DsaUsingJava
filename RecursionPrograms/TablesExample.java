import java.io.*;
import java.util.*;

public class TablesExample {
    static int count = 0;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter The Table:");
        int n = scanner.nextInt();
        System.out.print("\nThe Table Are:\n");
        findTable(n);
        System.out.print("\n\n\n\t\t\t\t****Program Completed****\n\n\n");
    }
    static int findTable(int n){
        if(count >= 10){
            return 0;
        }
        else{
            count++;
            System.out.print("\n"+n+"x"+count+"="+n*count);
            return findTable(n);
        }
    }
}


/*

OUTPUT:

Enter The Table:10

The Table Are:

10x1=10
10x2=20
10x3=30
10x4=40
10x5=50
10x6=60
10x7=70
10x8=80
10x9=90
10x10=100


                                ****Program Completed****

*/