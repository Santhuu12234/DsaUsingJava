import java.io.*;
import java.util.*;

public class TargetComboExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter The Target Value:");
        int target = scanner.nextInt();
        combo("",target);
    }
    public static void combo(String string,int target){
        if(target==0){
            System.out.print(string+"\n");
        }
        for(int i=1;i<=target;i++){
            combo(string+String.valueOf(i),target-i);
        }
    }
}


/*

OUTPUT:

Enter The Target Value:4
1111
112
121
13
211
22
31
4


*/