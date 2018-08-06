package CodingBat.String2;

/**
 * Created by Artem_Berdnik on 8/6/2018.
 */
public class prefixAgain {
    public static void main(String[] args) {
        System.out.println(prefixAgain("aa", 1));
    }

    public static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0,n);
        int count = 0;

        for (int i = 0; i <= str.length()-n; i++) {
            if (str.substring(i,n+i).equals(prefix)){
                System.out.println(str.substring(i,i+1));
                count++;
                if (count>1){
                    return true;
                }
            }
        }
        return false;
    }

}
