package CodingBat.String3;

/**@SuppressWarnings
 * Created by Artem_Berdnik on 8/15/2018.
 */
public class sumNumbers {
    public static void main(String[] args) {
        System.out.println(sumNumbers("7 11"));
    }

    public static int sumNumbers(String str) {

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            //introduce counter for digit length
            int count = 0;
            if (Character.isDigit(str.charAt(i))) {
                //if a char is a digit - increase the counter
                count++;
                //check how long digit is
                for (int j = i+1; j < str.length(); j++) {
                    if (Character.isDigit(str.charAt(j))) {
                       count++;
                    }
                    else break;
                }
                //add int value of digit to a result value
                result += Integer.parseInt(str.substring(i, i+count));
                //move i forward to count length
                i+=count;
            }

        }
        return result;
    }}
