import java.io.*;
import java.util.*;

public class ProductOfDigitsExample{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter The Number:");
        int n = scanner.nextInt();
        System.out.print("\nThe Product Of The Degits Are:"+sumDigits(n));
        System.out.print("\n\n\n\t\t\t****Program Completed****\n\n\n");
    }
    static int sumDigits(int n){
        if(n<=0){
            return 1;
        }
        else{
            return (n%10) * sumDigits(n/10);
        }
    }
}

/*

OUTPUT:

Enter The Number:12345

The Product Of The Degits Are:120


                        ****Program Completed****


*/