import java.util.Arrays;

// Convert all rotten fruit in simple lowercase fruit
public class FruitGuy {

    public static String[] removeRotten(String[] fruitBasket) {
        if (fruitBasket == null) return new String[0];
        else return Arrays.stream(fruitBasket)
                .map(s -> s.replace("rotten", "").toLowerCase())
                .toArray(String[]::new);
    }

}
