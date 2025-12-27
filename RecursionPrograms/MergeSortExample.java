import java.io.*;
import java.util.*;

public class MergeSortExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter The Array Size:");
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

        int[] sorted = merge(array);
        System.out.println("\nSorted Array: " + Arrays.toString(sorted));
    }

    static int[] merge(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left  = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));   // FIXED

        return mergeSort(left, right);
    }

    static int[] mergeSort(int[] l, int[] r){
        int i = 0, j = 0, k = 0;
        int[] result = new int[l.length + r.length];

        while(i < l.length && j < r.length){
            if(l[i] > r[j]){
                result[k++] = r[j++];
            }
            else{
                result[k++] = l[i++];     // FIXED
            }
        }

        while(i < l.length){
            result[k++] = l[i++];         // FIXED
        }

        while(j < r.length){
            result[k++] = r[j++];         // FIXED
        }

        return result;
    }
}
