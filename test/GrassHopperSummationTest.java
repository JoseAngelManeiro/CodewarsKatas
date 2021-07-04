import org.junit.Test;

import static org.junit.Assert.*;

public class GrassHopperSummationTest {

    @Test
    public void test1() {
        assertEquals(1, GrassHopperSummation.summation(1));
    }
    @Test
    public void test2() {
        assertEquals(36, GrassHopperSummation.summation(8));
    }

}