import java.util.stream.IntStream;

// Extra perfect number is the number that first and last bits are set bits
public class ExtraPerfectNumbers {

    public static int[] extraPerfect(int number) {
        return IntStream.rangeClosed(1, number)
                .mapToObj(Integer::toBinaryString)
                .filter(s -> s.startsWith("1") && s.endsWith("1"))
                .mapToInt(s -> Integer.parseInt(s, 2))
                .toArray();
    }

}
