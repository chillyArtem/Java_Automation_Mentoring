package Hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;

public class regExp1 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex {

    String pattern = "(0?[0-9]{1,2}|1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\.(0?[0-9]{1,2}|1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\.(0?[0-9]{1,2}|1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\.(0?[0-9]{1,2}|1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
}

