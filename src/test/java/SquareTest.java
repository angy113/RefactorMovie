import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
    public void verifySquareCalculateAreaWhenTheSideIsEqualsTo3() {
        final double expectedResult = 9;
        assertEquals(expectedResult,square.calculateArea(), PRECISION);
    }

    @Test
    public void verifySquareCalculatePerimeterWhenTheSideIsEqualsTo3() {
        final double expectedResult = 12;
        assertEquals(expectedResult, square.calculatePerimeter(), PRECISION);
    }
}
