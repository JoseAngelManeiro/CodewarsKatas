import java.util.Arrays;
import java.util.stream.Collectors;

// Analyze a String to reverse the words whose length is >= 5
public class SpinWords {

    public String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(s -> s.length() < 5 ? s : new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining(" "));
    }

}
