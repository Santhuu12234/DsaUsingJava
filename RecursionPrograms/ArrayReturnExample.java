import java.util.*;

public class ArrayReturnExample {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        ArrayList<Integer> result = LS(list, 7, 0);

        System.out.println(result);
    }

    static ArrayList<Integer> LS(ArrayList<Integer> list, int search, int index) {

        if (index == list.size()) {
            return new ArrayList<>();   
        }

        ArrayList<Integer> ans = new ArrayList<>();

        if (list.get(index) == search) {
            ans.add(index);
        }

        ans.addAll(LS(list, search, index + 1));

        return ans;
    }
}


/*

OUTPUT:

[6]

*/