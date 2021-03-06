import java.util.stream.Collectors;

// In DNA string, get the other complementary side
public class DnaStrand {

    public static String makeComplement(String dna) {
        return dna.chars()
                .mapToObj(c -> (char) c)
                .map(c -> c == 'A' ? "T" : c == 'T' ? "A" : c == 'C' ? "G" : "C")
                .collect(Collectors.joining());
    }
}
