package CodingBat.Logic2;

/**
 * Created by Artem_Berdnik on 8/6/2018.
 */
public class evenlySpaced {
    public static void main(String[] args) {
        System.out.println(evenlySpaced(4,6,2));
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        int result[] = findMaxMinMiddle(a,b,c);

        return (result[1] - result[0] == result[2] - result[1]);
    }

    public static int[] findMaxMinMiddle(int a, int b, int c){
        int result[] = {a, b, c};

        for (int i = 0; i < result.length; i++) {
            for (int j = 1; j < result.length -i; j++) {
                if(result[j-1] > result[j]){
                    int temp = 0;
                    temp = result[j-1];
                    result[j-1] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }

}
