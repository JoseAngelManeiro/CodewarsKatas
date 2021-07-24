import org.junit.Test;

import static org.junit.Assert.*;

public class DescendingOrderTest {

    @Test
    public void test_01() {
        assertEquals(0, DescendingOrder.sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(510, DescendingOrder.sortDesc(105));
    }

    @Test
    public void test_03() {
        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }

    @Test
    public void test_04() {
        assertEquals(2110, DescendingOrder.sortDesc(1201));
    }

}