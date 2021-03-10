import java.util.stream.Collectors;

// Correct the mistakes of the character recognition software: 5, 0, 1
public class CorrectMistakes {
    public static String correct(String string) {
        return string.chars()
                .mapToObj(c -> (char) c)
                .map(c -> c == '5' ? "S" : c == '0' ? "O" : c == '1' ? "I" : String.valueOf(c))
                .collect(Collectors.joining());
    }
}
