package CodingBat.AP1;

import java.util.ArrayList;

public class commonTwo {
    public static void main(String[] args) {

        String arr[] = {"a", "a", "b", "b", "c"};
        String arr2[] = {"a", "b", "b", "b", "c"};
        System.out.println(commonTwo(arr, arr2));
       // System.out.println(removeDuplicates(arr));
    }

    public static int commonTwo(String[] a, String[] b) {
        int count = 0;

        for (int i = 0; i < removeDuplicates(a).size(); i++) {
            for (int j = 0; j < removeDuplicates(b).size(); j++) {
                if (removeDuplicates(a).get(i).equals(removeDuplicates(b).get(j))){
                    count++;
                }
            }
        }
        return count;
    }

    public static ArrayList<String> removeDuplicates(String[] old){
        ArrayList<String> result = new ArrayList<>();
        for (String anOld : old) {
            if (!result.contains(anOld)) {
                result.add(anOld);
            }
        }
        return result;
    }

}
