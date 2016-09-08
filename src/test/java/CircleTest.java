import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link Circle}
 */
public class CircleTest {

    private static final double PRECISION = 0.1;

    private Shape circle;

    @Before
    public void setUp() {
        final double radio = 5;
        circle = new Circle(radio);
    }

    @Test
    public void test_circleCalculateArea_whenRadioEqualsTo5() {
        final double expectedResult = 78.53;
        assertEquals(circle.calculateArea(), expectedResult, PRECISION);
    }

    @Test
    public void test_circleCalculatePerimeter_whenRadioEqualsTo5() {
        final double expectedResult = 31.4;
        assertEquals(circle.calculatePerimeter(), expectedResult, PRECISION);
    }
}
