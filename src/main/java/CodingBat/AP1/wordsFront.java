package CodingBat.AP1;

import java.util.ArrayList;
import java.util.Arrays;

public class wordsFront {
    public static void main(String[] args) {
        String arr[] = {"a", "bb", "b", "ccc"};
        System.out.println(Arrays.toString(wordsFront(arr, 3)));
    }

    public static String[] wordsFront(String[] words, int n) {

        ArrayList<String> preliminaryResult = new ArrayList<>(Arrays.asList(words).subList(0, n));

        String[] result = new String [preliminaryResult.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = preliminaryResult.get(i);
        }

        return result;

    }

}
