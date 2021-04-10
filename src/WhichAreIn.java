import java.util.Arrays;

// Given two arrays of strings a1 and a2 return a sorted array r
// in lexicographical order of the strings of a1 which are substrings of strings of a2
public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        return Arrays.stream(array1)
                .filter(s -> {
                    for (String value : array2)
                        if (value.contains(s)) return true;
                    return false;
                })
                .sorted()
                .toArray(String[]::new);
    }

}
