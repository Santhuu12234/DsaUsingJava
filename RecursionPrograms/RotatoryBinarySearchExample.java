import java.util.*;

public class RotatoryBinarySearchExample {

    public static void main(String[] args){
        int[] array = {4, 5, 6, 7, 1, 2, 3};
        int search = 1;

        int result = RBS(array, 0, array.length - 1, search);
        System.out.println("The Element Is Present At: " + result);
    }

    static int RBS(int[] array, int s, int e, int search) {

        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;

        // Found the element
        if (array[mid] == search) {
            return mid;
        }

        // Case 1: Left part is sorted
        if (array[s] <= array[mid]) {

            // Check if search is in left sorted part
            if (search >= array[s] && search < array[mid]) {
                return RBS(array, s, mid - 1, search);
            } else {
                return RBS(array, mid + 1, e, search);
            }
        }

        // Case 2: Right part is sorted
        else {

            // Check if search is in right sorted part
            if (search > array[mid] && search <= array[e]) {
                return RBS(array, mid + 1, e, search);
            } else {
                return RBS(array, s, mid - 1, search);
            }
        }
    }
}


/*

OUTPUT:

The Element Is Present At: 4

*/