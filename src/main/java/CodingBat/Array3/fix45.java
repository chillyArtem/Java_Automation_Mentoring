package CodingBat.Array3;

import java.util.Arrays;

/**
 * Created by Artem_Berdnik on 8/15/2018.
 */
public class fix45 {
    public static void main(String[] args) {
        int arr[] = {4, 5, 4, 1, 5};
        //fix34(arr);
        System.out.println(Arrays.toString(fix45(arr)));
    }

    public static int[] fix45(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 4) {
                int index = findIndexOfValidFive(nums);

                if(index != -1) {
                    int temp = nums[i + 1];
                    nums[i + 1] = nums[index];
                    nums[index] = temp;
                }
            }
        }

        return nums;
    }

    public static int findIndexOfValidFive(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if((i == 0 && nums[i] == 5) || (nums[i] == 5 && nums[i - 1] != 4)) {
                return i;
            }
        }

        return -1;
    }

}
