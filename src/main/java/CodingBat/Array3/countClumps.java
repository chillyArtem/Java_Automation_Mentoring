package CodingBat.Array3;

/**
 * Created by Artem_Berdnik on 8/6/2018.
 */
public class countClumps {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1, 1};
        System.out.println(countClumps(arr));

    }

    public static int countClumps(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            }
            for (int j = i + 2; j < nums.length; j++) {
                if (nums[j] != nums[i]){
                    break;
                }
                if (nums[j] == nums[i]) {
                    i++;
                }
            }
        }
        return count;
    }

}
