import java.util.stream.IntStream;

// Strong number is the number that the sum of the factorial of its digits
// is equal to number itself.
public class StrongNumber {

    public static String isStrongNumber(int num) {
        int sum = String.valueOf(num).chars()
                .mapToObj(c -> factorial(Character.getNumericValue(c)))
                .mapToInt(Integer::intValue)
                .sum();
        return sum == num ? "STRONG!!!!" : "Not Strong !!";
    }

    public static int factorial(int n) {
        return IntStream.rangeClosed(1, n).reduce(1, (int x, int y) -> x * y);
    }

}
