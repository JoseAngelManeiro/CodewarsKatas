import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

// Take a number and sum its digits raised to the consecutive powers
public class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {
        List<Long> result = new ArrayList<>();
        AtomicLong index = new AtomicLong();
        for (long i = a; i <= b; i++) {
            index.set(1);
            if (i == String.valueOf(i).chars()
                    .mapToObj(c -> {
                        int digit = Character.getNumericValue((char) c);
                        return (long) Math.pow(digit, index.getAndIncrement()); })
                    .reduce(0L, Long::sum)) {
                result.add(i);
            }
        }
        return result;
    }
}
