package CodingBat.String2;

/**@SuppressWarnings
 * Created by Artem_Berdnik on 8/13/2018.
 */
public class zipZap {
    public static void main(String[] args) {
        System.out.println(zipZap("zzzopzop"));
    }

    public static String zipZap(String str) {
        StringBuilder s = new StringBuilder(str);

        for (int i = 0; i < s.length(); i++) {
            if (i+3 <= s.length()){
            if (s.substring(i, i + 3).matches("z[a-zA-z]p")){
                s.deleteCharAt(i+1);
            }}
        }
return s.toString();
    }

}
