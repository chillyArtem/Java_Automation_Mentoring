package Hackerrank;

import java.util.Scanner;

/**
 * Created by Artem_Berdnik on 8/20/2018.
 */
public class Loops_II {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = (int) (a + Math.pow(2, 0)*b);
            for (int j = 1; j <= n; j++) {
                System.out.printf("%d ", sum);
                sum +=(int) Math.pow(2, j)*b;
            }
            System.out.println();
        }
        in.close();
    }
}
