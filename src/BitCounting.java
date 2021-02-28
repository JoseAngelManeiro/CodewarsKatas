// Count the number of bits equal to one in the binary representation
// This solution could be even simpler: Integer.bitCount(n)
public class BitCounting {

    public static int countBits(int n){
        return (int) Integer.toBinaryString(n).chars().filter(ch -> ch == '1').count();
    }
}
