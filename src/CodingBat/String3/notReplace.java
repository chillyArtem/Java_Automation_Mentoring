package CodingBat.String3;

import java.util.Arrays;
import java.util.List;

/**@SuppressWarnings
 * Created by Artem_Berdnik on 8/1/2018.
 */

//FIXME is not working
public class notReplace {
    public static void main(String[] args) {
        System.out.println(notReplace("is-is"));
    }

    public static String notReplace(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i + 2).equals("is") && !Character.isLetter(str.charAt(i-1)) && !Character.isLetter(str.charAt(i-2+1))){
                result.insert(0, str.substring(0, i + 2)).append(" not").append(str.substring(i + 2));
                }
            }


        return result.toString();
        }

    }
