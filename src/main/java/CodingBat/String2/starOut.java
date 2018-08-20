package CodingBat.String2;

import java.util.Arrays;

/**@SuppressWarnings
 * Created by Artem_Berdnik on 8/20/2018.
 */
public class starOut {
    public static void main(String[] args) {
        System.out.println(starOut("sm*eil*ly"));
    }
    public static String starOut(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i) == '*') continue;
            if (i - 1 >= 0 && str.charAt(i-1) == '*') continue;
            if (i + 1 < str.length() && str.charAt(i+1) == '*') continue;

            stringBuilder.append(str.charAt(i));
        }

        return stringBuilder.toString();
    }


}
