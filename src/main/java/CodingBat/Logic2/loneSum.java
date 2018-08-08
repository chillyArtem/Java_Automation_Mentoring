package CodingBat.Logic2;

public class loneSum {
    public static void main(String[] args) {
        System.out.println(loneSum(1,2,3));
    }

    public static int loneSum(int a, int b, int c) {

        return (a==b) ? (a==c) ? 0 : c : (b == c) ? a : (a == c) ? b : a + b + c;

    }
}
