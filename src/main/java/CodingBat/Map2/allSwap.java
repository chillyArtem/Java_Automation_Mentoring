package CodingBat.Map2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @SuppressWarnings Created by Artem_Berdnik on 8/15/2018.
 */
public class allSwap {
    public static void main(String[] args) {
        String arr[] = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
        System.out.println(Arrays.toString(allSwap(arr)));
    }

    public static String[] allSwap(String[] strings) {
        Map<Integer, Boolean> map = new HashMap<>();


        for (int i = 0; i < strings.length; i++) {
            map.put(i, false);
        }

        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].charAt(0) == strings[j].charAt(0) && map.containsKey(i) && !map.get(i) && map.containsKey(j) && !map.get(j)) {
                    String temp = strings[j];
                    strings[j] = strings[i];
                    strings[i] = temp;

                    map.put(i, true);
                    map.put(j, true);
                }
            }
        }

        return strings;
    }

}
