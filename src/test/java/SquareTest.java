import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AngelaValdez on 8/24/2016.
 */
public class SquareTest {
    private Square square;
    private static final double PRECISION = 0.1;
    @Before
    public void createSquare(){
        double side = 3;
        square = new Square(side);
    }

    @Test
    public void verifySquareCalculateAreaWhenRadioEqualsTo5(){
        double expectedResult = 9;
        assertEquals(square.calculateArea(),expectedResult,PRECISION);
    }

    @Test
    public void verifySquareCalculatePerimeterWhenRadioEqualsTo5(){
        double expectedResult = 12;
        assertEquals(square.calculatePerimeter(),expectedResult,PRECISION);
    }
}
