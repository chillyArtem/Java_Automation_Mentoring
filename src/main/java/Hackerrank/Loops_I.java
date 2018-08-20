package Hackerrank;

import java.util.Scanner;

/**
 * Created by Artem_Berdnik on 8/20/2018.
 */
public class Loops_I {
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", N, i, N*i);
        }
    }

    
}
