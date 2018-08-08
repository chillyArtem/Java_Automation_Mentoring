package CodingBat.Array3;

public class canBalance {
    public static void main(String[] args) {
        int arr[] = {10, 10};
        System.out.println(canBalance(arr));
    }

     static boolean canBalance(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int endForFirstHalfAndStartForSecondHalf = i+1;
            if (sumInArray(nums,0,endForFirstHalfAndStartForSecondHalf) == sumInArray(nums,endForFirstHalfAndStartForSecondHalf, nums.length)){
                return true;
            }
        }
        return false;
    }

     static int sumInArray(int[] nums, int first, int second){
        int sum = 0;
        for (int i = first; i < second; i++) {
            sum+=nums[i];
        }
        return sum;
    }

}
