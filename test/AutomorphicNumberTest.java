import org.junit.Test;

import static org.junit.Assert.*;

public class AutomorphicNumberTest {

    @Test
    public void One_Digit_Number() {
        assertEquals("Automorphic", AutomorphicNumber.autoMorphic(1));
        assertEquals("Not!!",       AutomorphicNumber.autoMorphic(3));
        assertEquals("Automorphic", AutomorphicNumber.autoMorphic(6));
        assertEquals("Not!!",       AutomorphicNumber.autoMorphic(9));
    }

    @Test
    public void Two_Digit_Number() {
        assertEquals("Automorphic", AutomorphicNumber.autoMorphic(25));
        assertEquals("Not!!",       AutomorphicNumber.autoMorphic(13));
        assertEquals("Automorphic", AutomorphicNumber.autoMorphic(76));
        assertEquals("Not!!",       AutomorphicNumber.autoMorphic(95));
    }

    @Test
    public void Larger_Number() {
        assertEquals("Automorphic", AutomorphicNumber.autoMorphic(625));
        assertEquals("Not!!",       AutomorphicNumber.autoMorphic(225));
        assertEquals("Not!!",       AutomorphicNumber.autoMorphic(425));
        assertEquals("Not!!",       AutomorphicNumber.autoMorphic(399));
    }

}