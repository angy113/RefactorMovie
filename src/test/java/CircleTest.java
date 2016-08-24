import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
/**
 * Created by AngelaValdez on 8/24/2016.
 */
public class CircleTest {
    private Circle circle;
    private static final double PRECISION = 0.1;
    @Before
    public void createCircle(){
        double radio = 5;
        circle = new Circle(5);
    }

    @Test
    public void verifyCircleCalculateAreaWhenRadioEqualsTo5(){
        double expectedResult = 20.7;
        assertEquals(circle.calculateArea(),expectedResult,PRECISION );
    }

    @Test
    public void verifyCircleCalculatePerimeterWhenRadioEqualsTo5(){
        double expectedResult = 31.4;
        assertEquals(circle.calculatePerimeter(),expectedResult,PRECISION );
    }
}
