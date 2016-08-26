import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AngelaValdez on 8/24/2016.
 */

/**
 * Test for {@link Square}
 */
public class SquareTest {
    private static final double PRECISION = 0.1;
    private Shape square;

    @Before
    public void setUo() {
        final double side = 3;
        square = new Square(side);
    }

    @Test
    public void verifySquareCalculateAreaWhenRadioEqualsTo5() {
        final double expectedResult = 9;
        assertEquals(expectedResult,square.calculateArea(), PRECISION);
    }

    @Test
    public void verifySquareCalculatePerimeterWhenRadioEqualsTo5() {
        final double expectedResult = 12;
        assertEquals(expectedResult, square.calculatePerimeter(), PRECISION);
    }
}
