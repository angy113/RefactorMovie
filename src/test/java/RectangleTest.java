import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AngelaValdez on 8/24/2016.
 */
public class RectangleTest {
    private Rectangle rectangle;
    private static final double PRECISION = 0.1;
    @Before
    public void createRectangle(){
        double minorSide = 3;
        double mayorSide = 5;
        rectangle = new Rectangle(minorSide,mayorSide);
    }

    @Test
    public void verifyRectangleCalculateAreaWhenRadioEqualsTo5(){
        double expectedResult = 15;
        assertEquals(rectangle.calculateArea(),expectedResult,PRECISION );
    }

    @Test
    public void verifyRectangleCalculatePerimeterWhenRadioEqualsTo5(){
        double expectedResult = 16;
        assertEquals(rectangle.calculatePerimeter(),expectedResult,PRECISION );
    }
}
