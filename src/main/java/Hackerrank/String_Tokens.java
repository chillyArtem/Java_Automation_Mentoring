package Hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class String_Tokens {
    public static void main(String[] args) {
//He is a very very good boy, isn't he?
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] stringToken = s.split("[ !,?._'@]+");
        ArrayList<String> resutl = new ArrayList<>();
        for (String s1 : stringToken) {
            if (s1.length() >0) resutl.add(s1);
        }
        System.out.println(resutl.size());
        for (String s1 : resutl) {
            System.out.println(s1);
        }
        scan.close();
    }
}
