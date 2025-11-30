import java.io.*;
import java.util.*;

public class IsSortedArrayOrNotExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter The Size Of An Array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            if(i==0){
                System.out.print("\nEnter The 1st Number:");
            }
            else if(i==1){
                System.out.print("Enter The 2nd Number:");
            }
            else if(i==2){
                System.out.print("Enter The 3rd Number:");
            }
            else{
                System.out.print("Enter The "+(i+1)+"th Number:");
            }
            array[i] = scanner.nextInt();
        }
        System.out.print("\nIs Sorted Array:"+isSortedArray(array,0,size));
    }
    static boolean isSortedArray(int[] array,int index,int size){
        if(index<size-1){
            if(array[index]>array[index+1]){
                return false;
            }
            else{
                return true && isSortedArray(array,index+1,size);
            }
        }
        else{
            return true;
        }
    }
}


/*

OUTPUT:

Enter The Size Of An Array:10

Enter The 1st Number:1
Enter The 2nd Number:2
Enter The 3rd Number:3
Enter The 4th Number:4
Enter The 5th Number:5
Enter The 6th Number:6
Enter The 7th Number:7
Enter The 8th Number:8
Enter The 9th Number:9
Enter The 10th Number:10

Is Sorted Array:true


*/