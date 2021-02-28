import java.util.stream.Collectors;

// Create a String whose characters are '(' for one match and ')' for more than one match
public class DuplicateEncoder {
    static String encode(String word) {
        String wordLC = word.toLowerCase();
        int sizeWithoutOneMatch = wordLC.length() -1 ;
        return wordLC.chars()
                .mapToObj(c -> (char) c)
                .map(c -> wordLC.replace(String.valueOf(c), "").length() == sizeWithoutOneMatch ? '(' : ')')
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}