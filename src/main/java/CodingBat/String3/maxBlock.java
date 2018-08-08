package CodingBat.String3;

/**@SuppressWarnings
 * Created by Artem_Berdnik on 8/8/2018.
 */
public class maxBlock {
    public static void main(String[] args) {
        System.out.println(maxBlock(""));
    }

    public static int maxBlock(String str) {
        int finalCounter = 0;

        for (int i = 0; i < str.length(); i++) {
            int preliminaryCounter = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    preliminaryCounter++;
                }
                if (str.charAt(j) != str.charAt(i)){
                    break;
                }
                if (preliminaryCounter > finalCounter) {
                    finalCounter = preliminaryCounter;
                }
            }
        }
        return finalCounter;
    }
}
