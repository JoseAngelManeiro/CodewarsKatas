import org.junit.Test;

import static org.junit.Assert.*;

public class TimeFormatterTest {

    @Test
    public void testNow() {
        assertEquals("now", TimeFormatter.formatDuration(0));
    }

    @Test
    public void testSeconds() {
        assertEquals("1 second", TimeFormatter.formatDuration(1));
        assertEquals("3 seconds", TimeFormatter.formatDuration(3));
    }

    @Test
    public void testSecondsAndMinutes() {
        assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
        assertEquals("2 minutes", TimeFormatter.formatDuration(120));
        assertEquals("2 minutes and 1 second", TimeFormatter.formatDuration(121));
    }

    @Test
    public void testSecondsMinutesAndHours() {
        assertEquals("1 hour", TimeFormatter.formatDuration(3600));
        assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));
    }

    @Test
    public void testSecondsMinutesHoursAndDays() {
        assertEquals("1 day", TimeFormatter.formatDuration(86400));
        assertEquals("1 day, 2 hours, 23 minutes and 20 seconds", TimeFormatter.formatDuration(95000));
    }

    @Test
    public void testSecondsMinutesHoursDaysAndYears() {
        assertEquals("1 year", TimeFormatter.formatDuration(31536000));
    }

}