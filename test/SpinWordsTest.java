import org.junit.Test;

import static org.junit.Assert.*;

public class SpinWordsTest {

    @Test
    public void lessThanFiveLetters() {
        assertEquals("This is a test",
                new SpinWords().spinWords("This is a test"));
    }

    @Test
    public void fiveLettersOrMore() {
        assertEquals("emocleW",
                new SpinWords().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw",
                new SpinWords().spinWords("Hey fellow warriors"));
    }

}