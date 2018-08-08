package CodingBat.String2;

/**
 * Created by Artem_Berdnik on 8/6/2018.
 */
public class repeatSeparator {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("This", "And", 2));
    }

    public static String repeatSeparator(String word, String sep, int count) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            result.append(word);
            if (i+1 < count){
                result.append(sep);
            }
        }

       return result.toString();
    }

}
