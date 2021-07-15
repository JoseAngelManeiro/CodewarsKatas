// A number is called Automorphic number if and only if
// its square ends in the same digits as the number itself
public class AutomorphicNumber {

    public static String autoMorphic(int number) {
        return (number * number + "").endsWith("" + number) ? "Automorphic" : "Not!!";
    }

}
