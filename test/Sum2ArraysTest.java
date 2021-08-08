import org.junit.Test;

import static org.junit.Assert.*;

public class Sum2ArraysTest {

    @Test
    public void sampleTests() {
        assertEquals(21,
                Sum2Arrays.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
        assertEquals(-21,
                Sum2Arrays.arrayPlusArray(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
        assertEquals(15,
                Sum2Arrays.arrayPlusArray(new int[]{0,0,0}, new int[]{4,5,6}));
        assertEquals(2100,
                Sum2Arrays.arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600}));
    }

}