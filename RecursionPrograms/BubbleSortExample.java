import java.io.*;
import java.util.*;

public class BubbleSortExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter The Size Of An Array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("\nEnter The Array Elements:\n");
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
        bubbleSort(array,0,array.length);
    }
    static void bubbleSort(int[] array,int i,int len){
        if(len!=1){
            if(i<len-1){
                if(array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp; 
                }
                bubbleSort(array,i+1,len);
            }
            else{
                bubbleSort(array,0,len-1);
            }
        }
        else{
            System.out.print("\n\n"+Arrays.toString(array));
        }
    }

}

    
/*

OUTPUT:

Enter The Size Of An Array:10

Enter The Array Elements:

Enter The 1st Element:2
Enter The 2nd Element:3
Enter The 3rd Element:1
Enter The 4th Element:9
Enter The 5th Element:8
Enter The 6th Element:5
Enter The 7th Element:6
Enter The 8th Element:7
Enter The 9th Element:8
Enter The 10th Element:2


[1, 2, 2, 3, 5, 6, 7, 8, 8, 9]


*/
