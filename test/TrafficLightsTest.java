import org.junit.Test;

import static org.junit.Assert.*;

public class TrafficLightsTest {

    @Test
    public void redToGreen() {
        assertEquals("green", TrafficLights.updateLight("red"));
    }

    @Test
    public void greenToYellow() {
        assertEquals("yellow", TrafficLights.updateLight("green"));
    }

    @Test
    public void yellowToRed() {
        assertEquals("red", TrafficLights.updateLight("yellow"));
    }
}