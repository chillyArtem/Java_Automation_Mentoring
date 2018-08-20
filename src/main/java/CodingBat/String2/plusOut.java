package CodingBat.String2;

/**@SuppressWarnings
 * Created by Artem_Berdnik on 8/20/2018.
 */
public class plusOut {
    public static void main(String[] args) {
        System.out.println(plusOut("abXYabcXYZ", "abc"));
    }

    public static String plusOut(String str, String word) {
        StringBuilder s = new StringBuilder();
        int wordLength = word.length();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != word.charAt(0)){
                s.append("+");
            }
            else if (str.substring(i, i+wordLength).equals(word)) {
                s.append(word);
                i+=wordLength-1;
            }
            else s.append("+");

        }

        return s.toString();
    }

}
