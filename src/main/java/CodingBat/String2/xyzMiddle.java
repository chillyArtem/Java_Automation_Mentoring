package CodingBat.String2;

/**@SuppressWarnings
 * Created by Artem_Berdnik on 8/13/2018.
 */
public class xyzMiddle {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AxyzBBB"));
    }

    public static boolean xyzMiddle(String str) {
        if (str.equals("xyz")){
            return true;
        }
        if (str.length() < 3){
            return false;
        }
        else if(str.length()%2 == 0){
            return (str.substring(str.length() / 2 - 2, str.length() / 2 + 2).contains("xyz"));
        }
        else {
            return (str.substring(str.length() / 2 -1 , str.length() / 2+2).contains("xyz"));

        }
    }
}
