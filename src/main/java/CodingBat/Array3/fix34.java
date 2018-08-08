package CodingBat.Array3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**@SuppressWarnings
 * Created by Artem_Berdnik on 8/8/2018.
 */
public class fix34 {
    public static void main(String[] args) {
        int arr[] = {3, 7, 3, 4, 4, 1};
        //fix34(arr);
        System.out.println(Arrays.toString(fix34(arr)));
    }

    public static int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 3) {
                        int temp = nums[i];
                        nums[i] = nums[j+1];
                        nums[j+1] = temp;
                    }
                }
            }
        }
        return nums;
    }
}
