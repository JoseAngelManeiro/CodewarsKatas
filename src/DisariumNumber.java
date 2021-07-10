import java.util.concurrent.atomic.AtomicInteger;

// Disarium number is the number that The sum of its digits
// powered with their respective positions is equal to the number itself.
public class DisariumNumber {

    public static String disariumNumber(int number) {
        return number == sumDigitsPowered(number) ? "Disarium !!" : "Not !!";
    }

    private static int sumDigitsPowered(int number) {
        char[] digits = String.valueOf(number).toCharArray();
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(Character.getNumericValue(digits[i]), i + 1);
        }
        return sum;
    }

    // Java Streams option (slower than first one)
    private static int sumDigitsPowered2(int number) {
        AtomicInteger index = new AtomicInteger(1);
        return String.valueOf(number).chars()
                .mapToObj(c -> (int) Math.pow(Character.getNumericValue(c), index.getAndIncrement()))
                .mapToInt(Integer::intValue)
                .sum();
    }

}
