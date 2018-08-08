package CodingBat.AP1;

import java.util.ArrayList;
import java.util.List;

public class wordsWithoutList {
    public static void main(String[] args) {
        String arr[] = {"a", "bb", "b", "ccc"} ;
        System.out.println(wordsWithoutList(arr, 4));
    }

    public static List wordsWithoutList(String[] words, int len) {

        ArrayList<String> result = new ArrayList<>();

        for (String a: words) {
            if (a.length() != len)
            {
                result.add(a);
            }
        }

        return result;

    }

}
