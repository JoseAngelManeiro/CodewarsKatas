import org.junit.Test;

import static org.junit.Assert.*;

public class TidyNumberTest {

    @Test
    public void Check_Small_Values() {
        assertEquals(true,  TidyNumber.tidyNumber(12));
        assertEquals(false, TidyNumber.tidyNumber(32));
        assertEquals(true,  TidyNumber.tidyNumber(39));
    }

    @Test
    public void Check_Larger_Values() {
        assertEquals(false, TidyNumber.tidyNumber(1024));
        assertEquals(false, TidyNumber.tidyNumber(12576));
        assertEquals(true,  TidyNumber.tidyNumber(13579));
        assertEquals(true,  TidyNumber.tidyNumber(2335));
    }

}