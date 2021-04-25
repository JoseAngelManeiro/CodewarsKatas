import org.junit.Test;

import static org.junit.Assert.*;

public class SumKataTest {
    @Test
    public void BasicTests() {
        assertEquals(16, SumKata.sum(new int[] { 6, 2, 1, 8, 10}));
    }
}