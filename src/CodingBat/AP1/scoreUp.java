package CodingBat.AP1;

public class scoreUp {
    public static void main(String[] args) {
        String arr[] = {"a", "a", "b", "b", "c"};
        String arr2[] = {"a", "b", "b", "b", "?"};
        System.out.println(scoreUp(arr, arr2));
    }

    public static int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for (int i = 0; i < key.length ; i++) {
            if (answers[i].equals("?")){
                continue;
            }
            if (key[i].equals(answers[i])){
                score+=4;
            }
            else {
                score-=1;
            }
        }
        return score;
    }

}
