package CodingBat.Recursion;

public class array220 {
    public static void main(String[] args) {
        int arr[] = {1};
        System.out.println(array220(arr, 0));
    }

    public static boolean array220(int[] nums, int index) {
        if (index >= nums.length) return false;

        if (index + 1 < nums.length && nums[index] * 10 == nums[index + 1]) return true;

        else return array220(nums, index + 1);
    }

}
