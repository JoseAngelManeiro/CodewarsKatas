// Count the number of letters in a String that are not in the range a-m
public class Printer {

    public static String printerError(String s) {
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }
}
