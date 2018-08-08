package CodingBat.Array3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class maxSpan {
    public static void main(String[] args) {
        int arr[] = {3, 9};
        System.out.println(maxSpan(arr));

    }

    public static int maxSpan(int[] nums) {
        int span = 0;

        List<Integer> numsAsList = new ArrayList<>();
        for (int i : nums) {
            numsAsList.add(i);
        }

        for (int i = 0; i < numsAsList.size(); i++) {
            if ((numsAsList.lastIndexOf(numsAsList.get(i)) - numsAsList.indexOf(numsAsList.get(i))) >= span) {
                span = (numsAsList.lastIndexOf(numsAsList.get(i)) - numsAsList.indexOf(numsAsList.get(i))) + 1;
            }
        }
        return span;
    }
}
