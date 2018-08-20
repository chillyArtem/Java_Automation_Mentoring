package CodingBat.Logic2;

public class makeChocolate {
    public static void main(String[] args) {
        System.out.println(makeChocolate(1, 2, 6));

    }

    public static int makeChocolate(int small, int big, int goal) {
        int maxPossibleBigs = goal / 5;
        if (big > maxPossibleBigs) return (goal <= 5 * maxPossibleBigs + small) ? goal - 5 * maxPossibleBigs : -1;
        else return (goal <= 5 * big + small) ? goal - 5 * big : -1;
    }
}
