import java.io.*;
import java.util.*;

public class CountZerosExample {
    static int count = 0;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter The Number:");
        int n = scanner.nextInt();
        System.out.print("\nThe No Of Zeros:"+countZeros(n));
    }
    static int countZeros(int n){
        if(n<=0){
            return count;
        }
        else if(n%10 == 0){
            count++;
            return countZeros(n/10);
        }
        else{
            return countZeros(n/10);
        }
    }
}


/*

OUTPUT:

Enter The Number:10101010

The No Of Zeros:4


*/