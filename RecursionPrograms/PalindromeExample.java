import java.io.*;
import java.util.*;

public class PalindromeExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter The Number:");
        int n = scanner.nextInt();
        System.out.print(palindrome(n));
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
    static boolean palindrome(int n){
        if(n == reverseNumber(n)){
            return true;
        }
        else{
            return false;
        }
    }
}

/*

Enter The Number:121121
true

*/
