import java.io.*;
import java.util.*;

public class CallByValueExample{
    public static void change(int a){
        a = 30;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Value Of 'a':");
        int a = scanner.nextInt();
        System.out.print("\nThe Value Of 'a' Before Changing:"+a);
        change(a);
        System.out.print("\nThe value Of 'a' After Changing:"+a);
        System.out.print("\n\n\n\n");
    }
}

/*

OUTPUT:
Enter The Value Of 'a':20

The Value Of 'a' Before Changing:20
The value Of 'a' After Changing:20


*/