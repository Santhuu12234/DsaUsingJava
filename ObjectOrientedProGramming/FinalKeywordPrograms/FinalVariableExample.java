import java.io.*;
import java.util.*;

public class FinalVariableExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter The Number:");
        final int a = scanner.nextInt();
        int b = 20;
        a = b;
    }
}
