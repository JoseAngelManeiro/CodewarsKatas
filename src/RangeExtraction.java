// A list of integers in increasing order is received
// and returns a correctly formatted string in the range format.
public class RangeExtraction {

    public static String solution(int[] arr) {
        StringBuilder sb = new StringBuilder("" + arr[0]);
        int c = 1;
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i - 1] - arr[i]) == 1) {
                c++;
            } else {
                sb.append(appendNumberIfNeeded(c, arr[i - 1])).append(",").append(arr[i]);
                c = 1;
            }
        }
        return sb.append(appendNumberIfNeeded(c, arr[arr.length - 1])).toString();
    }

    private static String appendNumberIfNeeded(int count, int number) {
        String result = "";
        if (count > 1) result = (count >= 3 ? "-" : ",") + number;
        return result;
    }
}
