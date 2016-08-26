import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AngelaValdez on 8/24/2016.
 */

/**
 * Test for {@link Rectangle}
 */
public class RectangleTest {

    private static final double PRECISION = 0.1;

    private Shape rectangle;

    @Before
    public void setUp() {
        final double minorSide = 3;
        final double mayorSide = 5;
        rectangle = new Rectangle(minorSide, mayorSide);
    }

    @Test
    public void test_rectangleCalculateArea_whenRadioEqualsTo5() {
        final double expectedResult = 15;
        assertEquals(expectedResult, rectangle.calculateArea(), PRECISION);
    }

    @Test
    public void test_rectangleCalculatePerimeter_whenRadioEqualsTo5() {
        final double expectedResult = 16;
        assertEquals(expectedResult, rectangle.calculatePerimeter(), PRECISION);
    }
}
