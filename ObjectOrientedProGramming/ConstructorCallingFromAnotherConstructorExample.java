import java.io.*;
import java.util.*;

public class ConstructorCallingFromAnotherConstructorExample {
    public static void main(String[] args){
        Star s = new Star();
    }
}
class Star{
    Star(){
        this(10);
    }
    Star(int n){
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


/*


OUTPUT:

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


*/