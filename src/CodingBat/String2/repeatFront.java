package CodingBat.String2;

/**@SuppressWarnings
 * Created by Artem_Berdnik on 8/6/2018.
 */
public class repeatFront {
    public static void main(String[] args) {
        System.out.println(repeatFront("Chocolate", 4));
    }

    public static String repeatFront(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            while (n>=0) {
                result.append(str.substring(0, n));
                n--;
            }
        }
        return result.toString();
    }
}
