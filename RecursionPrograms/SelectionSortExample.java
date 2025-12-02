import java.io.*;
import java.util.*;

public class SelectionSortExample {
    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter The Size Of An Array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        createArray(array,size);
        selectionSort(array,0,size,array[0],0);
    }

    static void createArray(int[] array,int n){
        if(count < n){
            System.out.print("Enter Element " + (count+1) + ": ");
            array[count] = sc.nextInt();
            count++;
            createArray(array,n);
        }
    }

    static void selectionSort(int[] array,int i,int n,int max,int maxIndex){
        if(n != 0){
            if(i < n){
                if(max < array[i]){
                    max = array[i]; 
                    maxIndex = i; 
                }
                selectionSort(array,i+1,n,max,maxIndex);
            }
            else{

                int temp = array[n-1];
                array[n-1] = array[maxIndex];
                array[maxIndex] = temp;

                selectionSort(array,0,n-1,array[0],0);
            }
        }
        else{
            System.out.print(Arrays.toString(array));
        }
    }
}


/*

OUTPUT:

Enter The Size Of An Array: 10
Enter Element 1: 1
Enter Element 2: 5
Enter Element 3: 2
Enter Element 4: 3
Enter Element 5: 4
Enter Element 6: 8
Enter Element 7: 9
Enter Element 8: 4
Enter Element 9: 5
Enter Element 10: 0
[0, 1, 2, 3, 4, 4, 5, 5, 8, 9]


*/