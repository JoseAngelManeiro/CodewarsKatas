import java.util.Arrays;
import java.util.stream.Collectors;

// Convert a name into initials
public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        return Arrays.stream(name.split(" "))
                .map(s -> String.valueOf(s.charAt(0)).toUpperCase())
                .collect(Collectors.joining("."));
    }
}
