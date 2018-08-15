package CodingBat.Map2;

import java.util.HashMap;
import java.util.Map;

/**@SuppressWarnings
 * Created by Artem_Berdnik on 8/15/2018.
 */
public class wordMultiple {
    public static void main(String[] args) {
        String arr[] = {"a", "b", "a", "c", "b"};
        System.out.println(wordMultiple(arr));
    }
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String string : strings) {
            if (!map.containsKey(string)){
                map.put(string, false);
            }
            else {
                map.put(string, true);
            }
        }
        return map;
    }

}
