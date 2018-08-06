package CodingBat.AP1;

public class copyEndy {
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 8};
        copyEndy(arr, 3);
    }

    public static int[] copyEndy(int[] nums, int count) {
        int result[] = new int[count];
        int counter = 0;

        for (int num : nums) {
            if (isEndy(num)) {
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

    public static boolean isEndy(int n){
        return ((n >= 0 && n <=10 || (n >= 90 && n <= 100)));
    }

}
