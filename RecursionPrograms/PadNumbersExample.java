import java.io.*;
import java.util.*;

public class PadNumbersExample{
    public static String[] strings = {"abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter The Numbers:");
        String number = scanner.nextLine();
        comb("",number);
    }
    public static void comb(String string,String number){
        if(number.isEmpty()){
            System.out.print(string+"\n");
            return;
        }
        int digit = number.charAt(0)-'0';
        String letters = strings[digit-1];
        for(int i=0;i<letters.length();i++){
            comb(string+letters.charAt(i),number.substring(1));
        }
    }
}