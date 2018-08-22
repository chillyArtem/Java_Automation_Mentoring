package Hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class Primality_Test {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger bi1 = new BigInteger(n);

        if (bi1.isProbablePrime(1)) System.out.println("prime");
        else System.out.println("not prime");


        scanner.close();
    }
}
