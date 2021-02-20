public class SquareSum {

    public static int squareSum(int[] n) {
        int result = 0;
        for (int i : n) {
            result += i * i;
        }
        return result;
    }
}
