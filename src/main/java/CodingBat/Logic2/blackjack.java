package CodingBat.Logic2;

/**
 * Created by Artem_Berdnik on 8/6/2018.
 */
public class blackjack {
    public static void main(String[] args) {
        System.out.println(blackjack(19,21));
    }

    public static int blackjack(int a, int b) {
        if (a > 21 && b <= 21){
            return b;
        }
        if (a <= 21 && b > 21){
            return a;
        }
        if (a > 21 && b > 21){
            return 0;
        }

        if (Math.abs(21 - a) < Math.abs(21 - b)){
            return a;
        }
        else {
            return b;
        }

    }

}
