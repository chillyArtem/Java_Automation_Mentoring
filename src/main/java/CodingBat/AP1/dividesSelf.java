package CodingBat.AP1;

public class dividesSelf {
    public static void main(String[] args) {
        System.out.println(dividesSelf(128));
    }

    public static boolean dividesSelf(int n) {
        int checker = n;
        while (checker != 0){
            if (checker % 10 == 0){
                return false;
            }
            if (n % (checker % 10) == 0){
                checker = checker / 10;
            }
            else {
                return false;
            }
        }
        return true;
    }

}
