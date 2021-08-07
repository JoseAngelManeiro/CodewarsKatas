
// Complete the function that accepts a string parameter,
// and reverses each word in the string.
public class ReverseWords {

    public static String reverseWords(final String original) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (char letter : original.toCharArray()) {
            if (letter == ' ') {
                result.append(word.reverse()).append(letter);
                word.setLength(0);
            } else {
                word.append(letter);
            }
        }
        return result.append(word.reverse()).toString();
    }

}