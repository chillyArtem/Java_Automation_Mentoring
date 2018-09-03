package CodingBat.Recursion;

/**
 * Created by Artem_Berdnik on 9/3/2018.
 */
public class countPairs {
    public static void main(String[] args) {
        System.out.println(countPairs("axa"));
    }

    public static int countPairs(String str) {
        if (str.length() <3) return 0;

        if (str.length() >= 3 && str.charAt(0) == str.charAt(2)) return countPairs(str.substring(1)) + 1;

        return countPairs(str.substring(1));

    }

}
