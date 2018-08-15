package CodingBat.String3;

/**
 * @SuppressWarnings Created by Artem_Berdnik on 8/1/2018.
 */

public class notReplace {
    public static void main(String[] args) {
        System.out.println(notReplace("is"));
    }

    public static String notReplace(String str) {
        StringBuilder result = new StringBuilder(str);

        for (int i = 0; i < result.length() - 1; i++) {
            if (result.substring(i, i + 2).equals("is")) {
                if (i - 1 >= 0 && i + 2 < result.length()) {
                    if (!Character.isLetter(result.charAt(i - 1)) && !Character.isLetter(result.charAt(i + 2))) {
                        result.replace(i, i + 2, "is not");
                    }
                }
                if (i - 1 < 0 && i + 2 >= result.length()) {
                        result.replace(i, i + 2, "is not");
                        break;
                }
                if (i - 1 < 0) {
                    if (!Character.isLetter(result.charAt(i + 2))) {
                        result.replace(i, i + 2, "is not");
                    }
                }
                if (i + 2 >= result.length()) {
                    if (!Character.isLetter(result.charAt(i - 1))) {
                        result.replace(i, i + 2, "is not");
                    }
                }
            }
        }

        return result.toString();
    }

}
