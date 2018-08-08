package CodingBat.Array3;

import java.util.ArrayList;
import java.util.List;

public class linearIn {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6};
        int arr2[] = {2, 4};
        System.out.println(linearIn(arr, arr2));
    }
    private static boolean linearIn(int[] outer, int[] inner) {
        List<Integer> innerAsList = arrayToList(inner);
        List<Integer> outerAsList = arrayToList(outer);

        return outerAsList.containsAll(innerAsList);
    }

    private static List<Integer> arrayToList(int[] arr){
        List<Integer> a = new ArrayList<>(arr.length);
        for (int i : arr) {
            a.add(i);
        }
        return a;
    }

}
