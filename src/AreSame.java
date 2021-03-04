import java.util.Arrays;

// Compare two arrays to see if the elements of the second are the elements of the first squared
public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) return false;
        a = Arrays.stream(a).map(Math::abs).sorted().toArray();
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (a[i] * a[i] != b[i]) return false;
        }
        return true;
    }
}
