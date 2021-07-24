
// Complete the solution so that it splits the string into pairs of two characters.
// If the string contains an odd number of characters then it should replace
// the missing second character of the final pair with an underscore ('_')
public class StringSplit {

    public static String[] solution(String s) {
        return (s + (s.length() % 2 == 0 ? "" : "_")).split("(?<=\\G.{2})");
    }

}
