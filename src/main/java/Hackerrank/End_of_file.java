package Hackerrank;

import java.util.Scanner;

public class End_of_file {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; scanner.hasNext(); i++) {
            System.out.printf("%d %s%n", i, scanner.nextLine());
        }

    }
}
