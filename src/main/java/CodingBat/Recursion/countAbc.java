package CodingBat.Recursion;

/**
 * Created by Artem_Berdnik on 9/3/2018.
 */
public class countAbc {
    public static void main(String[] args) {
        System.out.println(countAbc("abaxxaba"));
    }

    public static int countAbc(String str) {
        if (str.length() < 3) return 0;

        if (str.substring(0,3).equals("abc") ||str.substring(0,3).equals("aba")) return countAbc(str.substring(1)) + 1;

        return countAbc(str.substring(1));
    }

}
