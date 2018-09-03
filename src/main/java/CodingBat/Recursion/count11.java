package CodingBat.Recursion;

/**
 * Created by Artem_Berdnik on 9/3/2018.
 */
public class count11 {
    public static void main(String[] args) {
        System.out.println(count11("111"));
    }

    public static int count11(String str) {
        if (str.length() < 2) return 0;

        if (str.length() >=2 && str.substring(0,2).equals("11")) return count11(str.substring(2)) + 1;

        return count11(str.substring(1));
    }

}
