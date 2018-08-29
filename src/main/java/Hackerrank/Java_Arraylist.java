package Hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @SuppressWarnings Created by Artem_Berdnik on 8/29/2018.
 */
public class Java_Arraylist {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = sc.nextInt();

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 1; i < n + 1; i++) {
            map.put(i, fillArrayList(sc.nextInt()));
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.println(isNumberInMap(map, sc.nextInt(), sc.nextInt()));
        }
    }

    static ArrayList<Integer> fillArrayList(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        return arr;
    }

    static String isNumberInMap(Map<Integer, ArrayList<Integer>> map, int arrayNumber, int exactNumber) {
        if (map.get(arrayNumber).size() >= exactNumber)
            return String.valueOf(map.get(arrayNumber).get(exactNumber - 1));
        else return "ERROR!";
    }
}

