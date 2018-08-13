package CodingBat.String2;

/**@SuppressWarnings
 * Created by Artem_Berdnik on 8/13/2018.
 */
public class sameStarChar {
    public static void main(String[] args) {
        System.out.println(sameStarChar("*12*2*2"));

    }

    public static boolean sameStarChar(String str) {

        boolean result = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*' && i-1 >= 0 && i+1 < str.length()){
                char character = str.charAt(i+1);
                result = str.charAt(i - 1) == character && str.charAt(i + 1) == character;
            }
        }
        return result;
    }
    }

