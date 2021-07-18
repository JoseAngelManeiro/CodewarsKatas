import java.util.stream.Collectors;
import java.util.stream.Stream;

// Write a function called repeatStr
// which repeats the given string string exactly n times
public class StringRepeat {

    public static String repeatStr(final int repeat, final String string) {
        return Stream.generate(() -> string).limit(repeat).collect(Collectors.joining());
    }

}
