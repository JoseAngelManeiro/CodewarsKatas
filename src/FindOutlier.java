import java.util.ArrayList;
import java.util.List;

// Find the outlier in a array of odd or even numbers
public class FindOutlier {

    static int find(int[] integers) {
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i : integers) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            } else {
                oddNumbers.add(i);
            }
        }
        return oddNumbers.size() == 1 ? oddNumbers.get(0) : evenNumbers.get(0);
    }
}
