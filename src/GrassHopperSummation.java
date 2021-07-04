import java.util.stream.IntStream;

// Write a program that finds the summation of every number from 1 to n
public class GrassHopperSummation {

    public static int summation(int n) {
        return IntStream.rangeClosed(1, n).sum();
    }
}
