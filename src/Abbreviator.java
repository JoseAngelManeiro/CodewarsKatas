import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Write a function that takes a string and turns any and all "words"
// within that string of length 4 or greater into an abbreviation.
public class Abbreviator {

    public String abbreviate(String string) {
        int lastIndex = 0;
        StringBuilder output = new StringBuilder();
        Matcher matcher = Pattern.compile("[a-zA-Z]*").matcher(string);
        while (matcher.find()) {
            output.append(string, lastIndex, matcher.start()).append(convert(matcher.group()));
            lastIndex = matcher.end();
        }
        if (lastIndex < string.length()) {
            output.append(string, lastIndex, string.length());
        }
        return output.toString();
    }

    private static String convert(String string) {
        int abbrSize = string.length() - 2;
        return abbrSize > 1 ? ("" + string.charAt(0) + abbrSize + string.charAt(string.length() -1)) : string;
    }

}
