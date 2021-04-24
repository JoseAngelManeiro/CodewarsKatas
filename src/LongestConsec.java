import java.util.*;

//  Return the first longest string consisting of k consecutive strings taken in the array
public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        int n = strarr.length;
        if (k > n || k <= 0) {
            return "";
        }
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.setLength(0);
            sb.append(strarr[i]);
            if (k > 1 && (i + k) <= n) {
                for (int j = i + 1; j < (i + k); j++) {
                    sb.append(strarr[j]);
                }
            }
            list.add(sb.toString());
        }
        return Collections.max(list, Comparator.comparing(String::length));
    }
}
