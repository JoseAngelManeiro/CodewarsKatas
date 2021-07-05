import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedNumberTest {

    @Test
    public void Check_Any_One_Digit_Number() {
        assertEquals("Balanced", BalancedNumber.balancedNum(1));
        assertEquals("Balanced", BalancedNumber.balancedNum(7));
    }

    @Test
    public void Check_Any_Two_Digit_Number() {
        assertEquals("Balanced", BalancedNumber.balancedNum(11));
        assertEquals("Balanced", BalancedNumber.balancedNum(98));
    }

    @Test
    public void Check_Balanced_Odd_Numbers() {
        assertEquals("Balanced", BalancedNumber.balancedNum(959));
        assertEquals("Balanced", BalancedNumber.balancedNum(424));
    }

    @Test
    public void Check_Not_Balanced_Odd_Numbers() {
        assertEquals("Not Balanced", BalancedNumber.balancedNum(432));
        assertEquals("Not Balanced", BalancedNumber.balancedNum(66545));
    }

    @Test
    public void Check_Balanced_Even_Numbers() {
        assertEquals("Balanced", BalancedNumber.balancedNum(473492));
        assertEquals("Balanced", BalancedNumber.balancedNum(56239814));
    }

    @Test
    public void Check_Not_Balanced_Even_Numbers() {
        assertEquals("Not Balanced", BalancedNumber.balancedNum(295591));
        assertEquals("Not Balanced", BalancedNumber.balancedNum(1024));
    }
}