import java.util.HashMap;
import java.util.Map;

// Given an array of integers, find the one that appears an odd number of times
public class FindOdd {

    public static int findIt(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : a) {
            map.compute(i, (key, val) -> (val == null) ? 1 : val + 1);
        }
        return map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() % 2 != 0)
                .mapToInt(Map.Entry::getKey)
                .sum();
    }
}
