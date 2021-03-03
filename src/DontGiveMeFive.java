import java.util.stream.IntStream;

// Count the amount of numbers inside a range that don't contain 5
public class DontGiveMeFive {

    public static int solution(int start, int end) {
        return (int) IntStream.rangeClosed(start, end)
                .filter(i -> !String.valueOf(i).contains("5"))
                .count();
    }
}
