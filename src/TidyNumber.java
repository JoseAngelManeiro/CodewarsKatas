import java.util.Arrays;

// A Tidy number is a number whose digits are in non-decreasing order
public class TidyNumber {

    public static boolean tidyNumber(int number) {
        int[] digits = String.valueOf(number).chars()
                .map(Character::getNumericValue)
                .toArray();
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] < digits[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
