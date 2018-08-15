package CodingBat.String3;

/**@SuppressWarnings
 * Created by Artem_Berdnik on 8/15/2018.
 */
public class mirrorEnds {
    public static void main(String[] args) {
        System.out.println(mirrorEnds("aba"));
    }

    public static String mirrorEnds(String string) {

        String stringReverse = new StringBuilder(string).reverse().toString();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            //System.out.println("A + " + string.substring(0,i));
            if (string.charAt(i) == stringReverse.charAt(i)){
                result.append(string.charAt(i));
            }
            if (string.charAt(i) != stringReverse.charAt(i)){
                return result.toString();
            }

        }
return result.toString();
    }

}
