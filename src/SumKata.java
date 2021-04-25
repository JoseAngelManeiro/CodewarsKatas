import java.util.Arrays;

// Sum all the numbers of the array except the highest and the lowest element
public class SumKata {

    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length <= 1) return 0;
        Arrays.sort(numbers);
        return Arrays.stream(numbers, 1, numbers.length - 1).sum();
    }
}
