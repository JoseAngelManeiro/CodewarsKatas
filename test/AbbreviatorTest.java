import org.junit.Test;

import static org.junit.Assert.*;

public class AbbreviatorTest {

    private Abbreviator abbr = new Abbreviator();

    @Test
    public void test1() {
        assertEquals("i18n", abbr.abbreviate("internationalization"));
    }

    @Test
    public void test2() {
        assertEquals("e6t-r3s are r4y fun!", abbr.abbreviate("elephant-rides are really fun!"));
    }

    @Test
    public void test3() {
        assertEquals("d3y-a d3y5a", abbr.abbreviate("doggy-a doggy5a"));
    }

}