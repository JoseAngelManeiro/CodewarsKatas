import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

//  Write a function which formats a duration, given as a number of seconds, in a human-friendly way.
//  Example: 3662 -> "1 hour, 1 minute and 2 seconds"
public class TimeFormatter {

    public static String formatDuration(int seconds) {
        if (seconds == 0) return "now";

        Map<Integer, String> secondsMap  = new LinkedHashMap<>() {{
            put(31536000, "year");
            put(86400, "day");
            put(3600, "hour");
            put(60, "minute");
            put(1, "second");
        }};
        List<String> divisions = new ArrayList<>();

        for (Integer secondsAmount : secondsMap.keySet()) {
            if (seconds >= secondsAmount) {
                int total = seconds / secondsAmount;
                String label = total + " " + secondsMap.get(secondsAmount) + (total > 1 ? "s" : "");
                divisions.add(label);
                seconds = seconds - (total * secondsAmount);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < divisions.size(); i++) {
            sb.append(divisions.get(i));
            if (i < (divisions.size() - 1)) {
                sb.append(i == (divisions.size() - 2) ? " and " : ", ");
            }
        }

        return sb.toString();
    }
}
