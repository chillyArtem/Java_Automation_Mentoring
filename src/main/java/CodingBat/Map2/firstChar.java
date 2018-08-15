package CodingBat.Map2;

import java.util.HashMap;
import java.util.Map;

/**
 * @SuppressWarnings Created by Artem_Berdnik on 8/15/2018.
 */
public class firstChar {
    public static void main(String[] args) {
        String arr[] = {"salt", "tea", "soda", "toast"};
        System.out.println(firstChar(arr));
    }

    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> result = new HashMap<>();

        for (String string : strings) {
            if (!result.containsKey(String.valueOf(string.charAt(0)))) {
                result.put(String.valueOf(string.charAt(0)), string);
            } else {
                result.put(String.valueOf(string.charAt(0)), result.get(String.valueOf(string.charAt(0))) + string);
            }
        }
        return result;
    }

}
