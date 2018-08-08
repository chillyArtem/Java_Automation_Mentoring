package CodingBat.AP1;

public class wordsCount {
    public static void main(String[] args) {

        String arr[] = {"a", "bb", "b", "ccc"};
        System.out.println(wordsCount(arr, 3));
    }

    public static int wordsCount(String[] words, int len) {
        int count = 0 ;
        for (String word : words) {
            if (word.length() == len){
                count++;
            }
        }
        return count;
        }
    }


