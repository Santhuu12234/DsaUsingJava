import java.io.*;
import java.util.*;

class Pattern{
    public Pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public Pattern(int l,int b){
        for(int i=0;i<l;i++){
            for(int j=0;j<b;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public Pattern(){
        int n=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<2*n-2*i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
public class ConstructorOverloadingExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Pattern triangle;
        Pattern rectangle;
        Pattern diamond;
        while(true){
            System.out.print("\nEnter Your Choice\n1.Triangle\n2.Rectangle\n3.Diamond\n4.Exit\nAns:");
            int ch = scanner.nextInt();
            switch(ch){
                case 1:new Pattern(10);
                    break;
                case 2:new Pattern(5,20);
                    break;
                case 3:new Pattern();
                    break;
                case 4:System.exit(0);
                default:
                    System.out.print("\n!!!...Invalid Choice...!!!\n");
                    break;
            }   
        }
    }
}


/*

OUTPUT:

Enter Your Choice
1.Triangle
2.Rectangle
3.Diamond
4.Exit
Ans:1

         *
        ***
       *****
      *******
     *********
    ***********
   *************
  ***************
 *****************

Enter Your Choice
1.Triangle
2.Rectangle
3.Diamond
4.Exit
Ans:2
********************
********************
********************
********************
********************

Enter Your Choice
1.Triangle
2.Rectangle
3.Diamond
4.Exit
Ans:3
          *
         ***
        *****
       *******
      *********
     ***********
    *************
   ***************
  *****************
 *******************
 *******************
  *****************
   ***************
    *************
     ***********
      *********
       *******
        *****
         ***
          *

Enter Your Choice
1.Triangle
2.Rectangle
3.Diamond
4.Exit
Ans:4

*/