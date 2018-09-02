package CodingBat.Recursion;

public class array6 {
    public static void main(String[] args) {
        int arr[] = {1, 4, 6};
        System.out.println(array6(arr,0));
    }
    public static boolean array6(int[] nums, int index) {
        if (index >= nums.length) return false;

        if (nums[index] != 6) return array6(nums, index+1);

        return true;

    }

}
