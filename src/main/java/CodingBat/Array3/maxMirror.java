package CodingBat.Array3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**@SuppressWarnings
 * Created by Artem_Berdnik on 8/15/2018.
 */
//FIXME
public class maxMirror {
    public static void main(String[] args) {
        int[] arr = {7, 1, 2, 9, 7, 2, 1};
        System.out.println(maxMirror(arr));
    }

    public static int maxMirror(int[] nums) {
        int count = 0;

        ArrayList<Integer> arr = numsToList(nums);
        ArrayList<Integer> arr2 = numsToList(nums);
        Collections.reverse(arr2);

        //System.out.println(arr2.toString());

        for (int i = 0; i <= arr.size(); i++) {
            //System.out.println("sublist A = " + arr.subList(0, i).toString());
            for (int j = 0; j <= arr2.size(); j++) {
                //System.out.println("sublist A = " + arr.subList(0, i).toString() + "sublist B = " + arr2.subList(0, j).toString() + " " + arr.subList(0, i).containsAll(arr2.subList(0, j)));
                if (arr.subList(0, i).containsAll(arr2.subList(0, j)) && arr.subList(0, i).size() == arr2.subList(0, j).size()) {
                    count = arr.subList(0,i).size();
                    System.out.println(count);
                }
                //System.out.println("sublist B = " + arr2.subList(0, j).toString());

            }
        }

        return count;
    }

    public static ArrayList<Integer> numsToList(int[] nums){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : nums) {
            arr.add(num);
        }
        return arr;
    }

}
