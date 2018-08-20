package Hackerrank;

import java.util.Scanner;

/**
 * Created by Artem_Berdnik on 8/20/2018.
 */
public class Output_Formatting {


        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d",s1, x);
            System.out.println();
        }
        System.out.println("================================");

    }
    }

