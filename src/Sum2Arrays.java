import java.util.stream.IntStream;

// Get the sum of two arrays
public class Sum2Arrays {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }

}
