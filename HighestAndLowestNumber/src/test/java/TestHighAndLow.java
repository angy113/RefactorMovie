import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link HighAndLow}
 */
public class TestHighAndLow {
    @Test
    public void obtainTheHighestAndLowest_whenSendANormalString() {
        final String expected = "5 1";
        final String actual = HighAndLow.highestAndLowest("1 2 3 4 5");
        assertEquals(expected, actual);
    }

    @Test
    public void obtainTheHighestAndLowest_whenSendStringWithANegativeNumber() {
        final String expected = "5 -3";
        final String actual = HighAndLow.highestAndLowest("1 2 -3 4 5");
        assertEquals(expected, actual);
    }

    @Test
    public void obtainTheHighestAndLowest_whenSendAnotherExample() {
        final String expected = "9 -5";
        final String actual = HighAndLow.highestAndLowest("1 9 3 4 -5");
        assertEquals(expected, actual);
    }
}
