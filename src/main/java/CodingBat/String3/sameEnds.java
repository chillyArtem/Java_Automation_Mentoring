package CodingBat.String3;

/**
 * Created by Artem_Berdnik on 8/1/2018.
 */
public class sameEnds {
    public static void main(String[] args) {
        System.out.println(sameEnds("Hello! and Hello!"));
    }

    private static String sameEnds(String string) {
        string = string.replaceAll("\\s+","");
        String start;
        String end;

        if (string.length() % 2 == 0) {
             start = string.substring(0, string.length() / 2);
             end = string.substring(string.length() / 2, string.length());
        }
        else {
            start = string.substring(0, string.length() / 2);
            end = string.substring(string.length() / 2+1, string.length());
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < end.length(); i++) {
            for (int j = 0; j < start.length(); j++) {
                if(end.charAt(i) == start.charAt(j)) {
                    result.append(start.charAt(j));
                    break;
                }
            }
        }

        return result.toString().equals(start.substring(0,result.length())) ? result.toString() : "";
    }
}



