// Create a String of a given size alternating 1s and 0s
public class Stringy {
    public static String stringy(int size) {
        StringBuilder sb = new StringBuilder("1");
        for (int i = 1; i < size; i++) sb.append(i % 2 == 0 ? "1" : "0");
        return sb.toString();
    }
}
