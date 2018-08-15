package CodingBat.Map2;

import java.util.HashMap;
import java.util.Map;

/**
 * @SuppressWarnings Created by Artem_Berdnik on 8/15/2018.
 */
public class pairs {
    public static void main(String[] args) {
        String arr[] = {"code", "bug"};
        System.out.println(pairs(arr));
    }

    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> result = new HashMap<>();
        for (String string : strings) {
            result.put(String.valueOf(string.charAt(0)), String.valueOf(string.charAt(string.length() - 1)));
        }
        return result;
    }

}
