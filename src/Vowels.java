// Return the number of vowels in the given string
public class Vowels {
    public static int getCount(String str) {
        return str.replaceAll("[^aeiou]", "").length();
    }
}
