package CodingBat.Array3;

import java.util.ArrayList;
import java.util.Arrays;

/**@SuppressWarnings
 * Created by Artem_Berdnik on 8/6/2018.
 */
public class seriesUp {
    public static void main(String[] args) {
        int mass[] = seriesUp(3);
    }

    public static int[] seriesUp(int n) {
        int result[] = new int[n*(n + 1)/2];
        ArrayList<Integer> tempArray = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            tempArray.addAll(massiveFilling(i));
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = tempArray.get(i);
        }
        return result;
    }


    public static ArrayList<Integer> massiveFilling(int n){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            result.add(i);
        }
        return result;
    }
}
