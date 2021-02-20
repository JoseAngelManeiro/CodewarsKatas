import org.junit.Test;

import static org.junit.Assert.*;

public class FruitGuyTest {

    @Test
    public void testEmptyAndNullFruit() {
        assertTrue(FruitGuy.removeRotten(new String[0]).length == 0);
        assertTrue(FruitGuy.removeRotten(null).length == 0);
    }

    @Test
    public void testAllRottenArray() {
        String[] rotten = new String []{"rottenApple","rottenBanana","rottenApple","rottenPineapple","rottenKiwi"};
        String [] expected = new String []{"apple","banana","apple","pineapple","kiwi"};
        assertArrayEquals(expected, FruitGuy.removeRotten(rotten));
    }

}