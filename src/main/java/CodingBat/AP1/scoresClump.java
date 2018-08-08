package CodingBat.AP1;

public class scoresClump {
    public static void main(String[] args) {

        int arr[] = {2, 4, 5, 7};
        System.out.println(scoresClump(arr));
    }

    public static boolean scoresClump(int[] scores) {
        boolean result = false;
        for (int i = 0; i < scores.length; i++) {
            if (i + 2 < scores.length && !result){
            for (int j = 1; j <= i+2; j++) {
                result = scores[j] - scores[i] <= 2;
            }
        }
        }
        return result;
    }
}
