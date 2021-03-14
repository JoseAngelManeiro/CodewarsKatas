import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// Count duplicate characters within a String
public class CountingDuplicates {

    public static int duplicateCount(String text) {
        List<Character> chars = text.chars()
                .mapToObj(c -> Character.toLowerCase((char) c))
                .collect(Collectors.toList());
        return (int) chars.stream()
                .filter(c -> Collections.frequency(chars, c) > 1)
                .distinct()
                .count();
    }

}