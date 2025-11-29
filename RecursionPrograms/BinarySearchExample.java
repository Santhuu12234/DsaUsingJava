import java.io.*;
import java.util.*;

public class BinarySearchExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter The Size Of An Array:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for(int i=0;i<size;i++){
            if(i==0){
                System.out.print("\nEnter The 1st Element:");
            }
            else if(i==1){
                System.out.print("Enter The 2nd Element:");
            }
            else if(i==2){
                System.out.print("Enter The 3rd Element:");
            }
            else{
                System.out.print("Enter The "+(i+1)+"th Element:");
            }
            array[i] = scanner.nextInt();
        }
        System.out.print("\nEnter The Search Number:");
        int search = scanner.nextInt();
        System.out.print("\n"+BS(array,search,0));
        System.out.print("\n\n\n\t\t\t\t****Program Completed****\n\n\n");
    }
    static boolean BS(int[] array,int search,int index){
        if(array.length != index){
            if(array[index] == search){
                return true;
            }
            else{
                return false || BS(array,search,index+1);
            }
        }
        else{
            return false;
        }
    }
}


/*

Enter The Size Of An Array:10

Enter The 1st Element:1
Enter The 2nd Element:2
Enter The 3rd Element:3
Enter The 4th Element:4
Enter The 5th Element:5
Enter The 6th Element:6
Enter The 7th Element:7
Enter The 8th Element:8
Enter The 9th Element:9
Enter The 10th Element:10

Enter The Search Number:1

true


                                ****Program Completed****

*/