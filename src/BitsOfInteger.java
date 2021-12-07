// Write a function that reverses the bits in an integer.
public class BitsOfInteger {

    public static int reverse_bits(int n) {
        return Integer.parseInt(new StringBuilder(Integer.toBinaryString(n)).reverse().toString(), 2);
    }

}
