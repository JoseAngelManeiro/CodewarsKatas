import org.junit.Test;

import static org.junit.Assert.*;

public class ExtraPerfectNumbersTest {

    @Test
    public void Check_Small_Positive_Values() {
        assertArrayEquals(new int[]{1,3},
                ExtraPerfectNumbers.extraPerfect(3));
        assertArrayEquals(new int[]{1,3,5},
                ExtraPerfectNumbers.extraPerfect(5));
        assertArrayEquals(new int[]{1,3,5,7},
                ExtraPerfectNumbers.extraPerfect(8));
    }

    @Test
    public void Check_Larger_Positive_Values() {
        assertArrayEquals(new int[]{1,3,5,7,9,11,13,15,17,19,21,23,25,27},
                ExtraPerfectNumbers.extraPerfect(28));
        assertArrayEquals(new int[]{1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39},
                ExtraPerfectNumbers.extraPerfect(39));
    }

}