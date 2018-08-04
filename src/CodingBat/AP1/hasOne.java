package CodingBat.AP1;

public class hasOne {
    public static void main(String[] args) {
        System.out.println(hasOne(340));

    }
    public static boolean hasOne(int n) {

        while (n != 0){
        if (n % 10 == 1){
            return true;
        }
        else {
            n = n / 10;
        }
        }
        return false;
    }

}
