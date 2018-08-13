package CodingBat.String2;

import java.util.Arrays;

/**
 * @SuppressWarnings Created by Artem_Berdnik on 8/13/2018.
 */
public class getSandwich {
    public static void main(String[] args) {
        System.out.println(getSandwich("xxbreadbreadjambreadyy"));
    }

    public static String getSandwich(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);

        if (stringBuilder.indexOf("bread") == stringBuilder.lastIndexOf("bread")){
            return "";
        }
        else {
            return stringBuilder.substring(stringBuilder.indexOf("bread") + 5, stringBuilder.lastIndexOf("bread"));
        }

    }


}
