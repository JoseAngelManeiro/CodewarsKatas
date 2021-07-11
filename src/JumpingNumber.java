
// Jumping number is the number that All adjacent digits in it differ by 1
public class JumpingNumber {

    public static String jumpingNumber(int number) {
        int[] digits = String.valueOf(number).chars()
                .map(Character::getNumericValue)
                .toArray();
        for (int i = 1, prev = digits[0]; i < digits.length; prev = digits[i++]) {
            if (Math.abs(prev - digits[i]) != 1) {
                return "Not!!";
            }
        }
        return "Jumping!!";
    }

}
