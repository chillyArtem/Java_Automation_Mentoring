package CodingBat.Map2;

import java.util.HashMap;
import java.util.Map;

/**
 * @SuppressWarnings Created by Artem_Berdnik on 8/15/2018.
 */
public class wordLen {
    public static void main(String[] args) {
        String arr[] = {"a", "bb", "a", "bb"};
        System.out.println(wordLen(arr));
    }

    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String string : strings) {
            result.put(string, string.length());
        }
        return result;
    }

}
