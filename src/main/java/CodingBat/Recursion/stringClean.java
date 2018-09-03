package CodingBat.Recursion;

/**
 * Created by Artem_Berdnik on 9/3/2018.
 */
public class stringClean {
    public static void main(String[] args) {
        System.out.println(stringClean("Hello"));
    }
//bbbcdd

    public static String stringClean(String str) {
        if (str.length() == 1) return str;

        if (str.charAt(0) == str.charAt(1)) return stringClean(str.substring(1));

        return str.charAt(0) + stringClean(str.substring(1));
    }

}
