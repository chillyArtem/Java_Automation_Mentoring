package CodingBat.Logic2;

public class makeBricks {
    public static void main(String[] args) {
        System.out.println(makeBricks(6,0,11));
    }

    public static boolean makeBricks(int small, int big, int goal) {

        if ((goal % 5 > small) || (goal - big*5 - small) > 0) {
            return false;
        }

        if (small + big*5 == goal || big*5 ==goal) {
            return true;
        }

        if(small + big*5 != goal) {

            makeBricks(small,big-1, goal);
            return true;
        }
        return false;
    }
}
