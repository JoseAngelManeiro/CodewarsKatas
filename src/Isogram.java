// Isogram: "a word that has no repeating letters"
// Implement a function that determines whether a string that contains only letters is an Isogram
public class Isogram {

    public static boolean  isIsogram(String str) {
        return str.toLowerCase().chars().distinct().count() == str.length();
    }

}
