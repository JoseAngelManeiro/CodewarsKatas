import org.junit.Test;

import static org.junit.Assert.*;

public class StringyTest {

    @Test
    public void test() {
        assertEquals("1", Stringy.stringy(1));
        assertEquals("1010", Stringy.stringy(4));
        assertEquals("101010", Stringy.stringy(6));
        assertEquals("101010101010", Stringy.stringy(12));
    }

}