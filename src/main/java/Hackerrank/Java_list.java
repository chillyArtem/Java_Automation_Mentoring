package Hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @SuppressWarnings Created by Artem_Berdnik on 8/29/2018.
 */
public class Java_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int listSize = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            list.add(sc.nextInt());
        }
        int querySize = sc.nextInt();

        for (int i = 0; i <= querySize; i++) {
            String operation = sc.nextLine();
            if (operation.equals("Insert")) {
                list.add(sc.nextInt(), sc.nextInt());
                if (sc.hasNext()) sc.nextLine();
            }
            if (operation.equals("Delete")) {
                list.remove(sc.nextInt());
                if (sc.hasNext()) sc.nextLine();
            }
        }
        for (Integer integer : list) {
            System.out.printf("%d ", integer);
        }
    }
}