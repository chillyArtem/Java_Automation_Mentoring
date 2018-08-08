package CodingBat.String3;

/**
 * Created by Artem_Berdnik on 8/8/2018.
 */
public class withoutString {
    public static void main(String[] args) {
        System.out.println(withoutString("abxxxxab", "xx"));
    }

    public static String withoutString(String base, String remove) {
        StringBuilder result = new StringBuilder(base);
        for (int i = 0; i <= result.length(); i++) {
            if (remove.length() + i <= result.length()){
                if (result.substring(i, i+remove.length()).toLowerCase().equals(remove.toLowerCase()) && remove.length() > 0) {
                    result.delete(i, i+remove.length());
                    i--;
                }
            }
        }
        return result.toString();
    }

}
