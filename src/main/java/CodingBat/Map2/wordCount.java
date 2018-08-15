package CodingBat.Map2;

import java.util.HashMap;
import java.util.Map;

/**
 * @SuppressWarnings Created by Artem_Berdnik on 8/15/2018.
 */
public class wordCount {
    public static void main(String[] args) {
        String arr[] = {"a", "b", "a", "c", "b"};
        System.out.println(wordCount(arr));
    }

    public static Map<String, Integer> wordCount(String[] strings) {

        Map<String, Integer> result = new HashMap<>();
        for (String string : strings) {
            if (!result.containsKey(string)) {
                result.put(string, 1);
            } else {
                result.put(string, result.get(string) + 1);
            }
        }
        return result;

    }

}
