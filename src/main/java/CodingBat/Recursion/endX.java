package CodingBat.Recursion;

/**
 * Created by Artem_Berdnik on 9/3/2018.
 */
public class endX {
    public static void main(String[] args) {
        System.out.println(endX("xxhixx"));
    }

    public static String endX(String str) {

        if (str.length() == 0) return str;

        if (str.charAt(0) == 'x') return endX(str.substring(1)) + "x";

        return str.charAt(0) + endX(str.substring(1));

    }

}
