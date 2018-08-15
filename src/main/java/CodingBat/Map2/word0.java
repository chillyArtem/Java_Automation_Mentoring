package CodingBat.Map2;

import java.util.HashMap;
import java.util.Map;

/**
 * @SuppressWarnings Created by Artem_Berdnik on 8/15/2018.
 */
public class word0 {
    public static void main(String[] args) {
        String arr[] = {"a", "b", "a", "b"};
        System.out.println(word0(arr));
    }

    public static Map<String, Integer> word0(String[] strings) {

        Map<String, Integer> result = new HashMap<>();

        for (String string : strings) {
            result.put(string, 0);
        }
        return result;
    }

}
