import java.util.*;

// Count the number of smile faces
public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        List<String> smiles = Arrays.asList(":)", ":-)", ":~)", ";)", ";-)", ";~)", ":D", ":-D", ":~D", ";D", ";-D", ";~D");
        return (int) arr.stream().filter(smiles::contains).count();
    }
}
