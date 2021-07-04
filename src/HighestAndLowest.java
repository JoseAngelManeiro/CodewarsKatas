import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

// Find the highest and lowest int of a list of numbers
public class HighestAndLowest {

    public static String highAndLow(String numbers) {
        IntSummaryStatistics stats = Arrays.stream(numbers.split(" "))
                .collect(Collectors.summarizingInt(Integer::valueOf));
        return stats.getMax() + " " + stats.getMin();
    }

}
