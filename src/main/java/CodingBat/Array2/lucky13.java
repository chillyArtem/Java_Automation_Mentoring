package CodingBat.Array2;

/**@SuppressWarnings
 * Created by Artem_Berdnik on 8/1/2018.
 */
public class lucky13 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3};

        System.out.println(lucky13(arr));
    }

    public static boolean lucky13(int[] nums) {

        for (int i : nums) {
            if (i == 3 || i == 1){
                return false;
            }
        }
        return true;
    }
}
