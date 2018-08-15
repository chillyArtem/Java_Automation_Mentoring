package CodingBat.Map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Artem_Berdnik on 8/15/2018.
 */
public class wordAppend {
    public static void main(String[] args) {
        String arr[] = {"a", "b", "b", "b", "a", "c", "a", "a"};
        System.out.println(wordAppend(arr));
    }

    public static String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (String string : strings) {
            if (!map.containsKey(string)) {
                map.put(string, 1);
            } else {
                map.put(string, map.get(string) + 1);
                if (map.get(string) % 2 == 0) {
                    result.append(string);
                }
            }
        }

        return result.toString();
    }

}
