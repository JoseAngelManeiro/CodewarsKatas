import java.util.List;
import java.util.stream.Collectors;

// Given a number, Find if it is Balanced or not
public class BalancedNumber {

    public static String balancedNum(long number) {
        List<Integer> digits = String.valueOf(number).chars()
                .mapToObj(Character::getNumericValue)
                .collect(Collectors.toList());
        int size = digits.size();
        int leftEndIndex = size / 2;
        if (size % 2 == 0) leftEndIndex--;
        int rightStartIndex = size / 2 + 1;
        int sumLeft = digits.subList(0, leftEndIndex).stream().mapToInt(Integer::intValue).sum();
        int sumRight = digits.subList(rightStartIndex, size).stream().mapToInt(Integer::intValue).sum();
        return sumLeft == sumRight ? "Balanced" : "Not Balanced";
    }
}
