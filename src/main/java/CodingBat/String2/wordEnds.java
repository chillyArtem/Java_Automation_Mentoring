package CodingBat.String2;

/**
 * @SuppressWarnings Created by Artem_Berdnik on 8/20/2018.
 */
public class wordEnds {
    public static void main(String[] args) {
        System.out.println(wordEnds("XY", "XY"));
    }

    public static String wordEnds(String str, String word) {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (i + word.length() <= str.length() && str.substring(i, i + word.length()).equals(word)) {
                if (i - 1 >= 0 && i + word.length() < str.length()) {
                    s.append(str.charAt(i - 1)).append(str.charAt(i + word.length()));
                }
                if (i - 1 < 0 && i + word.length() < str.length()) {
                    s.append(str.charAt(i + word.length()));
                }
                if (i + word.length() >= str.length() && i - 1 >= 0) {
                    s.append(str.charAt(i - 1));
                }
            }
        }
        return s.toString();
    }


}
