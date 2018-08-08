package CodingBat.AP1;

public class copyEvens {
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 8};
        copyEvens(arr, 3);

    }

    public static int[] copyEvens(int[] nums, int count) {
        int result[] = new int[count];
        int counter = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                if (counter < result.length) {
                    result[counter] = num;
                    counter++;
                } else {
                    return result;
                }
            }
        }
        return result;
    }
}
