package CodingBat.AP1;

public class scoresAverage {
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 1, 2, 3};
        System.out.println(scoresAverage(arr));
    }

     static int scoresAverage(int[] scores) {

        int averageOfFirstHalf = average(scores, 0, scores.length/2);
        int averageOfSecondHalf = average(scores, scores.length/2, scores.length);

        return (averageOfFirstHalf > averageOfSecondHalf) ? averageOfFirstHalf : averageOfSecondHalf;

    }

     static int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i < end ; i++) {
            sum+=scores[i];
        }

        return sum / (scores.length/2);

    }

}
