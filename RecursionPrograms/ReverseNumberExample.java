import java.io.*;
import java.util.*;

public class ReverseNumberExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter The Number:");
        int n = scanner.nextInt();
        System.out.print(reverseNumber(n));
    }
    static int sum = 0;
    static int reverseNumber(int n){
        if(n<=0){
            return sum;
        }
        else{
            sum = sum*10 + n%10;
            return reverseNumber(n/10);
        }
    }
}


/*
OUTPUT:

Enter The Number:123123123
321321321



*/