package CodingBat.Array3;

public class squareUp {
    public static void main(String[] args) {

        squareUp(4);
    }

    public static int[] squareUp(int n) {
        int arr[] = new int[n*n];

        for (int i = 0; i < n; i++) {
            int k = i*3;
            int arr2[] = fillInArray(i+1, n);
            System.arraycopy(arr2, 0, arr, k, arr2.length);
            }
        return arr;
    }

    public static int[] fillInArray(int k, int n){
        int arr[] = new int[n];

        for (int i = n-1; i > 0; i--) {
            arr[n-k] = k;
            for (int j = n-k+1; j < arr.length; j++) {
                arr[j] = n-j;
            }
        }
        return arr;
    }
}
