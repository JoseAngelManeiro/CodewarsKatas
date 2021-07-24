import java.util.Comparator;
import java.util.stream.Collectors;

// Sort num digits in descending order
public class DescendingOrder {

    public static int sortDesc(final int num) {
        return Integer.parseInt(String.valueOf(num).chars().map(Character::getNumericValue)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining()));
    }

}
