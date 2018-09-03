package Hackerrank;

import sun.text.bidi.BidiBase;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Artem_Berdnik on 9/3/2018.
 */
public class big_decimal2 {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();


        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                BigDecimal first = new BigDecimal(s[j - 1]);
                BigDecimal second = new BigDecimal(s[j]);
                if (first.compareTo(second) < 0) {
                    String temp = s[j - 1];
                    s[j - 1] = s[j];
                    s[j] = temp;
                }
            }
        }


        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}

