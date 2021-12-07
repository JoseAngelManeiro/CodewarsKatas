import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// A stream of data is received and needs to be reversed.
// Each segment is 8 bits long, meaning the order of these segments needs to be reversed.
public class DataReverse {

    public static int[] solution(int[] data) {
        List<Integer> original = Arrays.stream(data).boxed().collect(Collectors.toList());
        List<Integer> result = new ArrayList<>(original.size());
        for (int i = original.size() / 8; i > 0; i--)
            result.addAll(original.subList(8 * i - 8, 8 * i));
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

}
