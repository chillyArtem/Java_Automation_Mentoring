package CodingBat.String2;

/**@SuppressWarnings
 * Created by Artem_Berdnik on 8/13/2018.
 */
public class oneTwo {
    public static void main(String[] args) {
        System.out.println(oneTwo("abcdefxyz"));
    }

    public static String oneTwo(String str) {
        StringBuilder s = new StringBuilder(str.substring(0, str.length() - str.length()%3));
        for (int i = 0; i <= s.length(); i+=3) {
            if (i+3 <= s.length()){
            s.insert(i+3, s.charAt(i));
            s.deleteCharAt(i);
            }
        }
        return s.toString();
    }

}
