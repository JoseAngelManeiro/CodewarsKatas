import org.junit.Test;

import static org.junit.Assert.*;

public class CorrectMistakesTest {

    @Test
    public void testSomething() {
        assertEquals("IF-RUDYARD KIPLING", CorrectMistakes.correct("1F-RUDYARD K1PL1NG"));
        assertEquals("ROBERT MERLE - THE DAY OF THE DOLPHIN", CorrectMistakes.correct("R0BERT MERLE - THE DAY 0F THE D0LPH1N"));
        assertEquals("RICHARD P. FEYNMAN - THE FEYNMAN LECTURES ON PHYSICS", CorrectMistakes.correct("R1CHARD P. FEYNMAN - THE FEYNMAN LECTURE5 0N PHY51C5"));
        assertEquals("RICHARD P. FEYNMAN - STATISTICAL MECHANICS", CorrectMistakes.correct("R1CHARD P. FEYNMAN - 5TAT15T1CAL MECHAN1C5"));
        assertEquals("STEPHEN HAWKING - A BRIEF HISTORY OF TIME", CorrectMistakes.correct("5TEPHEN HAWK1NG - A BR1EF H15T0RY 0F T1ME"));
        assertEquals("STEPHEN HAWKING - THE UNIVERSE IN A NUTSHELL", CorrectMistakes.correct("5TEPHEN HAWK1NG - THE UN1VER5E 1N A NUT5HELL"));
        assertEquals("ERNEST HEMINGWAY - A FARWELL TO ARMS", CorrectMistakes.correct("ERNE5T HEM1NGWAY - A FARWELL T0 ARM5"));
        assertEquals("ERNEST HEMINGWAY - FOR WHOM THE BELL TOLLS", CorrectMistakes.correct("ERNE5T HEM1NGWAY - F0R WH0M THE BELL T0LL5"));
        assertEquals("ERNEST HEMINGWAY - THE OLD MAN AND THE SEA", CorrectMistakes.correct("ERNE5T HEM1NGWAY - THE 0LD MAN AND THE 5EA"));
        assertEquals("J. R. R. TOLKIEN - THE LORD OF THE RINGS", CorrectMistakes.correct("J. R. R. T0LK1EN - THE L0RD 0F THE R1NG5"));
      }
}